package se.wusl.project.asc.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResorceToolkit {


    private static Properties property = new Properties();

    private static InputStream input = null;

    public ResorceToolkit()
    {
        loadProperties();
    }

    private void loadProperties() {

        input = getClass().getClassLoader().getResourceAsStream("se/wusl/project/asc/language/Common_Language.properties");

        if (input != null) {
            try {
                property.load(input);
            } catch (IOException e) {
                System.out.println("property file not loaded");
            }
        }
    }

    public String getProperty(String key) {

        if (!property.isEmpty())
        {
            return property.getProperty(key);
        }
        return null;
    }
}
