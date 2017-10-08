package composite;

import java.util.ArrayList;
import java.util.List;

public class DepartmentComposite implements DepartmentComponent {

	private List<DepartmentComponent> departList;

	private String name;

	public DepartmentComposite(String name) {
		this.departList = new ArrayList<>();
		this.name = name;
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public void add(DepartmentComponent component) {
		assert component != null;
		this.departList.add(component);
	}

	@Override
	public void remove(DepartmentComponent component) {
		assert component != null;
		this.departList.remove(component);
	}

	@Override
	public String view() {
		return this.name;
	}

	@Override
	public int size() {
		return departList.size();
	}

}
