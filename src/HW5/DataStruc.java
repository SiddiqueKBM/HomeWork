package HW5;

public class DataStruc {
    Data1 ds1 = new Data1();

    public static int a = 100;

    public  void pnt() {
        System.out.println("It's from pnt  " +a);
        ds1.pnt2();
    }
    public static void pnt1() {
        System.out.println("It's from pnt 1 " +a);

    }


    public static class Data1 {


        private static void pnt2() {
            System.out.println("It's from pnt 2 "+a);

        }
    }
}
