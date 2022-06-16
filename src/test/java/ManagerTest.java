import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {manager = new Manager("John", "DevOps", "JB6767 56G", 100000); }

    @Test
    public void canRaiseSalary(){
        assertEquals(101000,manager.raiseSalary(),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000,manager.payBonus(),0.0);
    }

}
