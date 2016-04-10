package ac.za.rick.domain;

import java.io.Serializable;

/**
 * Created by Rick on 10-Apr-16.
 */
public class LocateGym implements Serializable {

    private String gymType; //full gym or just a grid circuit gym
    private String area;
    //some how connect a map x_x


    public String getGymType() {
        return gymType;
    }

    public String getArea() {
        return area;
    }

    private LocateGym(){}

    private LocateGym(Builder builder)
    {
        this.gymType = builder.gymType;
        this.area = builder.area;
    }

    public static class Builder{
        private String gymType; //full gym or just a grid circuit gym
        private String area;

        public Builder setGymType(String gymType) {
            this.gymType = gymType;
            return this;
        }

        public Builder setArea(String area) {
            this.area = area;
            return this;
        }

        public Builder copy(LocateGym value) {
            this.area = value.area;
            this.gymType = value.gymType;

            return this;
        }
        public LocateGym build() {
            return new LocateGym(this);
        }
    }

}
