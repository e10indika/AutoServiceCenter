package se.wusl.project.asc;

public interface UserPM {

    boolean userLogin(String userId, String password);

    boolean userLogout(String userId);

    boolean validateUser(String id);
}