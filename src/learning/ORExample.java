package learning;
	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class ORExample {
		
	WebDriver driver;
	@Test
	public void TestOR() throws Exception {
		
	File src = new File("./Configuration/config.property");
	
	FileInputStream fis = new FileInputStream(src);
	
	Properties pro = new Properties();
	
	pro.load(fis);
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\OR\\browser\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://brewbroker-react.herokuapp.com");
	WebElement jon = driver.findElement(By.xpath(pro.getProperty("join")));
	Assert.assertTrue(jon.isDisplayed());
	jon.click();
}
	
	
	
}
