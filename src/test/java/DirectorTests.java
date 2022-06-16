import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTests {

    Director director;

    @Before
    public void before() {director = new Director("Andrew", "Bosses", "JB6767 56G", 200000, 500); }

    @Test
    public void canRaiseSalary(){
        assertEquals(202000,director.raiseSalary(),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000,director.payBonus(),0.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(500,director.getBudget(),0.0);

    }
}
