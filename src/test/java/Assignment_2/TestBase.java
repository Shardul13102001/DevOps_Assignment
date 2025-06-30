package Assignment_2;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class TestBase {
	
	static WebDriver driver;
	static String nodeURL;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) throws Exception
	{
		System.out.println("Browser received from XML: " + browser);
		nodeURL = "http://localhost:4444/wd/hub";

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new RemoteWebDriver(new URL(nodeURL), options);
        } else {
            throw new Exception("Browser not supported: " + browser);
        }
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
