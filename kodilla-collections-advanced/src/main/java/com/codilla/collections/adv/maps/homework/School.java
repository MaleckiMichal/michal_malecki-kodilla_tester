package com.codilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<String> students;

    public School(List<String> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    public List<String> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
