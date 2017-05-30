import org.junit.Test;
import program.Movie;

import static org.junit.Assert.*;

/**
 * Created by z003jy6p on 15.05.2017.
 */
public class MovieTest {
    @Test
    public void getPriceCode() throws Exception {

        Movie m1 = new Movie("hallo",1);
        assertEquals(1, m1.getPriceCode());
    }

    @Test
    public void setPriceCode() throws Exception {

        Movie m2 = new Movie("bye",2);
        m2.setPriceCode(3);
        assertEquals(3,m2.getPriceCode());
    }

    @Test
    public void getTitle() throws Exception {

        Movie m3 = new Movie("tach", 4);
        assertEquals("tach",m3.getTitle());
    }

}