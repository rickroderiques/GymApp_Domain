package ac.za.rick.fatories.Impl;


import ac.za.rick.domain.MemberDetails;
import ac.za.rick.fatories.IMemberDetailsFactory;

import java.util.UUID;

/**
 * Created by Rick on 09-Apr-16.
 */
public class MemberDetailsFactory implements IMemberDetailsFactory{

    private static MemberDetailsFactory memberDetailsFactory = null;

    private MemberDetailsFactory(){

    }

    /**creating the instance of the class*/
    public static MemberDetailsFactory getFactoryInstance() {
        if(memberDetailsFactory == null)
        {
            memberDetailsFactory = new MemberDetailsFactory();
        }
        return memberDetailsFactory;
    }

    public MemberDetails createMember(String membershipNumber, String name, String surname, String user_email, String contactNumber, String membershipType)
    {
        MemberDetails memberDetails = new MemberDetails
                .Builder()
                .id(UUID.randomUUID().toString())
                .membershipNumber(membershipNumber)
                .name(name)
                .surname(surname)
                .user_email(user_email)
                .contactNumber(contactNumber)
                .membershipType(membershipType)
                .build();
        return memberDetails;
    }
}
