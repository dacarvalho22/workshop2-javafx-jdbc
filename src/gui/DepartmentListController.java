package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;
import model.services.DepartmentService;

public class DepartmentListController implements Initializable{

	private DepartmentService servicos;	
	
	@FXML
	private TableView<Department> tableViemDepartment;
	
	@FXML
	private TableColumn<Department, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Department , String> tableColummName;
	
	@FXML
	private Button btNovo;
	
	private ObservableList<Department> obsList;	
	
	@FXML
	public void onBtNeWAction() {
		System.out.println("você clicou no botão novo.");
	}	
	
	public void serDepartmentServico(DepartmentService servicos) {
		this.servicos = servicos;
	}	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
		
	}

	// Inicia o comportamento da colunas
	private void initializeNodes() {		
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("Id"));
		tableColummName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		
		Stage palco = (Stage) Main.getMainScene().getWindow();
		tableViemDepartment.prefHeightProperty().bind(palco.heightProperty());
	}
	
	public void updateTableViem() {
		if(servicos == null) {
			throw new IllegalStateException("Serviço está nulo.");
		}
		
		List<Department> lista = servicos.findAll();
		obsList = FXCollections.observableArrayList(lista);
		tableViemDepartment.setItems(obsList);
		
	}

}
