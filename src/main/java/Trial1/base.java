package Trial1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;

	public WebDriver initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\shalini.n\\eclipse-workspace\\ExcelDriver3\\src\\main\\java\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.n\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shalini.n\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
}
