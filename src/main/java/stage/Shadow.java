package stage;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Shadow {

    public Scene getShadowScene(Parent p) {
        Scene scene;
        VBox outer = new VBox();
        outer.getChildren().add( p );
        outer.setPadding(new Insets(10.0d));
        outer.setBackground( new Background(new BackgroundFill( Color.rgb(0,0,0,0), new CornerRadii(0), new
            Insets(0))));

        p.setEffect(new DropShadow());
        ((AnchorPane)p).setBackground( new Background(new BackgroundFill( Color.WHITE, new CornerRadii(0), new Insets(0)
        )));

        scene = new Scene( outer );
        scene.setFill( Color.rgb(0,255,0,0) );
        return scene;
    }
}
