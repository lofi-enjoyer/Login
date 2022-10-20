package dad.login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

    private StringProperty usernameProperty;
    private StringProperty passwordProperty;
    private BooleanProperty ldapProperty;

    public Model() {
        usernameProperty = new SimpleStringProperty();
        passwordProperty = new SimpleStringProperty();
        ldapProperty = new SimpleBooleanProperty();
    }

    public String getUsernameProperty() {
        return usernameProperty.get();
    }

    public StringProperty usernamePropertyProperty() {
        return usernameProperty;
    }

    public void setUsernameProperty(String usernameProperty) {
        this.usernameProperty.set(usernameProperty);
    }

    public String getPasswordProperty() {
        return passwordProperty.get();
    }

    public StringProperty passwordPropertyProperty() {
        return passwordProperty;
    }

    public void setPasswordProperty(String passwordProperty) {
        this.passwordProperty.set(passwordProperty);
    }

    public boolean isLdapProperty() {
        return ldapProperty.get();
    }

    public BooleanProperty ldapPropertyProperty() {
        return ldapProperty;
    }

    public void setLdapProperty(boolean ldapProperty) {
        this.ldapProperty.set(ldapProperty);
    }

}
