package composite;

public interface DepartmentComponent {

    public abstract boolean isComposite();

    public abstract void add(DepartmentComponent component);

    public abstract void remove(DepartmentComponent component);

    public abstract String view();

    public abstract int size();

}
