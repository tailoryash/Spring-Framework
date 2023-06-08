package org.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springjdbc.dao.StudentDao;
import org.springjdbc.dao.StudentDaoImpl;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.springjdbc.dao"})
public class JdbcConfig {
    @Bean("ds")
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Simform@123");
        return driverManagerDataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("studentDao")
//    public StudentDao getStudentDao() {
//        StudentDaoImpl imp = new StudentDaoImpl();
//        imp.setJdbcTemplate(getTemplate());
//        return imp;
//    }

}
