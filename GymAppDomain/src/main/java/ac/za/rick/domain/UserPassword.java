package ac.za.rick.domain;

import java.io.Serializable;

/**
 * Created by Rick on 07-Apr-16.
 */
public class UserPassword implements Serializable{

    private String username;
    private String user_password;


    public String getUsername() {
        return username;
    }

    public String getUser_password() {
        return user_password;
    }

    private UserPassword() {
    }

    private UserPassword(Builder builder)
    {
        this.username = builder.username;
        this.user_password = builder.user_password;
    }


    /**Builder class*/
    public static class Builder {
        private String username;
        private String user_password;

        public Builder username(String value) {
            this.username = value;
            return this;
        }

        public Builder user_password(String value) {
            this.user_password = value;
            return this;
        }

        public Builder copy(UserPassword value)
        {
            this.username = value.username;
            this.user_password = value.user_password;

            return this;
        }

        public UserPassword build()
        {
            return new UserPassword(this);
        }
    }

}
