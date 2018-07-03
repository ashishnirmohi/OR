	package learning;
	import java.io.IOException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import utility.ConfigReader;
	
	public class FirstProgram {
		WebDriver driver;
		
		@Test
		public void open() throws IOException, Exception {
			
			ConfigReader config = new ConfigReader();
			
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			
			driver = new ChromeDriver();
			
			driver.get(config.getApplicationURL()); Thread.sleep(4000);
			driver.manage().window().maximize(); Thread.sleep(2000);
			driver.quit();
				
		}
		
		
	}
