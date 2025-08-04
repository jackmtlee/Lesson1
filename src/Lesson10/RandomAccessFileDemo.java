package Lesson10;

import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileDemo {

    // Write a fixed-length string (pad with spaces if needed)
    private static void writeFixedString(String s, int length, RandomAccessFile raf) throws IOException {
        StringBuilder sb = new StringBuilder(s);
        if (sb.length() > length) {
            sb.setLength(length);
        } else {
            while (sb.length() < length) {
                sb.append(" ");
            }
        }
        raf.writeChars(sb.toString());
    }

    // Read a fixed-length string
    private static String readFixedString(int length, RandomAccessFile raf) throws IOException {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = raf.readChar();
            sb.append(c);
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String fileName = "students.dat";

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {

            // WRITE three records
            raf.seek(0);  // Start at beginning
            writeRecord(raf, 1, "Alice", 87.5);
            writeRecord(raf, 2, "Bob", 91.0);
            writeRecord(raf, 3, "Charlie", 78.2);

            // READ all records
            System.out.println("All records:");
            raf.seek(0);
            for (int i = 0; i < 3; i++) {
                readRecord(raf);
            }

            // UPDATE Bob's score (record #2)
            long bobPosition = 52L;  // record 1 = 0, record 2 = 52
            raf.seek(bobPosition + 44); // Skip ID (4) + Name (40), now at score
            raf.writeDouble(95.5);

            // READ again to confirm change
            System.out.println("\nAfter updating Bob's score:");
            raf.seek(0);
            for (int i = 0; i < 3; i++) {
                readRecord(raf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeRecord(RandomAccessFile raf, int id, String name, double score) throws IOException {
        raf.writeInt(id);
        writeFixedString(name, 20, raf);  // 20 chars = 40 bytes
        raf.writeDouble(score);
    }

    private static void readRecord(RandomAccessFile raf) throws IOException {
        int id = raf.readInt();
        String name = readFixedString(20, raf);
        double score = raf.readDouble();
        System.out.printf("ID: %d, Name: %-10s, Score: %.2f%n", id, name, score);
    }
}
