import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> combo1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ComboBox Demo");
        button = new Button("Click me");

        combo1 = new ComboBox<>();
        combo1.getItems(). addAll(
                "Inception",
            "Avengers",
            "Blackhat"
        );

        combo1.setPromptText("Select movie");

        combo1.setEditable(true);

        button.setOnAction(e -> printMovie());

        combo1.setOnAction(e -> System.out.println("Selected: " + combo1.getValue()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(combo1, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void printMovie() {
        System.out.println("Chose: " + combo1.getValue());
    }


}
