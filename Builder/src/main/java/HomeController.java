import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    public ColorPicker bgPicker;
    public ColorPicker accentPicker;

    public void initialize(URL location, ResourceBundle resources) {
        accentPicker.setValue(SceneManager.getInstance().getAccentColor());
        bgPicker.setValue(SceneManager.getInstance().getBackgroundColor());
    }

    public void openLangBuilder(ActionEvent actionEvent) throws IOException {
        openScene("/fxml/LangBuilder.fxml");
    }

    public void openModBuilder(ActionEvent actionEvent) throws IOException {
        openScene("/fxml/ModBuilder.fxml");
    }

    private void openScene(String fxml) throws IOException {
        SceneManager.getInstance().changeScene(fxml, "/fxml/Home.fxml");
    }

    public void setBGColor(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().setBackgroundColor(bgPicker.getValue());
    }

    public void setAccentColor(ActionEvent actionEvent) throws IOException {
        SceneManager.getInstance().setAccentColor(accentPicker.getValue());
    }
}
