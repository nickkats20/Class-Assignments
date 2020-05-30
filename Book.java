import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Book extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Dubliners");
        Image book = new Image("https://g.christianbook.com/g/slideshow/6/68705/main/68705_1_ftc.jpg");
        ImageView img = new ImageView(book);

        Pane root = new Pane();
        root.setPrefSize(436, 712);
        root.getChildren().add(img);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}