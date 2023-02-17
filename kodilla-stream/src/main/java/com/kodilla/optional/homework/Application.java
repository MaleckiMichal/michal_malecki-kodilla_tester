package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        showStudentTeacherPairs();
    }

                              // method below is just to show pair in console
    public static void showStudentTeacherPairs() {
        List<Student> studentList = StudentRepository.getStudentList();
        for (Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacher =
                    optionalTeacher.orElse(new Teacher("<undefined>"));

            System.out.println("student: " + student.getName() + " teacher: " + teacher.getName());
        }
    }

    public static List<Student> getStudentTeacherPairs() {
        List<Student> studentList = StudentRepository.getStudentList();
        List<Student> studentsTeacher = new ArrayList<>();
        for (Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacher =
                    optionalTeacher.orElse(new Teacher("<undefined>"));
            studentsTeacher.add(new Student(student.getName(), teacher));
        }
        return studentsTeacher;
    }
}
