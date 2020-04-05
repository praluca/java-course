package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(long min, long sec) {
        if(min >= 0 && sec >= 0 && sec <=59) {
            long totalHours = min / 60;
            long totalMinutes = min  % 60;

            return totalHours + " hh " + totalMinutes + " min " + sec + " sec";
        } else {
            return "Invalid value";
        }
    }
    public static String getDurationString(int sec) {
        if(sec < 0) {
            return "Invalid value ";
        } else {
            long min = sec / 60;
            long remainingSec = sec % 60;
           return getDurationString(min, remainingSec);
        }

    }

}
