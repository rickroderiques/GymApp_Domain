package ac.za.rick.domain;

import ac.za.rick.fatories.IMakeBookingFactory;
import ac.za.rick.fatories.Impl.MakeBookingFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 09-Apr-16.
 */
public class MakeBookingTest {

    private static IMakeBookingFactory factory;

    @Before
    public void setUp() throws Exception {
            factory = MakeBookingFactory.getFactoryInstance();
    }


    @Test
    public void testBookingCreation() throws Exception{
        MakeBooking makeBooking = factory.createBooking("Yoga", "12-April-2016","16:00-17:30", "Lex Luther", "Cavendish");
        Assert.assertEquals("Yoga", makeBooking.getBookingName());
        Assert.assertEquals("Cavendish", makeBooking.getGymLocation());
        Assert.assertNotNull(makeBooking.getId());
    }

    @Test
    public void testBookingUpdate() throws Exception {
        MakeBooking makeBooking = factory.createBooking("Yoga", "12-April-2016","16:00-17:30", "Lex Luther", "Cavendish");
        Assert.assertEquals("Yoga", makeBooking.getBookingName());
        Assert.assertEquals("Cavendish", makeBooking.getGymLocation());
        Assert.assertNotNull(makeBooking.getId());

        MakeBooking updateBooking = new MakeBooking.Builder()
                .copy(makeBooking)
                .setBookingName("Killer Abs")
                .build();

        Assert.assertEquals("Killer Abs", updateBooking.getBookingName());
        Assert.assertEquals(makeBooking.getId(),updateBooking.getId());
    }

}