package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.DataModel.TodoData;
import sample.DataModel.TodoItem;


import java.time.LocalDate;

public class dialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResult(){

        String shortDescription=shortDescriptionField.getText().trim();

        String details=detailsArea.getText().trim();

        LocalDate deadline=deadlinePicker.getValue();
        TodoItem newItem=new TodoItem(shortDescription,details,deadline);

        TodoData.getInstance().addItem(newItem);
        return newItem;
    }
}
