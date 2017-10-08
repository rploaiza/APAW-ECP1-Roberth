package composite;

import entity.Department;

public class DepartmentLeaf implements DepartmentComponent {

	private Department department;

	public DepartmentLeaf(Department department) {
		this.department = department;
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public void add(DepartmentComponent component) {
		throw new UnsupportedOperationException("Operación no soportada");

	}

	@Override
	public void remove(DepartmentComponent component) {
		throw new UnsupportedOperationException("Operación no soportada");

	}

	@Override
	public String view() {
		return String.valueOf(this.department.getId());
	}

	@Override
	public int size() {
		return 0;
	}
}
