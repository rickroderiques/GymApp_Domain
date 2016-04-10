package ac.za.rick.fatories;

import ac.za.rick.domain.MakeBooking;

/**
 * Created by Rick on 09-Apr-16.
 */
public interface IMakeBookingFactory {
    MakeBooking createBooking(String bookingName, String date, String timeSlot, String instructor, String gymLocation);
}
