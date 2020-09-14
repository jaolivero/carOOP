package com.carObject;

public class Birthdate {
    private int month;
    private int day;
    private int year;

    public Birthdate(int m, int d, int y) {
        month = m;
        day = d;
        year= y;
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
