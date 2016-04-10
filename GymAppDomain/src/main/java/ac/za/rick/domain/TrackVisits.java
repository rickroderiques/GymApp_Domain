package ac.za.rick.domain;

import java.io.Serializable;

/**
 * Created by Rick on 10-Apr-16.
 */
public class TrackVisits implements Serializable{

    //private String id;
    private String dateTimeOfVisit;//can visit twice in one day and how long they stayed
    private String gymVisisted; //can pull from the same table as gym location
    // private String visitsThisMonth; // can be calculated from amount of times visited
    // private String visitsLastMonth; // can be calculated from amount of times visited
    // can also set what you did on that day

    public String getDateTimeOfVisit() {
        return dateTimeOfVisit;
    }

    public String getGymVisisted() {
        return gymVisisted;
    }

   /* public String getVisitsThisMonth() {
        return visitsThisMonth;
    }

    public String getVisitsLastMonth() {
        return visitsLastMonth;
    }*/


    public TrackVisits() {
    }
    public TrackVisits(Builder builder) {
        this.dateTimeOfVisit = builder.dateTimeOfVisit;
        this.gymVisisted = builder.gymVisisted;
       // this.visitsThisMonth = builder.visitsThisMonth;
       // this.visitsLastMonth = builder.visitsLastMonth;

    }

    public static class Builder
    {
        private String dateTimeOfVisit;//can visit twice in one day
        private String gymVisisted; //can pull from the same table as gym location
       // private String visitsThisMonth;
       // private String visitsLastMonth;


        public Builder setDateTimeOfVisit(String dateTimeOfVisit) {
            this.dateTimeOfVisit = dateTimeOfVisit;
            return this;
        }

        public Builder setGymVisisted(String gymVisisted) {
            this.gymVisisted = gymVisisted;
            return this;
        }

        /*public Builder setVisitsThisMonth(String visitsThisMonth) {
            this.visitsThisMonth = visitsThisMonth;
            return this;
        }

        public Builder setVisitsLastMonth(String visitsLastMonth) {
            this.visitsLastMonth = visitsLastMonth;
            return this;
        }*/



        public Builder copy(TrackVisits value) {
            this.dateTimeOfVisit = value.dateTimeOfVisit;
            this.gymVisisted = value.gymVisisted;
            //this.visitsThisMonth = value.visitsThisMonth;
            //this.visitsLastMonth = value.visitsLastMonth;
            return this;
        }

        public TrackVisits build() {
            return new TrackVisits(this);
        }
    }
}
