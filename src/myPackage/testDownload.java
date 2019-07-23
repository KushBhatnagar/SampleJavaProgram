package myPackage;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDownload {
	public static void main(String[] args){
		
		/*WebDriver driver;
	    File folder;
	    folder = new File(UUID.randomUUID().toString());
        folder.mkdir();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.dir", folder.getAbsolutePath());
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "image/jpeg, application/pdf, application/octet-stream");
        profile.setPreference("pdfjs.disabled", true);
        driver = new FirefoxDriver(profile);*/
		 WebDriver driver = new FirefoxDriver();
		   
			//System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
			 //WebDriver driver = new ChromeDriver();
			
		
		//Actions builder = new Actions(driver);
		WebDriverWait myWait = new WebDriverWait(driver,50);

			
	String baseURL="http://www.clipconverter.cc/";
	driver.get(baseURL);
	driver.manage().window().maximize();
	
	String[] urlLink={"https://youtu.be/VEA0ycoEG-w",
"https://youtu.be/FALv46SLkok",
"https://youtu.be/ADWbtWrG-Zo",
"https://youtu.be/tgIYm1Ud364",
"https://youtu.be/e0jkIe79r8A"
};
	
	for(int i=0;i<urlLink.length;i++){
		driver.findElement(By.xpath("//*[@id=\'mediaurl']")).sendKeys(urlLink[i]);
	    driver.findElement(By.xpath("//*[@id=\'submiturl']")).click();
	    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'submitconvert']/input"))).click();
	    
	    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'downloadbutton']/span"))).click();
	    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Convert another video']"))).click();
		
	}
	
		

}
}