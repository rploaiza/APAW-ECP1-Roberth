package factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import builder.BuilderDepartment;
import entity.Department;

public class FactoryDeparmentTest {

    @Before
    public void before() {
        FactoryDeparment.getFactoryDeparment().clear();
    }

    @Test
    public void testFactoryNull() {
        assertNotNull(FactoryDeparment.getFactoryDeparment());
    }

    @Test
    public void testFactory() {
        assertSame(FactoryDeparment.getFactoryDeparment(), FactoryDeparment.getFactoryDeparment());
    }

    @Test
    public void testAlmacenar() {
        Department department1 = new BuilderDepartment(1L, "TICs").build();
        Department department2 = new BuilderDepartment(2L, "Database").build();
        FactoryDeparment.getFactoryDeparment().almacenar(department1);
        assertNull(FactoryDeparment.getFactoryDeparment().getDepartment(department2.getId()));
        assertEquals(department1, FactoryDeparment.getFactoryDeparment().getDepartment(department1.getId()));
        assertEquals(1, FactoryDeparment.getFactoryDeparment().size());
    }

    @Test
    public void testGetCustomerFactory() {
        Department department1 = new BuilderDepartment(1L, "TICs").build();
        FactoryDeparment.getFactoryDeparment().almacenar(department1);
        assertEquals(department1, FactoryDeparment.getFactoryDeparment().getDepartment(department1.getId()));
    }

    @Test
    public void testBorrarAndSize() {
        Department department3 = new BuilderDepartment(3L, "Sofware").build();
        assertNull(FactoryDeparment.getFactoryDeparment().getDepartment(department3.getId()));
        FactoryDeparment.getFactoryDeparment().borrar(department3.getId());
        assertNull(FactoryDeparment.getFactoryDeparment().getDepartment(department3.getId()));

    }

    @Test
    public void testClear() {
        assertEquals(0, FactoryDeparment.getFactoryDeparment().size());
    }

}
