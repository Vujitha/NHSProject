package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	WebDriver driver;
	Properties p;
	
	@Before
	public void setup() throws IOException
	{
	driver=Base.initilizeBrowser();
	p=Base.getProperties();
	driver.get(p.getProperty("appURL"));
	driver.manage().window().maximize();
	}
	
	@After
	public void teardown()
	{
	 driver.quit();	
	}

}
