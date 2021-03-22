import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Sally", "JS123456D", 40000.00, "Management", 500000.00);

    }

    @Test
    public void directorHasName(){
        assertEquals("Sally", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals("JS123456D", director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(40000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(2000.00);
        assertEquals(42000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(800.00, director.payBonus(), 0.0);
    }

    @Test
    public void directorHasBudget(){
        assertEquals(500000, director.getBudget(), 0.0);
    }


}
