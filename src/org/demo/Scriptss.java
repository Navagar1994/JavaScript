    package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptss {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\JavaScript\\Driver\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
//set values using "executeScript" using script writing
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement txtuser = driver.findElement(By.name("email"));
		je.executeScript("arguments[0].setAttribute('value','vijayaragavan')", txtuser);
		
		WebElement txtpass = driver.findElement(By.name("pass"));
		je.executeScript("arguments[0].setAttribute('value','987654')", txtpass);
		
//		WebElement btn = driver.findElement(By.name("login"));
//		je.executeScript("arguments[0].click()", btn);
		
//get  values using executeScript method using script writing
		
		Object a = je.executeScript("return arguments[0].getAttribute('value')", txtuser);
		System.out.println(a);

		Object b = je.executeScript("return arguments[0].getAttribute('value')", txtpass);
		System.out.println(b);
		
// To convert Object into String
		//There are 2 types
		
//toString--->>> to convert object into String
		String string = a.toString();
		System.out.println(string);
		
//Type casting--->>> To convert Object into string
		String a1=(String) b;
		System.out.println(a1);
		
//Scroll down & scroll up
		
		WebElement down = driver.findElement(By.xpath("//a[contains(text(),'and')]"));
		 je.executeScript("arguments[0].scrollIntoView(true)", down);
		
	//	WebElement txtuser = driver.findElement(By.name("email"));
		je.executeScript("arguments[0].scrollIntoView(false)", txtuser);  // scrollup to username textbox we already found webelement for
		                                                                  //username textbox
		
		
	}

}
