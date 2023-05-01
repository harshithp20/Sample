package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersTest {
	
	@Test(groups="smokeTest")
	public void m1()
	{
		WebDriver driver = null;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create();
		}
		driver.get(URL);
	
	}

}

