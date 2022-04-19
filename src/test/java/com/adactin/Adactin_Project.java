package com.adactin;

import com.base.Base_Class;
import com.helper_file.FileReadManager;
import com.pojo.PageObjectManager;

import java.io.IOException;
import org.openqa.selenium.WebDriver;



public class Adactin_Project extends Base_Class {
	
	
	
	
	public static WebDriver driver=getBrowser("Chrome");
	public static PageObjectManager pom=new PageObjectManager(driver);
public static void main(String[] args) throws IOException {
	geturl(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());
	implicitwait();

	inputText(pom.getInstancelp().getUname(),"Nithiya90");
	inputText(pom.getInstancelp().getPswd(),"6B980P");
	clickbutton(pom.getInstancelp().getLog());
	
	dropDown(pom.getInstancesp().getPlace(),"VisibleText","London");
	dropDown(pom.getInstancesp().getHotel(),"VisibleText","Hotel Hervey");
	dropDown(pom.getInstancesp(). getRtype(),"VisibleText","Double");
	dropDown(pom.getInstancesp().getRnos(),"byValue","2");
	inputText(pom.getInstancesp().getDin() ,"25/3/2022");
	inputText(pom.getInstancesp().getDout(),"26/3/2022");
	dropDown(pom.getInstancesp().getARoom1(),"byValue","3");
	dropDown(pom.getInstancesp().getCRoom(),"byIndex","3");
	clickbutton(pom.getInstancesp().getSearch());
	
	clickbutton( pom.getInstancesl().getSelect());
	clickbutton(pom.getInstancesl().getConti());

inputText(pom.getInstabp().getFname(),"Andrew");
	inputText(pom.getInstabp().getLname(),"Desouza");
	inputText(pom.getInstabp().getAddr(),"35,Harrington road,Toronto");
	inputText(pom.getInstabp().getCCN(),"2376493071823415");
	dropDown(pom.getInstabp().getCCT(),"ByValue","VISA");
	dropDown(pom.getInstabp().getEmon(),"VisibleText","May");
	dropDown(pom.getInstabp().getEyear(),"ByValue","2022");
	inputText(pom.getInstabp().getCCV(),"145");
	clickbutton(pom.getInstabp().getBooknow());
	
	//thread();
	//screenshot();
	clickbutton(pom.getInstalop().getLogout());
	close();
}

	
	
	
	
	

}
