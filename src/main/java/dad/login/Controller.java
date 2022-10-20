package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;

public class Controller {

    private View view;
    private Model model;

    public Controller() {
        view = new View();
        model = new Model();

        model.usernamePropertyProperty().bind(view.getUsernameTextField().textProperty());
        model.passwordPropertyProperty().bindBidirectional(view.getPasswordTextField().textProperty());
        model.ldapPropertyProperty().bind(view.getLdapCheckBox().selectedProperty());

        view.getLoginButton().setOnAction(this::onLoginClick);
        view.getCancelButton().setOnAction(this::onCancelClick);

    }

    private void onLoginClick(ActionEvent event) {
        AuthService auth = model.isLdapProperty() ? new LdapAuthService() : new FileAuthService();

        String username = model.getUsernameProperty();
        String password = model.getPasswordProperty();

        try {
            if (auth.login(username, password)) {
                view.getSuccessAlert().show();
            } else {
                onFailedLogin();
            }
        } catch (Exception e) {
            onFailedLogin();
        }
    }

    private void onCancelClick(ActionEvent event) {
        System.exit(0);
    }

    private void onFailedLogin() {
        model.passwordPropertyProperty().set("");
        view.getErrorAlert().show();
    }

    public View getView() {
        return view;
    }

}
