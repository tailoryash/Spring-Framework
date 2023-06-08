package org.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springjdbc.dao.StudentDao;
import org.springjdbc.entities.Student;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("My program started.....");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        //Inserting
        //        Student student = new Student();
//        student.setId(10000);
//        student.setName("Arpit");
//        student.setCity("Dubai");
//        int res = studentDao.insert(student);
//        System.out.println("Num of record inserted : " + res);

        //Updating
//        Student student = new Student();
//        student.setId(10000);
//        student.setCity("Dubai");
//        student.setName("parth solanki");
//        int res = studentDao.update(student);
//        System.out.println("Updated row : " + res);

        //Deleting
//        int res = studentDao.delete(10000);
//        System.out.println("Deleted row affects : " + res);

//to fetach data
//        Student student = studentDao.getStudent(2000);
//        System.out.println(student);

        List<Student> allStudent = studentDao.getAllStudent();
        for (Student e:
             allStudent) {
            System.out.println(e);
        }
    }
}