package com.julyerr.jdbcTemplate.dao;

import com.julyerr.jdbcTemplate.model.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {
    public void setDataSource(DataSource ds);

    public void addstudent(Student student);

    public void delstudentbyID(String ID);

    public void delstudentbyname(String name);

    public void delallstudent();

    public void updstudent(Student student);

    public List<Student> allstudent();

    public List<Student> querystudentbyID(String ID);

    public List<Student> querystudentbyname(String name);

    public List<Student> querystudentbyage(int age);
}
