package org.example.sdev200module5assignment1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        // create the grid
        GridPane pane = new GridPane();
        // grab each image
        Image image1 = new Image("flag1.gif");
        Image image2 = new Image("flag2.gif");
        Image image3 = new Image("flag6.gif");
        Image image4 = new Image("flag7.gif");
        // set the gap distance between horizontally
        pane.setHgap(6);
        // set the gap distance between vertically
        pane.setVgap(6);
        // set the gap distance on the outside
        pane.setPadding(new Insets(6, 6, 6, 6));

        // create a new image view for the first picture
        ImageView imageView1 = new ImageView(image1);
        // make it more wide than tall
        imageView1.setFitHeight(100);
        imageView1.setFitWidth(150);
        // add it to the grid in the top left corner
        pane.add(imageView1, 0, 0);

        // create a new image view for the second picture
        ImageView imageView2 = new ImageView(image2);
        // make it more wide than tall
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(150);
        // add it to the grid in the top right corner
        pane.add(imageView2, 0, 1);

        // create a new image view for the third picture
        ImageView imageView3 = new ImageView(image3);
        // make it more wide than tall
        imageView3.setFitHeight(100);
        imageView3.setFitWidth(150);
        // add it to the grid in the bottom left corner
        pane.add(imageView3, 1, 0);

        // create a new image view for the fourth picture
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitHeight(100);
        imageView4.setFitWidth(150);
        // add it to the grid in the bottom right corner
        pane.add(imageView4, 1, 1);

        // create new scene and set the grid in it
        Scene scene = new Scene(pane);
        // set a title
        stage.setTitle("Exercise_14_1");
        // set the scene in the stage
        stage.setScene(scene);
        // show the stage
        stage.show();

    }
}
