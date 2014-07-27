package asg05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee {
	private Employee assistant;

	public Manager(String name, Date birthday, double salary) {
		super(name, birthday, salary);
	}
	
	public void setAssistant(Employee a) {
		assistant = a;
	}
	
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return "Name: " + name + "\tBirthday: " + format.format(birthday) 
				+ "\tSalary: " + salary 
				+ "\nAssistant: " + "\n" + assistant.toString();
	}
}