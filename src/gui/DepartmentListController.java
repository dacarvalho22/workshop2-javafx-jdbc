package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable{

	@FXML
	private TableView<Department> tableViemDepartment;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Department , String> tableColummName;
	
	@FXML
	private Button btNovo;
	
	@FXML
	public void onBtNeWAction() {
		System.out.println("você clicou no botão novo.");
	}	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
		
	}

	// Inicia o comportamento da colunas
	private void initializeNodes() {		
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColummName.setCellValueFactory(new PropertyValueFactory<>("Nome"));
		
		Stage palco = (Stage) Main.getMainScene().getWindow();
		tableViemDepartment.prefHeightProperty().bind(palco.heightProperty());
	}

}
