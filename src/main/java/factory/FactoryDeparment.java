package factory;

import java.util.HashMap;
import java.util.Map;

import entity.Department;

public class FactoryDeparment {

    private static final FactoryDeparment FACTORY_DEPARMENT = new FactoryDeparment();

    private Map<Long, Department> factory;

    private FactoryDeparment() {
        this.factory = new HashMap<>();
    }

    public Department getDepartment(long id) {
        return this.factory.get(id);
    }

    public void almacenar(Department department) {
        this.factory.put(department.getId(), department);
    }

    public int size() {
        return this.factory.size();
    }

    public void borrar(Long id) {
        this.factory.remove(id);
    }

    public void clear() {
        this.factory.clear();
    }

    public static FactoryDeparment getFactoryDeparment() {
        return FACTORY_DEPARMENT;
    }

}
