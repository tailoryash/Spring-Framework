package org.springorm.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springorm.entities.Student;



public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //    Adding data to database
    @Transactional
    public int insert(Student student){
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }
}
