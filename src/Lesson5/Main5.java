package Lesson5;


class Outer5
{
    private void outerFn()
    { 
        System.out.println("outerFn");
    }
    class Middler5
    {
        private void middlerFn()
        {
            System.out.println("middlerFn");

            outerFn();  // which is equals to Outer5.this.outerFn();
        }
        class Inner5
        {
            private void innerFn()
            {
                System.out.println("innerFn");
                outerFn();
                middlerFn();   // Outer5.Middler5.middleFn();
            }
        }
    }

}



public class Main5 {
    public static void main(String[] args) {

    }
}
