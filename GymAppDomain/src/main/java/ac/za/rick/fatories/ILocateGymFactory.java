package ac.za.rick.fatories;

import ac.za.rick.domain.LocateGym;

/**
 * Created by Rick on 10-Apr-16.
 */
public interface ILocateGymFactory {

    LocateGym createLocation(String gymType, String area);
}
