package myPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import  java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sun.jna.platform.win32.BaseTSD.SSIZE_T;


public class TestUpload {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		//WebDriverWait myWait = new WebDriverWait(driver,50);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	String baseURL="http://yahoo_messenger.en.downloadastro.com/";
		driver.get(baseURL);
	
		//Code to upload file
		/*String baseURL="D:\\SeleniumTests\\test-Upload.html";
	
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("uploadsubmit")).sendKeys("D:\\SeleniumTests\\test.txt");
	driver.findElement(By.cssSelector("input[value='SUBMIT']")).click();
	*/
		
		//Code to download file
		String sourceLocation = driver.findElement(By.id("push_button")).getAttribute("href");
		System.out.println(sourceLocation);
		String wget_command="cmd /c wget -P d: "  + sourceLocation;
		System.out.println(wget_command);
		
		try{
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal=exec.waitFor();
			System.out.println("Exit Value: " + exitVal);
			}
		catch (InterruptedException | IOException ex){
			System.out.println(ex.toString());
		}
		
	
/*	driver.findElement(By.name("USER_NAME")).sendKeys("System");
	driver.findElement(By.name("PASSWORD")).sendKeys("password");
	driver.findElement(By.className("loginInner")).click();
	
	//Navigating to Table Editor
	driver.findElement(By.id("_directoryInput")).clear();
	driver.findElement(By.id("_directoryInput")).sendKeys("Master Tables");
	builder.sendKeys(Keys.ENTER).perform();
	
		
	//Clicking on Item Master table and upload the file
	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"AT_AlertMsg_AfterCustomize\"]/span/a/span")));
	//driver.findElement(By.xpath("//*[@id=\"directory\"]/div/div/div/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"AT_AlertMsg_AfterCustomize\"]/span/a/span")).click();
	
	driver.findElement(By.xpath("//*[@id=\"dataUpload\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"fil_serverFile\"]")).sendKeys("D:\\MINIDATA.EntityItemTemplate.xlsx");
	driver.findElement(By.xpath("//*[@id=\"uploadFile\"]/span")).click(); */
	
	
		driver.quit();   
	
	
	}

}
