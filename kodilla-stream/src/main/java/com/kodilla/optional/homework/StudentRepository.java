package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ann", new Teacher("Robert Lewandowski")));
        studentList.add(new Student("Josua", new Teacher("Philipp Lam")));
        studentList.add(new Student("Barbra", new Teacher("John Newman")));
        studentList.add(new Student("Tony", null));
        studentList.add(new Student("Bjorn", new Teacher("Ragnar Lothbrock")));
        studentList.add(new Student("John", null));
        studentList.add(new Student("Ragnar", new Teacher("Odin Allfather")));
        studentList.add(new Student("Harry", new Teacher("Albus Dumbledore")));
        studentList.add(new Student("Elon", null));
        studentList.add(new Student("Bilon", null));

        return studentList;
    }
}
