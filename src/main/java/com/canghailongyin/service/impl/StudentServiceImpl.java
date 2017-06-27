package com.canghailongyin.service.impl;

import com.canghailongyin.dao.StudentDAO;
import com.canghailongyin.pojo.Student;
import com.canghailongyin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mingyue on 2017/6/27.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;
    @Override
    public void addStudent(Student student) {
        studentDAO.insertStudent(student);
    }

    @Override
    public void deleteStudent(Integer s_id) {
        studentDAO.deleteStudent(s_id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public Student getStudentByID(Integer s_id) {
        return studentDAO.selectStudentByID(s_id);
    }

    @Override
    public Student getStudentByName(String s_name) {
        return studentDAO.selectStudentByName(s_name);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.selectAllStudents();
    }

    @Override
    public List<Student> getStudentsByClass(Integer cl_id) {
        return studentDAO.selectStudentsByClass(cl_id);
    }

    @Override
    public List<Student> getStudentsByCourse(Integer co_id) {
        return studentDAO.selectStudentsByCourse(co_id);
    }

    @Override
    public List<Student> getStudentsByYear(Integer year) {
        return studentDAO.selectStudentsByYear(year);
    }
}
