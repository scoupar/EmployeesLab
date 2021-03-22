import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "JC123456A", 30000.00, "Technical Team" );
    }

    @Test
    public void managerHasAName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void managerHasAnNiNumber(){
        assertEquals("JC123456A", manager.getNiNumber());
    }

    @Test
    public void managerHasASalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasADeptName(){
        assertEquals("Technical Team", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(100.00);
        assertEquals(30100.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300, manager.payBonus(), 0.0);
    }
}

