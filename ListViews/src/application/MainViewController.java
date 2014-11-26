package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class MainViewController implements Initializable {


	    @FXML
	    private ListView<Person> listview_choice;

	    @FXML
	    private ListView<Person> listview_selected;

	    public static  ObservableList<Person> list;
	    public static  ObservableList<Person> list2 = FXCollections.observableArrayList();
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
		       list = FXCollections.observableArrayList(
		                new Person("Kevin",12),
		                new Person("Falk",17),
		                new Person("Shandal",20));
		       listview_choice.setItems(list);
		       listview_choice.setCellFactory(new Callback<ListView<Person>, ListCell<Person>>() {
		            @Override
		            public ListCell<Person> call(ListView<Person> param) {
		                return new XCell();
		            }
		        });
		       listview_selected.setItems(list2);
		       listview_selected.setCellFactory(new Callback<ListView<Person>, ListCell<Person>>() {
		            @Override
		            public ListCell<Person> call(ListView<Person> param) {
		                return new YCell();
		            }
		        });
		}
		
		
	
}
