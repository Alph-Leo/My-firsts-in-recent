package Chapter8;

public class TimeMain {

    public static void main(String[] args) {

        Time time = new Time(12, 59, 59);
        int myTime = time.Time2(14, 6, 60 );
        displayTime(time, myTime);
    }
    private static void displayTime(Time t, int time){
        System.out.printf("%s%n    %s%n", t.toString(), t.toUniversalString());
    }
}
