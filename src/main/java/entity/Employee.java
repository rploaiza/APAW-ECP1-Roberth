package entity;

import java.util.Calendar;

public class Employee {

	private long id;

	private String surname;

	private Calendar entry;

	private boolean active;

	public Employee(long id) {
		this.id = id;
		this.entry = Calendar.getInstance();

	}

	public Employee(long id, String surname) {
		this.id = id;
		this.surname = surname;
		this.entry = Calendar.getInstance();
	}

	public long getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Calendar getEntry() {
		return entry;
	}

	public void setEntry(Calendar entry) {
		this.entry = entry;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
