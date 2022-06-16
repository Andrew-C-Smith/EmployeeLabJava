import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTests {


    Developer developer;

    @Before
    public void before() {developer = new Developer("Dave", "DevOps", "JB6767 56G", 100000); }

    @Test
    public void canRaiseSalary(){
        assertEquals(101000,developer.raiseSalary(),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000,developer.payBonus(),0.0);
    }
}
