package se.wusl.project.asc.staff;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import se.wusl.project.asc.Main;

import java.io.IOException;

public class StaffWindow {

    private static BorderPane rootLayout;

    static {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("staff/StaffWindow.fxml"));
        try {
            rootLayout = loader.load();
        } catch (IOException e) {
            // Ignore
        }
    }

    public static void showAddStaffWindow() throws IOException
    {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("staff/AddStaff.fxml"));
        BorderPane borderPane = loader.load();
        rootLayout.setCenter(borderPane);
    }

    public static void showStaffWindow() throws IOException {
        Main.getLayout().setCenter(rootLayout);
    }
}
