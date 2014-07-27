package asg05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {
	protected double salary;

	public Employee( String name, Date birthday, double salary) {
		super(name, birthday);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return "Name: " + name + "\tBirthday: " + format.format(birthday) 
				+ "\tSalary: " + salary;
	}
}