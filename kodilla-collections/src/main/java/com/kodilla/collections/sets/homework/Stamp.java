package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double width;
    private double height;
    private boolean stamped;

    public Stamp(String stampName, double width, double height, boolean stamped) {
        this.stampName = stampName;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 && Double.compare(stamp.height, height) == 0 && stamped == stamp.stamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, width, height, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stamped=" + stamped +
                '}';
    }
}
