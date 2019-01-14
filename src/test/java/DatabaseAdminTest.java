import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin dbAdmin;

    @Before
    public void setUp(){
        dbAdmin = new DatabaseAdmin("Steve", "JZ761234", 11_000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", dbAdmin.getName());
    }

    @Test
    public void hasniNumber() {
        assertEquals("JZ761234", dbAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(11_000.00, dbAdmin.getSalary(), 0.001);
    }
}
