package builder;

import java.util.List;

import entity.Department;
import entity.Employee;

import java.util.ArrayList;

public class BuilderDepartment {

	private Department department;

	public BuilderDepartment(long id, String title) {
		this.department = new Department(id, title);
	}

	public BuilderDepartment title(String title) {
		this.department.setTitle(title);
		return this;
	}

	public BuilderDepartment center(String center) {
		this.department.setCenter(center);
		return this;
	}

	public BuilderDepartment strategic(boolean strategic) {
		this.department.setStrategic(strategic);
		return this;
	}

	public BuilderDepartment employee(Employee employee) {
		List<Employee> employees = this.department.getEmployee();
		if (employees == null) {
			employees = new ArrayList<>();
		}
		employees.add(employee);
		this.department.setEmployee(employees);
		return this;
	}

	public Department build() {
		return this.department;
	}
}
