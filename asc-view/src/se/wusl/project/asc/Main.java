package se.wusl.project.asc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import se.wusl.project.asc.resource.Resource;
import se.wusl.project.asc.staff.StaffWindow;

import java.io.IOException;

public class Main extends Application {

    private static BorderPane rootLayout;
    private static Stage primaryStage;

    private static void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindow.fxml"));
        rootLayout = loader.load();

        Scene scene = new Scene(rootLayout);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static BorderPane getLayout() {
        return rootLayout;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void showLoginWindow() throws IOException {
        showMainView();
    }

    public static void showSelectUserTypeWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("login/SelectUserType.fxml"));
        BorderPane borderPane = loader.load();
        rootLayout.setCenter(borderPane);
    }

    public static void showStaffWindow() throws IOException {
        StaffWindow.showStaffWindow();
    }

    public static void showAdminWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("admin/AdminWindow.fxml"));
        BorderPane borderPane = loader.load();
        rootLayout.setCenter(borderPane);
    }

    public static void showCustomerWindow() throws IOException {

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("images/common/med.png")));
        this.primaryStage.setTitle(Resource.getProperty("auto.service.center.title"));

        showMainView();
    }




}
