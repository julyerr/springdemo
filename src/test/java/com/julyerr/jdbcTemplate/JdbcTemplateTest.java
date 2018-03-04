package com.julyerr.jdbcTemplate;

import com.julyerr.jdbcTemplate.dao.Impl.StudentDaoImpl;
import com.julyerr.jdbcTemplate.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {

    @Test
    public void testJdbcTemplateTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDaoImpl studentDaoImp = (StudentDaoImpl) context.getBean("studentDaoImpl");


        String[] ID = { "2008", "2009", "2010", "1990", "2015","2018" };
        String[] name = { "Wang", "Hui", "Yu", "Yuan", "Yuan", "Yang"};
        int[] age = { 16, 18, 20, 20, 22, 21 };
        String[] FM = {"F", "F", "M", "M", "M", "F"};
        Student student = null;
        List<Student> students = null;

        System.out.println("---------addstudent-------------");
        for(int i=0; i<ID.length; i++){
            student = new Student(ID[i],name[i],age[i],FM[i]);
            studentDaoImp.addstudent(student);
        }
        studentDaoImp.displayall();

        System.out.println("---------updatestudent-------------");
        student = new Student("1990","Yuan",18,"M");
        studentDaoImp.updstudent(student);
        studentDaoImp.displayall();

        System.out.println("---------querystudentbyID-------------");
        students = studentDaoImp.querystudentbyID("1990");
        for(Student s : students){
            s.display();
        }

        System.out.println("---------querystudentbyname-------------");
        students = studentDaoImp.querystudentbyname("Yuan");
        for(Student s : students){
            s.display();
        }

        System.out.println("---------querystudentbyage-------------");
        students = studentDaoImp.querystudentbyage(20);
        for(Student s : students){
            s.display();
        }

        System.out.println("---------delstudentbyage-------------");
        studentDaoImp.delstudentbyID("2018");
        studentDaoImp.displayall();

        System.out.println("---------delstudentbyname-------------");
        studentDaoImp.delstudentbyname("Hui");
        studentDaoImp.displayall();

        System.out.println("---------delallstudent-------------");
        studentDaoImp.delallstudent();
    }
}
