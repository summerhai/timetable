package com.canghailongyin.dao;

import com.canghailongyin.pojo.Student;

import java.util.List;

/**
 * Created by mingyue on 2017/6/27.
 */
public interface StudentDAO {

    void insertStudent(Student student);

    void deleteStudent(Integer s_id);

    void updateStudent(Student student);

    Student selectStudentByID(Integer s_id);

    Student selectStudentByName(String s_name);

    List<Student> selectAllStudents();
    //按班级
    List<Student> selectStudentsByClass(Integer cl_id);
    //按课程
    List<Student> selectStudentsByCourse(Integer co_id);
    //按年级
    List<Student> selectStudentsByYear(Integer year);
}
