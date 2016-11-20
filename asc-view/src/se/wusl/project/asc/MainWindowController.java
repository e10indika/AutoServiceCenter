package se.wusl.project.asc;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import se.wusl.project.asc.resource.Resource;

public class MainWindowController {

    private static String currentUser = null;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblSignedAs;

    @FXML
    private Label signedUser;

    @FXML
    private TextField txtFieldUserName;

    @FXML
    private TextField textFieldPassword;

    private UserPM userPM = UserPMImpl.getInsatnce();

    public static String getCurrentUser() {
        return currentUser;
    }

    private void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    @FXML
    private void initialize()
    {
        initProperties(true);
    }

    private void initProperties(boolean disable) {
        lblSignedAs.setDisable(disable);
        signedUser.setDisable(disable);

        if (!disable)
        {
            signedUser.setText(currentUser);
        }
    }

    @FXML
    private void login() throws IOException {
        String userName = txtFieldUserName.getText();
        String password = textFieldPassword.getText();

        boolean loggedIn = false;
        if (validateUser(userName)) {
            loggedIn = userLogin(userName, password);
            if (loggedIn) {
                setCurrentUser(userName);
                initProperties(false);
                Main.showSelectUserTypeWindow();
            } else {
                showLogErrorMessageWindow(Resource.getProperty("error.login.user.mismatch.asc"));
            }
        } else {
            showLogErrorMessageWindow(Resource.getProperty("error.login.user.invalid.asc"));
        }


    }

    private void showLogErrorMessageWindow(String s) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText(s);
        alert.initModality(Modality.WINDOW_MODAL);
        alert.show();

    }

    private boolean userLogin(String userName, String password) {
        return userPM.userLogin(userName, password);
    }

    private boolean validateUser(String userName) {

        return userPM.validateUser(userName);
    }

    @FXML
    private void setOnKeyPressed(KeyEvent event) throws IOException {
        if (event.getCode() == KeyCode.ENTER) {
            login();
        }
    }
}