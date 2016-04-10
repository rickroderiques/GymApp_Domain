package ac.za.rick.domain;

import java.io.Serializable;

/**
 * Created by Rick on 09-Apr-16.
 */
public class MakeBooking implements Serializable{
    private String id;
    private String bookingName;
    private String date;
    private String timeSlot;
    private String instructor;
    private String gymLocation;

    public String getId() {
        return id;
    }

    public String getBookingName() {
        return bookingName;
    }

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getGymLocation() {
        return gymLocation;
    }

    public MakeBooking(){}

    public MakeBooking(Builder builder){
        this.id = builder.id;
        this.bookingName = builder.bookingName;
        this.date = builder.date;
        this.timeSlot = builder.timeSlot;
        this.instructor = builder.instructor;
        this.gymLocation = builder.gymLocation;
    }

    public static class Builder{
        private String id;
        private String bookingName;
        private String date;
        private String timeSlot;
        private String instructor;
        private String gymLocation;

        public Builder setId(String value) {
            this.id = value;
            return this;
        }

        public Builder setBookingName(String value) {
            this.bookingName = value;
            return this;
        }

        public Builder setDate(String value) {
            this.date = value;
            return this;
        }

        public Builder setTimeSlot(String value) {
            this.timeSlot = value;
            return this;
        }

        public Builder setInstructor(String value) {
            this.instructor = value;
            return this;
        }

        public Builder setGymLocation(String value) {
            this.gymLocation = value;
            return this;
        }

        public Builder copy(MakeBooking value)
        {
            this.id = value.id;
            this.bookingName = value.bookingName;
            this.date = value.date;
            this.timeSlot = value.timeSlot;
            this.instructor = value.instructor;
            this.gymLocation = value.gymLocation;
            return this;
        }

        public MakeBooking build(){return new MakeBooking(this);}
    }
}
