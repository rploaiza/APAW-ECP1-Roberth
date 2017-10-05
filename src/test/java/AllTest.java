import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import builder.*;
import composite.*;
import factory.*;
import strategy.*;


@RunWith(Suite.class)
@SuiteClasses({
    BuilderDepartmentTest.class,
    BuilderEmployeeTest.class,
    DepartmentComponentTest.class,
    FactoryDeparmentTest.class,
    ExpresionTest.class
})


public class AllTest {

}
