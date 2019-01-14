import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Steve", "JK1234", 33_000.00, "HR", 50_000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JK1234", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(33_000.00, director.getSalary(), 0.001);
    }

    @Test
    public void getDepartmentName(){
        assertEquals("HR", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(50_000.00, director.getBudget(), 0.001);
    }

    @Test
    public void shouldRecieve2PercentBonus() {
        assertEquals(660.00, director.payBonus(), 0.001);
    }
}
