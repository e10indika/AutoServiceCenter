package se.wusl.project.asc.staff;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

import java.io.IOException;

public class StaffWindowController
{
    @FXML
    private MenuItem searchStaffMI;

    @FXML
    private void showAddStaffWindow() throws IOException
    {
        StaffWindow.showAddStaffWindow();
    }

}
