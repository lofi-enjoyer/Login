package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Controller controller = new Controller();

		Scene scene = new Scene(controller.getView(), 320, 200);

		stage.setTitle("Login");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) throws Exception {

		launch();
		
//		boolean useLdap = true;
//
//		AuthService auth = useLdap ? new LdapAuthService() : new FileAuthService();
//		System.out.println("Chuck Norris    : " + auth.login("cnorris", "patada"));
//		System.out.println("Charles Bronson : " + auth.login("cbronson", "Metrallet@1"));
//		System.out.println("David Carradine : " + auth.login("dcarradine", "kungfu"));
//		System.out.println("David Carradine : " + auth.login("dcarradine", "karate"));
//		System.out.println("Michael Knight  : " + auth.login("mknight", "kit"));
//
	}

}
