import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by z003jy6p on 15.05.2017.
 */
public class RentalTest {
    @Test
    public void getDaysRented() throws Exception {

        Movie m1 = new Movie("hallo",1);
        Rental r1 = new Rental(m1, 2);
        assertEquals(2,r1.getDaysRented());
    }

    @Test
    public void getMovie() throws Exception {

        Movie m1 = new Movie ("hallo",2);
        Rental r1 = new Rental(m1,2);
        assertEquals(m1,r1.getMovie());
    }

}