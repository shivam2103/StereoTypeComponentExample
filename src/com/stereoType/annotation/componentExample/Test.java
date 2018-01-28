package com.stereoType.annotation.componentExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp = (Employee) ac.getBean("employee");
		
/*		emp.setEmpAge(23);
		emp.setEmpId(1);
		emp.setEmpName("Amit");
		*/
		System.out.println(emp);
	}
	

}
