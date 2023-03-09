package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptsssPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Administrator\\eclipse-workspace\\JavaScript\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//QUES---1 INCOMPLETE
		
//		driver.get("http://www.greenstechnologys.com/");
//		
//		JavascriptExecutor je =(JavascriptExecutor) driver;
//		
//		WebElement down = driver.findElement(By.xpath("//img[contains(@src,'https')]"));
//		
//		Object a = je.executeScript("arguments[0].scrollIntoView(true)", down);
//		
////To convert Object into String
//				String string = a.toString();
//				System.out.println(string);
//		
//						
//		WebElement print = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
//		je.executeScript("arguments[0].getText", print);
		
		

		
		
//QUES--2
//		driver.get("http://toolsqa.com/");
//		
//		JavascriptExecutor je =(JavascriptExecutor) driver;
//		
//		WebElement down= driver.findElement(By.xpath("//span[text()='Youtube']"));
//		
//		je.executeScript("arguments[0].scrollIntoView(true)", down);
//		
//		WebElement up = driver.findElement(By.xpath("(//img[contains(@alt,'QA')])[1]"));
//		
//		je.executeScript("arguments[0].scrollIntoView", up);
		
//QUES---3
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		JavascriptExecutor je =(JavascriptExecutor) driver;
//		
//		WebElement down = driver.findElement(By.xpath("(//h2[contains(text(),'Test')])[6]"));
//		
//		je.executeScript("arguments[0].scrollIntoView(true)", down);
		
//QUES---4
//		driver.get("https://www.facebook.com/");
//		
//		JavascriptExecutor je =(JavascriptExecutor) driver;
//		
//		WebElement txtuser = driver.findElement(By.name("email"));
//		je.executeScript("arguments[0].setAttribute('value','vijayaragavan')", txtuser);
//		
//		WebElement txtpass = driver.findElement(By.name("pass"));
//		je.executeScript("arguments[0].setAttribute('value','987650')", txtpass);
//		
//		WebElement btn = driver.findElement(By.name("login"));
//		je.executeScript("arguments[0].click()", btn);
		
//QUES---5
//		driver.get("http://adactinhotelapp.com/");
//		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		
//		WebElement txtuser = driver.findElement(By.name("username"));
//		je.executeScript("arguments[0].setAttribute('value','vijayaragavan')", txtuser);
//		
//		WebElement txtpass = driver.findElement(By.name("password"));
//		je.executeScript("arguments[0].setAttribute('value','458762')", txtpass);
//		
//		WebElement btn = driver.findElement(By.name("login"));
//		je.executeScript("arguments[0].click()", btn);
		
//QUES---6
		driver.get("https://www.flipkart.com/");
		
		JavascriptExecutor je = (JavascriptExecutor) driver;

//set values using script writing
		WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'VJ')])[1]"));
		je.executeScript("arguments[0].setAttribute('value','arnold@gmail.com')",email);
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		je.executeScript("arguments[0].setAttribute('value','543210')",txtpass);
		
//		WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		je.executeScript("arguments[0].click()", btn);
		
//get values using script writing
		Object a = je.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(a);
		
		Object b = je.executeScript("return arguments[0].getAttribute('value')", txtpass);
		System.out.println(b);
		
//		String string = a.toString();
//		System.out.println(string);
//		
//		String a1=(String) b;
//		System.out.println(a1);  
		
        
		
	}

}
