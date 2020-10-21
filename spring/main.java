package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.constr.Student;
import com.lts.setter.Employee;
import com.lts.wiring.FoodPanda;

@SpringBootApplication
public class TrailTwoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrailTwoApplication.class, args);
	}

@Autowired
ApplicationContext context;

@Override
public void run(String ...args)throws Exception {
	Employee employee= context.getBean("employee",Employee.class);
	System.out.println(employee);
	Student student=context.getBean(Student.class);
	System.out.println(student);
	//ShapeFactory shapeFactory=context.getBean(ShapeFactory.class);
	//shapeFactory.printArea(10, 20);
	FoodPanda foodPanda=context.getBean(FoodPanda.class);
	foodPanda.showMenu("Indian");
	foodPanda.showMenu("Chinese");
}
}
