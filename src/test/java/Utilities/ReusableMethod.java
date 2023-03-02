package Utilities;

public class ReusableMethod {

    public static void sleep (int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }

    }
}
