package com.cts.demos.annotation;

public class AuthorMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		// The below line returning an object of employee class
		// during the runtime
		Class employeeClass=employee.getClass();
        Author author= (Author) employeeClass.getAnnotation(Author.class);
        System.out.println(author.name());
        System.out.println(author.version());
	}

}
