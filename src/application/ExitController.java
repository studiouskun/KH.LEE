package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExitController implements Initializable {

	@FXML private Button exitButton;

	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		exitButton.setOnAction(event -> exitButtonAction(event));
	}

	public void exitButtonAction(ActionEvent event)
	{
		Platform.exit();
	}
	// ��� ��ư ���� �κ�
	
	@FXML private Button statistische;
	
	public void staticButtonAction()
	{
		Stage stage = (Stage) statistische.getScene().getWindow(); //��������2
		
		try 
		{
			
			Stage newStage = new Stage(); // ��������1
			//scene �� ���̾ƿ� �߰��� ���
			Parent second = FXMLLoader.load(getClass().getResource("N012.fxml"));
			
			Scene sc = new Scene(second);
			
			//Scene�� ������������ ���ϰ� 
			newStage.setScene(sc);
			newStage.show();
			
			// �⺻ ������ ������
			stage.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	@FXML private Button listButton;
	public void listButtonAction()
	{
		Stage stage=(Stage) listButton.getScene().getWindow();
		
		try
		{
			Parent second = FXMLLoader.load(getClass().getResource("N012.fxml")); //list ������ ���� ���濹��
			
			Scene sc= new Scene(second);
			stage.setScene(sc);
			stage.show();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	
}
