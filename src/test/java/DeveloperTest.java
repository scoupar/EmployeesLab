import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave", "AC123456C", 25000.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("AC123456C", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(25000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canIncreaseDeveloperSalary(){
        developer.raiseSalary(100.00);
        assertEquals(25100.00, developer.getSalary(), 0.0);

    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(250.00, developer.payBonus(), 0.0);
    }
}
