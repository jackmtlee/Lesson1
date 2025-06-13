public class Selection
{
    public static void main(String[] args)
    {
        switchStatement();
    }
    private static void ifStatement()
    {
        // Simulated sensor readings
        int temperature = 28;   // in °C
        int humidity    = 75;   // in %

        // Decision logic
        if (temperature > 30 && humidity > 70) {
            System.out.println("Action: Turn on AC and dehumidifier.");
        }
        else if (temperature > 30) {
            System.out.println("Action: Turn on AC.");
        }
        else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Action: Comfortable range—system idle.");
        }
        else if (temperature < 20 && humidity > 60) {
            System.out.println("Action: Turn on heater and humidifier.");
        }
        else if (temperature < 20) {
            System.out.println("Action: Turn on heater.");
        }
        else {
            System.out.println("Action: Monitoring sensors—no change.");
        }
    }
    private static void switchStatement()
    {
        int score = 99;
        int choice = score/10;
        char grade;
        switch(choice)
        {
            case 10:
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0: grade = 'E'; break;
        }
    }
}
