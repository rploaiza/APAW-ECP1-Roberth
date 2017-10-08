package builder;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Calendar;
import builder.BuilderEmployee;
import entity.Employee;

public class BuilderEmployeeTest {

    @Test
    public void testEmployeeId() {
        Employee employee = new Employee(1L, "Loaiza");
        assertEquals(1L, employee.getId());
        assertEquals("Loaiza", employee.getSurname());
        assertNotNull(employee.getEntry());
        assertNotNull(employee.isActive());
    }

    @Test
    public void testEmployeeSurname() {
        Employee employee = new Employee(1L, "Loaiza");
		assertEquals("Loaiza", employee.getSurname());
        employee.setSurname("Rosas");
        assertEquals("Rosas", employee.getSurname());
    }

    @Test
    public void testEmployeeActive() {
        Employee employee = new Employee(1L, "Loaiza");
        assertNotNull(employee.isActive());
        employee.setActive(true);
        assertEquals(true, employee.isActive());
    }

    @Test
    public void testBuilderEmployee() {
        Calendar date = Calendar.getInstance();
        Employee employee = new BuilderEmployee(1L, "Loaiza").entry(date).active(true).build();
        assertEquals(1L, employee.getId());
        assertEquals("Loaiza", employee.getSurname());
        assertEquals(date, employee.getEntry());
        assertEquals(true, employee.isActive());

    }
    
    @Test
    public void testBuilderEmployeeSurname() {
        Calendar date = Calendar.getInstance();
        Employee employee = new BuilderEmployee(1L).surname("Loaiza").entry(date).active(true).build();
        assertEquals(1L, employee.getId());
        assertEquals("Loaiza", employee.getSurname());
        assertEquals(date, employee.getEntry());
        assertEquals(true, employee.isActive());

    }
}
