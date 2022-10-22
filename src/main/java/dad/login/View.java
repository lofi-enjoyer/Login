package dad.login;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class View extends GridPane {

    private TextField usernameTextField;
    private PasswordField passwordTextField;
    private CheckBox ldapCheckBox;
    private Button loginButton, cancelButton;
    private Alert successAlert, errorAlert;

    public View() {
        setAlignment(Pos.CENTER);

        usernameTextField = new TextField();
        usernameTextField.setPromptText("Nombre del usuario");
        passwordTextField = new PasswordField();
        passwordTextField.setPromptText("Contraseña del usuario");

        ldapCheckBox = new CheckBox();
        HBox ldapHbox = new HBox();
        ldapHbox.getChildren().addAll(ldapCheckBox, new Label("Usar LDAP"));
        ldapHbox.setSpacing(10);

        loginButton = new Button("Acceder");
        loginButton.setDefaultButton(true);
        cancelButton = new Button("Cancelar");

        HBox buttonsHbox = new HBox();
        buttonsHbox.setAlignment(Pos.CENTER);
        buttonsHbox.setSpacing(10);
        buttonsHbox.getChildren().addAll(loginButton, cancelButton);

        addRow(0, new Label("Usuario:"), usernameTextField);
        addRow(1, new Label("Contraseña:"), passwordTextField);
        addRow(2, new Label(""), ldapHbox);
        addRow(3, buttonsHbox);

        GridPane.setColumnSpan(buttonsHbox, 2);
        setHgap(10);
        setVgap(10);

        successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Iniciar sesión");
        successAlert.setHeaderText("Acceso permitido");
        successAlert.setContentText("Las credenciales de acceso son válidas.");

        errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("Iniciar sesión");
        errorAlert.setHeaderText("Acceso denegado");
        errorAlert.setContentText("El usuario y/o la contraseña no son válidos.");
    }

    public TextField getUsernameTextField() {
        return usernameTextField;
    }

    public TextField getPasswordTextField() {
        return passwordTextField;
    }

    public CheckBox getLdapCheckBox() {
        return ldapCheckBox;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public Alert getSuccessAlert() {
        return successAlert;
    }

    public Alert getErrorAlert() {
        return errorAlert;
    }

}
