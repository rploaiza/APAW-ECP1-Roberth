package entity;

import java.util.List;

public class Department {
    
    private long id;
    
    private String title;
    
    private String center;
    
    private boolean strategic;
    
    private List<Employee> employees;
    
    public Department(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public boolean isStrategic() {
        return strategic;
    }

    public void setStrategic(boolean strategic) {
        this.strategic = strategic;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    public void setEmployee(List<Employee> employees) {
        this.employees = employees;
    }
    
    public boolean employeeControl(Employee employee) {
        if (employees == null) {
            return false;
        } else {
            return employees.contains(employee);
        }
    } 

}
