package ac.za.rick.fatories;

import ac.za.rick.domain.UserPassword;

/**
 * Created by Rick on 07-Apr-16.
 */
public interface IUserPasswordFactory {

    UserPassword createUser(String username, String user_password);
}
