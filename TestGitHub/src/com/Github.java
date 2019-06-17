package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Github {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://test.safetynet.dk/SafetyNetDev_SIT/FrontPlanner/EnrollmentDescription.aspx?cKey=FA&pKey=intro&code=999T190250");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//a[@id ='ctl00_masterContent__faActivityDescription__btnSignUp']")).click();
		  WebElement email = driver.findElement(By.xpath("//input[@name='ctl00$masterContent$_enrollStart$_enroll$findPerson$_txtFindPerson']"));
		  email.clear();
		  email.sendKeys("sureshc@frontavenue.com");
		  
		  WebElement _btnContinue = driver.findElement(By.id("ctl00_masterContent__enrollStart__enroll_panelNavTop6892_btnNext"));
		  _btnContinue.click();
		  
		  WebElement deptDropdown = driver.findElement(By.xpath("//input[@name='ctl00$masterContent$_enrollStart$_enroll$findPerson$_cboRelatedPerson']"));
		  deptDropdown.click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  WebElement personName = driver.findElement(By.xpath("//li[text()='3453242322 - Activity krypteret pga. GDPR. / Demo']"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(personName).perform();
		  action.click();
		  action.perform();
		  
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  WebElement _btnContinue1 = driver.findElement(By.id("ctl00_masterContent__enrollStart__enroll_panelNavTop6892_btnNext"));
		  _btnContinue1.click();
		  	
		  driver.findElement(By.xpath("//a[@id ='ctl00_masterContent__enrollStart__enroll_panelNavTop6892_btnSubmit']")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.close();

	}

}
