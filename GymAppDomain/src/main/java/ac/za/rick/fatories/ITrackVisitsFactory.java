package ac.za.rick.fatories;

import ac.za.rick.domain.TrackVisits;

/**
 * Created by Rick on 10-Apr-16.
 */
public interface ITrackVisitsFactory {

    TrackVisits createVisit(String dateTimeOfVisit, String gymVisisted);
}
