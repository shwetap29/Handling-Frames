package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Shweta");
		Thread.sleep(2000);
		
		//Driver.switchTo().frame(1);
		
		//Enter into the frame1
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Thread.sleep(4000);
		
		//Select the value from dropdown
		//Select dropdown = new Select(driver.findElement(By.id("selectnav2")));
		//dropdown.selectByVisibleText("Home");
		
		driver.switchTo().defaultContent();  //Back to main page
		
		
		//Enter into Frame2
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		Thread.sleep(2000);
		
		//Select the value from dropdown
		Select dropdown = new Select(driver.findElement(By.id("selectnav2")));
		dropdown.selectByVisibleText("Contact");
		
		
		driver.close();
}
}
