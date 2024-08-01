package week_5;

import java.util.Scanner;

/* 
Create a class called Time, which has three private instance variables – hour, min and 
sec. It contains a method called add( ) which takes one Time object as parameter and 
print the added value of the calling Time object and passes Time object. In the main
method, declare two Time objects and assign values using constructor and call the add() 
method.
*/
class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void add(Time other) {
        int newHour = this.hour + other.hour;
        int newMin = this.min + other.min;
        int newSec = this.sec + other.sec;

        if (newSec >= 60) {
            newMin += newSec / 60;
            newSec %= 60;
        }
        if (newMin >= 60) {
            newHour += newMin / 60;
            newMin %= 60;
        }
        if (newHour >= 24) {
            newHour %= 24;
        }

        System.out.println("Added Time: " + newHour + " hours " + newMin + " minutes " + newSec + " seconds");
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Time:");
        System.out.print("Hour: ");
        int hour = sc.nextInt();
        System.out.print("Minute: ");
        int min = sc.nextInt();
        System.out.print("Second: ");
        int sec = sc.nextInt();
        Time time1 = new Time(hour, min, sec);
        System.out.println("Enter 2nd Time:");
        System.out.print("Hour: ");
        hour = sc.nextInt();
        System.out.print("Minute: ");
        min = sc.nextInt();
        System.out.print("Second: ");
        sec = sc.nextInt();
        sc.close();
        Time time2 = new Time(hour, min, sec);

        time1.add(time2);
    }
}