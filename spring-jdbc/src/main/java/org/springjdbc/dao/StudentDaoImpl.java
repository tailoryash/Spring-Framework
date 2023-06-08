package org.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springjdbc.entities.Student;

import java.util.List;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
//@Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return res;
    }

    public int update(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int res = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return res;
    }

    public int delete(int studentId) {
        String query = "delete from student where id=?";
        int res = this.jdbcTemplate.update(query, studentId);
        return res;
    }

    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RawMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }


    public List<Student> getAllStudent() {
        String query = "select * from student";
        List<Student> res = this.jdbcTemplate.query(query, new RawMapperImpl());
        return res;
    }
}
