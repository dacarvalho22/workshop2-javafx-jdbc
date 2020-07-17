package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewControler implements Initializable{

	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepart;
	
	@FXML
	private MenuItem menuItemAbrir;
	
	@FXML
	public void OnmenuItemVendedorAction() {
		System.out.println("Eu cliquei no botão do vendedor.");
	}
	
	@FXML
	public void OnmenuItemDepartAction() {
		System.out.println("Eu cliquei no botão do departamento.");
	}
	
	@FXML
	public void OnmenuItemAbrirAction() {
		System.out.println("Eu cliquei no botão do abrir.");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
