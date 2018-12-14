package application;

import java.awt.List;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.paint.Color;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class StaticController implements Initializable {

	
	@FXML private Button exitButton1;
	@FXML private BarChart<String, Number> barChart1; //�� ��Ʈ��
	@FXML private CategoryAxis xAxis;
	//ObservableList<Data> list = null; //����Ʈ�� �߰� �Ұ��
	@FXML private PieChart pieChart1; //������Ʈ��
	private int percent=0; // ������Ʈ�� ���� ����� ����
	
	//�ø��� ���� �ڷ��
	String[] categories = {"10��", "20��", "30��", "40��", "��Ÿ"};
	
	//���� �ڷᱸ��
	XYChart.Series<String, Number> series = null;
	private ObservableList<String> xLabels = FXCollections.observableArrayList();
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("FXML LOAD COMPLETE"); // �ʿ��ұ�? - x�࿡ ���� ����
		xLabels.addAll(Arrays.asList(categories));
		xAxis.setCategories(xLabels); // x�� ����
		
		exitButton1.setOnAction(event -> exitButton1Action(event));
		
	}
	public void exitButton1Action(ActionEvent event) //exitButton Setting
	{
		Platform.exit();
	}
	        //���� ��ư
	public void auto()
			{
				barChart1.getData().clear();
				
				String[] brands = {"��", "��", "��Ÿ"}; // ������ ���� ����
				
				for(int i=0; i<brands.length; i++) // �ø��� ������ ����
				{
					series = new XYChart.Series<String, Number>();
					
					series.setName(brands[i]);
					
					//�ø�� ������ ����() = {"10��","20��", "30��", "40��", "��Ÿ"}
					
					for(int j=0; j<categories.length; j++)
					{
						//�ٸ� ���� �ϱ����� �κ�?
						series.getData().add(new XYChart.Data<String, Number>(xLabels.get(j),i));// i �κ� �ٽ� ����
					
					}
					
					barChart1.getData().add(series);
					
				}
				/*
				pieChart1.getData().clear();
				ObservableList<Data>list = null;
				
				int a = 10; 
				int b = 20;
				int c = 30; 
				int d = 17;
				int e = 43;  
				  
				list = FXCollections.observableArrayList();
				list.add(new PieChart.Data("zehn",a));
				list.add(new PieChart.Data("zwanzig",b));
				list.add(new PieChart.Data("dreissig",c));
				list.add(new PieChart.Data("vierzig",d));
				list.add(new PieChart.Data("others",e));
				
				pieChart1.setTitle("Aufteilung nach Geschlecht und Alter");
				pieChart1.setLabelsVisible(true);
				pieChart1.setData(list);
				*/
				
			
				
				//	for(int j=0; j<categories.length; j++)
					
						
					
				
			}

}
