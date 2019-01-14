import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve", "JK1234", 22_000.00, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JK1234", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(22_000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void getDepartmentName(){
        assertEquals("HR", manager.getDepartmentName());
    }
}
