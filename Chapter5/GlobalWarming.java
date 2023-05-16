package Chapter5;

import java.util.Date;
import java.util.Scanner;

public class GlobalWarming {
    private int correctAnswer;
    private int wrongAnswer;
    private String choice;
    private final Date date = new Date();
    Scanner in = new Scanner(System.in);

    public GlobalWarming() {
    }

    public void question1(){
        System.out.println("""
                welcome to global warming quiz \nAttempt all questions 1 - 5
                1. What are green house gasses
                a). carbon dioxide
                b). nitrogen dioxide
                c). carbon monoxide
                d). zinc
                """);
        choice = in.next();
        if (choice.equalsIgnoreCase("c")) {
            correctAnswer += 1;
            System.out.println("Correct!");
        }else {
            wrongAnswer += 1;
            System.out.println("Wrong answer");
        }
    }
    public void question2(){
        System.out.println("""
                2. Ozone layer
                a). prevents harmful rays from the sun
                b). supports the gravity
                c). strengthens the sun
                d). blows the earth
                """);
        choice = in.next();
        if (choice.equalsIgnoreCase("a")) {
            correctAnswer += 1;
            System.out.println("Correct!");
        }else {
            wrongAnswer += 1;
            System.out.println("Wrong answer");
        }
    }

    public void question3(){
        System.out.println("""
                3.  Atmospheric air is made up of
                a). 40% zinc
                b). 78% nitrogen
                c). 95% carbon
                d). 98% oxygen
                """);
        choice = in.next();
        if (choice.equalsIgnoreCase("b")) {
            correctAnswer += 1;
            System.out.println("Correct!");
        }else {
            wrongAnswer += 1;
            System.out.println("Wrong answer");
        }
    }

    public void question4(){
        System.out.println("""
                4. Carbon 2 oxide is
                a). poisonous
                b). nutritious
                c). from the sun
                d). cools the earth
                """);
        choice = in.next();
        if (choice.equalsIgnoreCase("a")) {
            correctAnswer += 1;
            System.out.println("Correct!");
        }else {
            wrongAnswer += 1;
            System.out.println("Wrong answer");
        }

    }

    public void question5(){
        System.out.println("""
                5.  Sunlight takes about
                a). 5 minutes to reach the earth
                b). 1 minutes to reach the earth
                c). 3 minutes to reach the earth
                d). 8 minutes to reach the earth
                """);

        choice = in.next();
        if (choice.equalsIgnoreCase("d")) {
            correctAnswer += 1;
            System.out.println("Correct!");
        }else {
            wrongAnswer += 1;
            System.out.println("Wrong answer");
        }
    }
    public void getCounter(){
        if (correctAnswer == 5){
            System.out.println("Excellent, you got the whole " + correctAnswer + " correctly " );
        } else if (correctAnswer == 4){
            System.out.println("Very good, you got " + correctAnswer + " correctly ");
        } else {
            System.out.println("It's time to rush up on your knowledge of global warming ");
        }
            if (correctAnswer + wrongAnswer == 5){
                correctAnswer = 0;
                wrongAnswer = 0;
            }

    }

    public void loop(){
        System.out.println("Welcome to our little Global Warming quiz \nPlease enter your name");
        String name = in.next();
        System.out.println("Dear " + name + " good luck on trying out our little quiz");
        question1();
        question2();
        question3();
        question4();
        question5();
        getCounter();

        do {

            System.out.println("Do you wish to continue ?\n Yes            No");
            choice = in.next();
            if (choice.equalsIgnoreCase("yes")){
                question1();
                question2();
                question3();
                question4();
                question5();
                getCounter();
            } else {
                System.out.println("Thank you! " + name );
            }
        }while (choice.equalsIgnoreCase("yes"));
        System.out.println("Thanks for your time " + name +"\n" + date);
    }
}
