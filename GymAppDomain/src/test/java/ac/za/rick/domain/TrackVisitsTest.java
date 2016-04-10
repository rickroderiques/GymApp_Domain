package ac.za.rick.domain;

import ac.za.rick.fatories.ITrackVisitsFactory;
import ac.za.rick.fatories.Impl.TrackVisitsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 10-Apr-16.
 */
public class TrackVisitsTest {

    private ITrackVisitsFactory factory;

    @Before
    public void setUp() throws Exception {
            factory = TrackVisitsFactory.getFactoryInstance();
    }

    @Test
    public void testVisitCreation() throws Exception {
        TrackVisits trackVisits = factory.createVisit("10-04-16, 11:40", "Cavendish" );
        Assert.assertEquals("10-04-16, 11:40", trackVisits.getDateTimeOfVisit());
        Assert.assertEquals("Cavendish", trackVisits.getGymVisisted());

    }

    @Test
    public void testMemberUpdate() throws Exception{
        TrackVisits trackVisits = factory.createVisit("10-04-16, 11:40", "Cavendish" );
        Assert.assertEquals("10-04-16, 11:40", trackVisits.getDateTimeOfVisit());
        Assert.assertEquals("Cavendish", trackVisits.getGymVisisted());

        TrackVisits updateVisit = new TrackVisits.Builder()
                .copy(trackVisits) //reason why line 43 works with the updatedVisit
                .setGymVisisted("Tygervalley")
                .build();

        Assert.assertEquals("Tygervalley", updateVisit.getGymVisisted());
        Assert.assertEquals("10-04-16, 11:40", updateVisit.getDateTimeOfVisit());
    }
}