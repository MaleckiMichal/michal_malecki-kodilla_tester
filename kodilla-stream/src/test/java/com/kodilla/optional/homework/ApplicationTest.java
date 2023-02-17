package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void testGetStudentTeacherPairs() {
        // given
        List<Student> studentList = StudentRepository.getStudentList();
        // when
        List<Student> result = Application.getStudentTeacherPairs();
        // then
        List<Student> expected = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getTeacher() == null) {
                expected.add(new Student(student.getName(),new Teacher("<undefined>")));
            } else {
                expected.add(student);
            }
        }
        assertEquals(expected,result);
    }

    @Test
    public void testQuantityUndefinedTeachersGetStudentTeacherPairs() {
        // given
        List<Student> result = new ArrayList<>();
        // when
        List<Student> resultStudentList = Application.getStudentTeacherPairs();
        // then
        for (Student student : resultStudentList) {
            if (student.getTeacher().getName() == "<undefined>") {
                result.add(student);
            }
        }
        assertEquals(4, result.size());
    }

}