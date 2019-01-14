import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Steve", "JZ761234", 11_000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", developer.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals("JZ761234", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(11_000.00, developer.getSalary(), 0.001);
    }
}
