package application.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class TableRowModel {
	
	private StringProperty username;
	private StringProperty name;
	private IntegerProperty age;
	private StringProperty gender;
	private StringProperty email;
	
	public TableRowModel(String username, String name, int age, String gender, String email)
	{
		this.username = new SimpleStringProperty(username);
		this.name = new SimpleStringProperty(name);
		this.age = new SimpleIntegerProperty(age);
		this.gender = new SimpleStringProperty(gender);
		this.email = new SimpleStringProperty(email);
	}
	
	// 유저 name
	public StringProperty getUsername()
	{
		return username;
	}
	
	public void setUsername(StringProperty username)
	{
		this.username = username;
	}
	
	// 이름
	public StringProperty getName()
	{
		return name;
	}
	public void setName(StringProperty name)
	{
		this.name = name;
	}
	
	// 나이
	public IntegerProperty getAge()
	{
		return age;
	}
	public void setAge(IntegerProperty age)
	{
		this.age = age;
	}
	
	//성별
	public StringProperty getGender()
	{
		return gender;
	}
	public void setGender(StringProperty gender)
	{
		this.gender = gender;
	}

	//email
	public StringProperty getEmail()
	{
		return email;
	}
	public void getEmail(StringProperty email)
	{
		this.email = email;
	}
}
