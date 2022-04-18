package com.spr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCaller {

	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee)context.getBean("emp");
		Address addr= emp.getEmpAddr();
		System.out.println(emp.getEname());
		System.out.println(addr.getDrno()+"\n"+addr.getCity()+"\n"+addr.getState());
	}

}