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
    Register register = new Register();
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        VBox topContainer = new VBox();
        MenuBar mainMenu = createMenus();
        Button dataBtn = new Button("Fill list");
        textArea = new TextArea();
        
        dataBtn.setOnAction(e-> loadDummyData());
        
        topContainer.getChildren().add(mainMenu);
        root.setTop(topContainer);
        root.setLeft(dataBtn);
        root.setCenter(textArea);
        
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
    
    /**
     * Fills textArea with dummy data for user to see
     */
    private void loadDummyData()
    {
        fillWithDummyData();
        textArea.appendText(register.something()+"\n");
    }
    
        /**
     * Fills the list with dummy data
     */    
    public void fillWithDummyData()
    {
        Publications Single_publication = new Single_Book("Berit på jentetur", "Gyldendal", "Bob-Kåre", 2013, 5, 16);
        register.addLists(Single_publication);

        Publications Series_publication = new Series_Book("Harry Potter", "Sovjet Union", "Per Stalin", 1962, 3, 12);
        register.addLists(Series_publication);

        Publications Newspapers = new Newspaper("Dagbladet", "Aller Media AS", 25, 2010, 10, 29);
        register.addLists(Newspapers);

        Publications Comic = new Comics("Donald Duck", "Egmont", 12, "comedy", 1998, 04, 24);
        register.addLists(Comic);

        Publications Mag = new Magazine("Ingeniøren", "NITO", 01, "Vitenskap", 2012, 01, 04);
        register.addLists(Mag);

    }
}