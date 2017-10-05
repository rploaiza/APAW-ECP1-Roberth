package composite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import builder.BuilderDepartment;
import entity.Department;

public class DepartmentComponentTest {

    private DepartmentComponent departmentComponent, departmentComponent2, departmentComponent3;

    private Department department, department2, department3, department4;

    @Before
    public void before() {
        department = new BuilderDepartment(1L, "TICs").build();
        department2 = new BuilderDepartment(2L, "Database").build();
        department3 = new BuilderDepartment(3L, "Software").build();
        department4 = new BuilderDepartment(4L, "Hardware").build();

        this.departmentComponent = new DepartmentComposite("Empleados Activos");
        this.departmentComponent3 = new DepartmentLeaf(department2);
        this.departmentComponent.add(departmentComponent3);
        this.departmentComponent.add(new DepartmentLeaf(department4));

        this.departmentComponent2 = new DepartmentComposite("Empleados Inactivos");
        this.departmentComponent2.add(new DepartmentLeaf(department));
        this.departmentComponent2.add(new DepartmentLeaf(department3));
    }

    @Test
    public void testViewComposite() {
        assertFalse(this.departmentComponent3.isComposite());
        assertTrue(this.departmentComponent.isComposite());
    }

    @Test
    public void testViewLeaf() {
        assertEquals("2", this.departmentComponent3.view());
        assertEquals("Empleados Activos", this.departmentComponent.view());
        assertEquals("Empleados Inactivos", this.departmentComponent2.view());
    }

    @Test
    public void testAddDriverComposite() {
        assertEquals(2, this.departmentComponent2.size());
        this.departmentComponent.add(new DepartmentLeaf(department2));
        assertEquals(2, this.departmentComponent2.size());
    }

    @Test
    public void testDeleteDriverComposite() {
        assertEquals(2, this.departmentComponent.size());
        this.departmentComponent.remove(departmentComponent3);
        assertEquals(1, this.departmentComponent.size());
    }
}
