package ac.za.rick.fatories.Impl;

import ac.za.rick.domain.TrackVisits;
import ac.za.rick.fatories.ITrackVisitsFactory;

/**
 * Created by Rick on 10-Apr-16.
 */
public class TrackVisitsFactory implements ITrackVisitsFactory{

    private static TrackVisitsFactory factory = null;

    private TrackVisitsFactory(){

    }

    /**creating the instance of the class*/
    public static TrackVisitsFactory getFactoryInstance() {
        if(factory == null)
        {
            factory = new TrackVisitsFactory();
        }
        return factory;
    }


    private String dateTimeOfVisit;//can visit twice in one day
    private String gymVisisted; //can pull from the same table as gym location



    public TrackVisits createVisit(String dateTimeOfVisit, String gymVisisted)
    {
        TrackVisits trackVisits = new TrackVisits
                .Builder()
                .setDateTimeOfVisit(dateTimeOfVisit)
                .setGymVisisted(gymVisisted)
                .build();
        return trackVisits;
    }
}
