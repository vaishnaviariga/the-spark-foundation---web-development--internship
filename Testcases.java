package org.klc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
public class Testcases {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		Thread.sleep(3000);
		System.out.println("Successfully getting the Sparks Foundation Home Page");

		driver.findElement(By.linkText("GRIP (Internship)")).click();
		Thread.sleep(3000);
		System.out.println("Successfully get into grip internship page");

		driver.findElement(By.linkText("Why Join Us")).click();
		Thread.sleep(300);
		System.out.println("clicked the why join us button"); 

		driver.findElement(By.name("Name")).sendKeys("Vaishnavi Ariga"); 
		Thread. sleep(3000);
		System.out.println("automatically entered the name");

		driver.findElement(By.name("Email")).sendKeys("vaishnavi.ariga@gmail.com");
		Thread.sleep(3000);
		System.out.println("automatically entered the gmailid"); 

		driver.findElement(By.linkText("Expert Mentor")).click(); 
		Thread.sleep(3800);
		System.out.println("Successfully clicked the Expert Mentor button"); 

		driver.findElement(By.linkText("Events Volunteer")).click(); 
		Thread.sleep(3000);
		System.out.println("Successfully clicked the Expert Volunteer button"); 

		driver.findElement(By.linkText("Management Volunteer")).click();
		Thread.sleep(3000); 
		System.out.println("Successfully clicked the Management Volunteer button");

		driver.findElement(By.linkText("Jobs at Tech in Asia")).click();
		driver.close();
		driver.quit();
		}

		}
