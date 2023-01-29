package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Honda implements Car {

    private int speed;

    public Honda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 50;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 60;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honda honda = (Honda) o;
        return speed == honda.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
