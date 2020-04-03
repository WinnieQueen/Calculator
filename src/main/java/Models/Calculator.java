package Models;

import java.text.DecimalFormat;

public class Calculator {

    public static double add(double firstNum, double secondNum) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(firstNum + secondNum));
    }

    public static double subtract(double firstNum, double secondNum) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(firstNum - secondNum));
    }

    public static double multiply(double firstNum, double secondNum) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(firstNum * secondNum));
    }

    public static double divide(double firstNum, double secondNum) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(firstNum / secondNum));
    }

}
