package se.wusl.project.asc.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import se.wusl.project.asc.MainWindowController;
import se.wusl.project.asc.Main;
import se.wusl.project.asc.UserPM;
import se.wusl.project.asc.UserPMImpl;
import se.wusl.project.asc.resource.Resource;
import se.wusl.project.asc.util.UserType;

import java.io.IOException;

public class SelectUserTypeController {

    @FXML
    private Label userNameLbl;

    @FXML
    private Label userPassWordLbl;

    @FXML
    private Label userTypeLbl;

    @FXML
    private TextField userNameTF;

    @FXML
    private TextField userPassWordTF;

    @FXML
    private ComboBox<String> userTypeCB;

    @FXML
    private ComboBox<String> cmbBoxUserRole;

    @FXML
    private Button logInBtn;

    @FXML
    private Button backBtn;

    @FXML
    private ImageView imageView;


    @FXML
    public void initialize() throws IOException {
        userTypeCB.getItems().addAll(UserType.ADMIN.getValue(), UserType.CUSTOMER.getValue(), UserType.STAFF.getValue());
        initUserRoleComboBox(true);
    }

    @FXML
    private void proceedLogin() throws IOException {
        if (validateInputs()) {
            loadRelatedWindow(UserType.getUserType(userTypeCB.getValue()));
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText(Resource.getProperty("login.service.inform.select.valid.type.role.asc"));
            alert.show();
        }
    }

    private boolean validateInputs() {
        String userType = userTypeCB.getValue();
        String userRole = cmbBoxUserRole.getValue();

        if (userType == null)
        {
            return  false;
        }

        if (!userType.equalsIgnoreCase(UserType.CUSTOMER.getValue()) && userRole == null) {
            return false;
        } else {
            if (userType.trim().length() > 0) {
                return true;
            }
            return false;
        }
    }

    private void loadRelatedWindow(UserType userType) throws IOException {
        switch (userType) {
            case ADMIN:
                Main.showAdminWindow();
                break;
            case STAFF:
                Main.showStaffWindow();
                break;
            case CUSTOMER:
                Main.showCustomerWindow();
        }
    }


    public void userTypeComboBoxActionListner(ActionEvent event) {
        //imageView = new ImageView();
        switch (UserType.getUserType(userTypeCB.getValue())) {
            case ADMIN:
                initUserRoleComboBox(false);
                cmbBoxUserRole.getItems().setAll("System", "Network", "Database");
                break;

            case STAFF:
                initUserRoleComboBox(false);
                cmbBoxUserRole.getItems().setAll("Operator", "Accountant", "Seller", "Other");
                break;

            case CUSTOMER:
                initUserRoleComboBox(true);

                break;

            default:
                break;
        }
    }

    private void initUserRoleComboBox(boolean disable) {
        cmbBoxUserRole.setDisable(disable);
        cmbBoxUserRole.getSelectionModel().clearSelection();
    }

    private Image getUserImage() {
        return new Image(Main.class.getResourceAsStream("images/admin/user_logo.jpg"));
    }

    private Image getAdminImage() {
        return new Image(Main.class.getResourceAsStream("images/admin/admin_logo.jpg"));
    }

    private Image getStaffImage() {
        return new Image(Main.class.getResourceAsStream("images/admin/staff_logo.jpg"));
    }

    @FXML
    public void logoutAndGotoLoginPage() throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.WINDOW_MODAL);
        alert.setHeaderText(null);
        alert.setContentText(Resource.getProperty("login.service.logout.confirm.asc"));
        alert.showAndWait();
        ButtonType result = alert.getResult();

        if (result == ButtonType.OK) {

            UserPM userPM = UserPMImpl.getInsatnce();
            userPM.userLogout(MainWindowController.getCurrentUser());

            Main.showLoginWindow();
        } else {
            // Nothing to do.. wait again this page
        }
    }
}
