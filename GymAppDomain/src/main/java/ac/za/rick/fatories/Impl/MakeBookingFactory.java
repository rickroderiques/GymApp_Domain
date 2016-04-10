package ac.za.rick.fatories.Impl;

import ac.za.rick.domain.MakeBooking;
import ac.za.rick.fatories.IMakeBookingFactory;

import java.util.UUID;

/**
 * Created by Rick on 09-Apr-16.
 */
public class MakeBookingFactory implements IMakeBookingFactory {

    private static MakeBookingFactory factory = null;

    public static MakeBookingFactory getFactoryInstance()
    {
        if(factory == null)
            factory = new MakeBookingFactory();

        return factory;
    }

    public MakeBooking createBooking(String bookingName, String date, String timeSlot, String instructor, String gymLocation){
        MakeBooking makeBooking = new MakeBooking
                .Builder()
                .setId(UUID.randomUUID().toString())
                .setBookingName(bookingName)
                .setDate(date)
                .setTimeSlot(timeSlot)
                .setInstructor(instructor)
                .setGymLocation(gymLocation)
                .build();

        return makeBooking;
    }

}
