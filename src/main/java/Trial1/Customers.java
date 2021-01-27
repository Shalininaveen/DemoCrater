package Trial1;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customers {
	public WebDriver driver;

	public Customers(WebDriver driver) {
		this.driver = driver;
	}

	public void getcustomers() throws InterruptedException, IOException {
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("CreateCustomer");

		driver.findElement(By.xpath("(//a[@href='/admin/customers'])[1]")).click();
		driver.findElement(By.xpath("(//a[@href='/admin/customers/create'])[2]")).click();
		Thread.sleep(3000);
		String a = data.get(1);
		String b = data.get(2);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(a);
		driver.findElement(By.xpath("//input[@label='Contact Name']")).sendKeys(b);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.xpath("//div[contains(text(),'Customer created successfully')]")).getText());

	}

}
