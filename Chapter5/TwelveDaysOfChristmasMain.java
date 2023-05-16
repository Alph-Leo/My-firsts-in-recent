package Chapter5;

import javax.swing.*;

public class TwelveDaysOfChristmasMain {
    private static int days;

    private static final
    TwelveDaysOfChristmasSongs twelveDaysOfChristmasSongs = new TwelveDaysOfChristmasSongs();

    public static void main(String[] args) {

        days = Integer.parseInt(input("Enter day"));
        display(String.valueOf(days));
        while (days != -1){
            if (days > 12 || days < 0) throw new IllegalArgumentException("Days is from 1 to 12 ");

            switch (days) {
                case 1 -> {
                    days = Integer.parseInt(input(("on the first day of Christmas \nmy true love sent to me: " + firstDay())));
                    display(String.valueOf(days));
                }
                case 2 -> {
                    days = Integer.parseInt(input(("on the second day of Christmas \nmy true love sent to me: " + secondDay())));
                    display(String.valueOf(days));
                }
                case 3 -> {
                    days = Integer.parseInt(input("on the third day of Christmas \nmy true love sent to me: "));
                    display(days + thirdDay());
                }
                case 4 -> {
                    days = Integer.parseInt(input(("on the fourth day of Christmas \nmy true love sent to me: ")));
                    display(days + fourthDay());
                }
                case 5 -> {
                    days = Integer.parseInt(input(("on the fifth day of Christmas \nmy true love sent to me: ")));
                    display(days + fifthDay());
                }
                case 6 -> {
                    days = Integer.parseInt(input("on the sixth day of Christmas \nmy true love sent to me: "));
                    display(days + sixthDay());
                }
                case 7 -> {
                    days = Integer.parseInt(input(("on the seventh day of Christmas \nmy true love sent to me: ")));
                    display(days + seventhDay());
                }
                case 8 -> {
                    days = Integer.parseInt(input(("on the eighth day of Christmas \nmy true love sent to me: ")));
                    display(days + eighthDay());
                }
                case 9 -> {
                    days = Integer.parseInt(input(("on the ninth day of Christmas \nmy true love sent to me: ")));
                    display(days + ninthDay());
                }
                case 10 -> {
                    days = Integer.parseInt(input(("on the tenth day of Christmas \nmy true love sent to me: ")));
                    display(days + tenthDay());
                }
                case 11 -> {
                    days = Integer.parseInt(input(("on the eleventh day of Christmas \nmy true love sent to me: ")));
                    display(days + eleventhDay());
                }
                case 12 -> {
                    days = Integer.parseInt(input(("on the twelfth day of Christmas \nmy true love sent to me: ")));
                    display(days + twelfthDay());
                }
            }
        }
    }


    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    private static String firstDay(){
        twelveDaysOfChristmasSongs.dayOne();
        return "";
    }
    private static String secondDay(){
        twelveDaysOfChristmasSongs.dayTwo();
        return "";
    }
    private static String thirdDay(){
        twelveDaysOfChristmasSongs.dayThree();
        return "";
    }
    private static String fourthDay(){
        twelveDaysOfChristmasSongs.dayFour();
        return "";
    }
    private static String fifthDay(){
        twelveDaysOfChristmasSongs.dayFive();
        return "";
    }
    private static String sixthDay(){
        twelveDaysOfChristmasSongs.daySix();
        return "";
    }
    private static String seventhDay(){
        twelveDaysOfChristmasSongs.daySeven();
        return "";
    }
    private static String eighthDay(){
        twelveDaysOfChristmasSongs.dayEight();
        return "";
    }
    private static String ninthDay(){
        twelveDaysOfChristmasSongs.dayNine();
        return "";
    }
    private static String tenthDay(){
        twelveDaysOfChristmasSongs.dayTen();
        return "";
    }
    private static String eleventhDay(){
        twelveDaysOfChristmasSongs.dayEleven();
        return "";
    }
    private static String twelfthDay(){
        twelveDaysOfChristmasSongs.dayTwelve();
        return "";
    }

}
