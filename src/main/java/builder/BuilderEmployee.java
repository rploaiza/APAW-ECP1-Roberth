package builder;

import java.util.Calendar;

import entity.Employee;

public class BuilderEmployee {

	private Employee employee;

	public BuilderEmployee(long id) {
		this.employee = new Employee(id);
	}

	public BuilderEmployee(long id, String surname) {
		this.employee = new Employee(id, surname);
	}

	public BuilderEmployee surname(String surname) {
		this.employee.setSurname(surname);
		return this;
	}

	public BuilderEmployee entry(Calendar entry) {
		this.employee.setEntry(entry);
		return this;
	}

	public BuilderEmployee active(boolean active) {
		this.employee.setActive(active);
		return this;
	}

	public Employee build() {
		return this.employee;
	}

}
