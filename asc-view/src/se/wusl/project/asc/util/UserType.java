package se.wusl.project.asc.util;

public enum UserType {
    ADMIN("Admin"), STAFF("Staff"), CUSTOMER("Customer");

    private String value;

    UserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static UserType getUserType(String key) {
        for (UserType userType : UserType.values()) {
            if (userType.getValue() == key) {
                return userType;
            }
        }

        throw new IllegalArgumentException("Invalid Argument");
    }

}