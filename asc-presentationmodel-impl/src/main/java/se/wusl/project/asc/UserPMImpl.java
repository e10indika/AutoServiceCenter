package se.wusl.project.asc;

public class UserPMImpl implements UserPM {

    private static UserPM instance = new UserPMImpl();

    private UserPMImpl()
    {

    }

    public static  UserPM getInsatnce() {
        return instance;
    }

    public boolean userLogin(String userId, String password) {
        if(userId.equalsIgnoreCase("indika"))
        {
            return  true;
        }
        return  false;
    }


    public boolean userLogout(String userId) {
        return false;
    }

    public boolean validateUser(String id) {
        if(id.equalsIgnoreCase("indika"))
        {
            return  true;
        }
        return  false;
    }
}
