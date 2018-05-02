import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jahn
 */
public class GUI extends Application {
    TextArea textArea;
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        VBox topContainer = new VBox();
        MenuBar mainMenu = createMenus();
        Button dataBtn = new Button("Fill list");
        
        
        topContainer.getChildren().add(mainMenu);
        root.setTop(topContainer);
        root.setLeft(dataBtn);
        root.setRight(textArea);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("GUI forsøk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * creates menubar and returns it to be displayed
     * @return Menubar to display
     */
    private MenuBar createMenus() {
        MenuBar menuBar = new MenuBar();
        
        Menu menuFile = new Menu("File");
        MenuItem openFile = new MenuItem("Open");
        MenuItem exitApp = new MenuItem("Exit");
        menuFile.getItems().add(openFile);
        menuFile.getItems().add(new SeparatorMenuItem());
        menuFile.getItems().add(exitApp);
        
        Menu menuView = new Menu("View");
        MenuItem See = new MenuItem("To see");
        MenuItem noSee = new MenuItem("Not to see");
        menuView.getItems().addAll(See, noSee);
        menuView.getItems().add(new SeparatorMenuItem());
        
        menuBar.getMenus().addAll(menuFile, menuView);
        
        exitApp.setOnAction(e -> closeApplication());
        
        return menuBar;
    }
    
    private void closeApplication()
    {
        Platform.exit();
    }
}