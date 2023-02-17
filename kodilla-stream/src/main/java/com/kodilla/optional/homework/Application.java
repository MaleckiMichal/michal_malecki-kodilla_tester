package com.kodilla.optional.homework;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        showStudentTeacherPairs();
    }


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

//    public static void showStudentTeacherPairs() {
//        List<Student> studentList = StudentRepository.getStudentList();
////        List<Student> studentTeacherPair = new ArrayList<>();
//        for (Student student : studentList) {
//            Optional<Student> optionalStudent = Optional.ofNullable(student);
//            Teacher teacher =
//                    optionalStudent.orElse(new Student("",new Teacher("<undefined>"))).getTeacher();
////            studentTeacherPair.add(new Student(student.getName(), teacher));
////            System.out.println(studentTeacherPair);
//            System.out.println("student: " + student.getName() + " teacher: " + student.getTeacher().getName());
//        }
//    }
}
