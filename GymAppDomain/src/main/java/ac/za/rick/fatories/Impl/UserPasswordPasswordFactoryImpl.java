package ac.za.rick.fatories.Impl;

import ac.za.rick.domain.UserPassword;
import ac.za.rick.fatories.IUserPasswordFactory;

/**
 * Created by Rick on 07-Apr-16.
 */
public class UserPasswordPasswordFactoryImpl implements IUserPasswordFactory {

    private static UserPasswordPasswordFactoryImpl userFactory = null;

    private UserPasswordPasswordFactoryImpl(){

    }

    /**creating the instance of the class*/
    public static UserPasswordPasswordFactoryImpl getFactoryInstance() {
        if(userFactory == null)
        {
            userFactory = new UserPasswordPasswordFactoryImpl();
        }
        return userFactory;
    }

    public UserPassword createUser(String name, String user_password)
    {
        UserPassword userPassword = new UserPassword
                .Builder()
                .username(name)
                .user_password(user_password)
                .build();
        return userPassword;
    }


}
