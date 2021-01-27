package Trial1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Estimates {
	public WebDriver driver;

	public Estimates(WebDriver driver) {
		this.driver = driver;
	}

	public void getestimate() throws InterruptedException, IOException {
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("CreateEstimate");

		driver.findElement(By.xpath("(//a[@href='/admin/estimates'])[1]")).click();
		driver.findElement(By.xpath("(//a[@href='/admin/estimates/create'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='text-lg']")).click();
		String a = data.get(1);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(a);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='" + a + "']")).click();
		Thread.sleep(1000);
		WebElement enter = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String b = data.get(2);
		enter.sendKeys(b);
		Thread.sleep(1000);
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[1]")).click();
		Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.xpath("//div[contains(text(),'Estimate created successfully')]")).getText());

	}

}
