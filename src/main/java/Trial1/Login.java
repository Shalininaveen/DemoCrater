package Trial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {

		this.driver = driver;
	}

	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Login Successful')]")).getText());
	}

}
