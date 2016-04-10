package ac.za.rick.fatories;

import ac.za.rick.domain.MemberDetails;

/**
 * Created by Rick on 09-Apr-16.
 */
public interface IMemberDetailsFactory {
    MemberDetails createMember(String membershipNumber, String name, String surname, String user_email, String contactNumber, String membershipType);
}
