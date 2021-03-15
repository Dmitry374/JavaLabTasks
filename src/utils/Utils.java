package utils;

public class Utils {

    public static int getRandomNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static double round(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
