package basicJavaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingConfigPropertyFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		String browser = properties.getProperty("browser");
		String driveLocation = properties.getProperty("DriverLocation");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driveLocation);
			driver = new ChromeDriver();
		}	
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driveLocation);
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.co.in/");

	}

}
