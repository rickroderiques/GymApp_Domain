package ac.za.rick.domain;

import java.io.Serializable;

/**
 * Created by Rick on 09-Apr-16.
 */
public class MemberDetails implements Serializable{

    private String id;
    private String membershipNumber;
    private String name;
    private String surname;
    private String user_email;
    private String contactNumber;
    private String membershipType;

    public String getId() {
        return id;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public MemberDetails(){}

    public MemberDetails(Builder builder){
        this.id = builder.id;
        this.membershipNumber = builder.membershipNumber;
        this.name = builder.name;
        this.surname = builder.surname;
        this.user_email = builder.user_email;
        this.contactNumber = builder.contactNumber;
        this.membershipType = builder.membershipType;

    }

    public static class Builder{
        private String id;
        private String membershipNumber;
        private String name;
        private String surname;
        private String user_email;
        private String contactNumber;
        private String membershipType;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder membershipNumber(String value) {
            this.membershipNumber = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Builder user_email(String value) {
            this.user_email = value;
            return this;
        }

        public Builder contactNumber(String value) {
            this.contactNumber = value;
            return this;
        }

        public Builder membershipType(String value) {
            this.membershipType = value;
            return this;
        }

        public Builder copy(MemberDetails value)
        {
            this.id = value.id;
            this.membershipNumber = value.membershipNumber;
            this.name = value.name;
            this.surname = value.surname;
            this.user_email = value.user_email;
            this.contactNumber = value.contactNumber;
            this.membershipType = value.membershipType;

            return this;
        }

        public MemberDetails build() {
            return new MemberDetails(this);
        }
    }
}
