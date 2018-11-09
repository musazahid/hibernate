package com.musa.lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
String url;
String user;
String password;
String filename;

public Configuration(String filename) {
	this.filename = filename;
	Properties props = new Properties();
	try {
		props.load(new FileInputStream("config.properties"));
		url = props.getProperty("url");
		user = props.getProperty("user");
		password = props.getProperty("password");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}





}
