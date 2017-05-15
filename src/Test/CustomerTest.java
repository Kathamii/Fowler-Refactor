import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by z003jy6p on 15.05.2017.
 */
public class CustomerTest {
    @Test
    public void addRental() throws Exception {

        Movie m1 = new Movie("hallo",1);
        Rental r1 = new Rental (m1,2);
        Customer c1 = new Customer("hans");
        c1.addRental(r1);
    }

    @Test
    public void getName() throws Exception {

        Customer c1 = new Customer("hans");
        assertEquals("hans",c1.getName());
    }

    @Test
    public void statement() throws Exception {

        Customer c1 = new Customer("hans");
        assertTrue(c1.statement()!= "");
    }

}