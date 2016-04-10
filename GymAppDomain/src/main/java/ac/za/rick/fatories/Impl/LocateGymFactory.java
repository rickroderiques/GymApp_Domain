package ac.za.rick.fatories.Impl;

import ac.za.rick.domain.LocateGym;
import ac.za.rick.fatories.ILocateGymFactory;

/**
 * Created by Rick on 10-Apr-16.
 */
public class LocateGymFactory implements ILocateGymFactory{
    private static LocateGymFactory factory = null;

    public LocateGymFactory(){}

    public static LocateGymFactory getFactoryInstance()
    {
        if(factory == null)
        factory = new LocateGymFactory();

        return factory;
    }

    public LocateGym createLocation(String gymType, String area)
    {
        LocateGym locateGym = new LocateGym
                .Builder()
                .setGymType(gymType)
                .setArea(area)
                .build();

                return locateGym;
    }

}
