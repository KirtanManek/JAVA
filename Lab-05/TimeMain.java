/* 2. Define Time class with constructor to initialize hour and minute. Also define addition method to add two time objects. */

package java_classes;

class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void add(Time temp) {
        this.second += temp.second;
        while (this.second >= 60) {
            this.minute++;
            this.second -= 60;
        }

        this.minute += temp.minute;
        while (this.minute >= 60) {
                this.hour++;
                this.minute -= 60;
        }

        this.hour += temp.hour;
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time t1 = new Time(1,20,100);
        Time t2 = new Time(5,67,78);

        t1.add(t2);

        System.out.println(t1.hour + ":" + t1.minute + ":" + t1.second);
    }
}
