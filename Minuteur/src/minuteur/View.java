package minuteur;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public  abstract class View {

    Stage stage = new Stage();
    Group group = new Group();
    Scene scene = new Scene(group,220,30);
    Button incre= new Button("+");
    Button decre = new Button("-");





}
