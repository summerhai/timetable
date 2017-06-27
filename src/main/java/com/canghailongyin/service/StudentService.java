package com.canghailongyin.service;

import com.canghailongyin.pojo.Student;

import java.util.List;

/**
 * Created by mingyue on 2017/6/27.
 */
public interface StudentService {

    void addStudent(Student student);

    void deleteStudent(Integer s_id);

    void updateStudent(Student student);

    Student getStudentByID(Integer s_id);

    Student getStudentByName(String s_name);

    List<Student> getAllStudents();
    //按班级
    List<Student> getStudentsByClass(Integer cl_id);
    //按课程
    List<Student> getStudentsByCourse(Integer co_id);
    //按年级
    List<Student> getStudentsByYear(Integer year);
}
