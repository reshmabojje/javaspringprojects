package com.jdbcspringmavenpro;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		
		//static inserting like - statement 
//		int update = jdbcTemplate.update("insert into people values(12,'reshma',9010)");
//		System.out.println("row inserted " + update);
		
		//inserting dynamically using - prepared statement
//		Object[] input = {18,"sunny", 7661};
//		int update2 = jdbcTemplate.update("insert into people values(?,?,?)",input);
//		System.out.println("row inserted " + update2);
//		
//		//delete 
//		
//		Object[] delInput = {12};
//		int delete=jdbcTemplate.update("delete from people where id=?",delInput);
//		System.out.println("row deleted " + delete);
		
		//update
//		Object[] updateInput= { "sathwik",18};
//		int updation = jdbcTemplate.update("update people set name =? where id = ?", updateInput);
//		System.out.println("row updated " + updation);
		
		//select 
		MyRowMapper rowMapper = new MyRowMapper();
		Emp emp = jdbcTemplate.queryForObject("SELECT * FROM employee where id=20", rowMapper);
		System.out.println(emp);
		
		
		
//		Student student = ctx.getBean("student",Student.class);
//		System.out.println(student.getAddress().getCity());
//		System.out.println(student.getId());
//		System.out.println(student.getName());
	}

}
