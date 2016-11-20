package se.wusl.project.asc.resource;

public class Resource {

    private static ResorceToolkit toolkit = new ResorceToolkit();

    public static String getProperty(String key) {

        return toolkit.getProperty(key);
    }

    public void setProperty(String key, String value) {

    }


}
