package Chapter8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int second, int minute) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59){
            throw new IllegalArgumentException("Hour, Minute or Second not valid");
        }
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public int Time2(int hour, int minute, int second){
        if (hour > 23) hour = 0;
        if (minute > 59) {
            minute = 0;
            hour++;
        }
        if (second > 59) {
            second = 0;
            minute++;
        }
        return hour + minute + second;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >23){
            throw new IllegalArgumentException("Hour is invalid");
        }
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59){
            throw new IllegalArgumentException("Second is invalid");
        }
        this.second = second;
    }

    public int getMinute() {
        return second;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59){
            throw new IllegalArgumentException("Minute is invalid");
        }
        this.second = minute;
    }


    public String toUniversalString() {
        return String.format("%02d : %02d : %02d ", getHour(), getMinute(), getSecond());
    }
    public String toString(){
        return String.format("%d : %02d : %02d %s ", ((getHour() == 0) ? 12 : getHour() % 12), getMinute(), getSecond(),
        (getHour() < 12 ? "AM" : "PM"));
    }
}
