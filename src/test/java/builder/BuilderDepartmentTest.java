package builder;

import static org.junit.Assert.*;

import org.junit.Test;

import builder.BuilderDepartment;
import entity.Department;
import entity.Employee;

public class BuilderDepartmentTest {

    @Test
    public void testBuilderDepartmentAll() {
        Department department = new BuilderDepartment(1L, "TICs").center("Informatica").strategic(true).build();
        assertEquals(1L, department.getId());
        assertEquals("TICs", department.getTitle());
        assertEquals("Informatica", department.getCenter());
        assertEquals(true, department.isStrategic());
    }

    @Test
    public void testBuilderDepartmentTitle() {
        Department department = new BuilderDepartment(1L, "TICs").title("Departamento de las TICs").build();
        assertEquals("Departamento de las TICs", department.getTitle());
    }

    @Test
    public void testBuilderDepartmentNullEmployees() {
        Department department = new BuilderDepartment(1L, "TICs").center("Informatica").strategic(true).build();
        assertFalse(department.employeeControl(new Employee(1L, "Loaiza")));
    }

    @Test
    public void testOrderContainsNull() {
        Department department = new BuilderDepartment(1L, "TICs").build();
        assertNull(department.getEmployee());
        assertFalse(department.employeeControl(null));
    }

    @Test
    public void testOrderContainsNotNull() {
        Department department = new BuilderDepartment(3L, "Alvarez").employee(new Employee(1L, "Loaiza")).build();
        assertNotNull(department.getEmployee());
    }

    @Test
    public void testBuilderDepartmentControl() {
        Employee employee1 = new Employee(1L, "Loaiza");
        Employee employee2 = new Employee(2L, "Torres");
        Department department = new BuilderDepartment(1L, "TICs").center("Informatica").strategic(true).employee(employee1)
                .employee(employee2).build();
        assertTrue(department.employeeControl(employee1));
        assertTrue(department.employeeControl(employee2));

    }

    @Test
    public void testBuilderDepartmentEmployeeNew() {
        Department department = new BuilderDepartment(1L, "TICs").employee(new Employee(1L, "Ramirez")).build();
        assertNotNull(department.getEmployee());
        assertEquals(1, department.getEmployee().size());
    }

}
