package storetesting.utils;

public class Wait {
    public  static void Time(int mill){
        try {
            Thread.sleep(mill);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
