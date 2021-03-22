import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Steve", "AB123456B", 28000.00);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Steve", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber(){
        assertEquals("AB123456B", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(28000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(100.00);
        assertEquals(28100.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetBonusAmount(){
        assertEquals(280.00, databaseAdmin.payBonus(), 0.0 );
    }
}
