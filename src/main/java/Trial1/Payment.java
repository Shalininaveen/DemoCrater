package Trial1;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Payment {
	public WebDriver driver;

	public Payment(WebDriver driver) {
		this.driver=driver;
	}

	public void getpayment() throws InterruptedException, IOException {
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("CreatePayments");

		driver.findElement(By.xpath("(//Span[text()='Payments'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/admin/payments/create']")).click();
		Thread.sleep(1000);
		String b = data.get(2);
		driver.findElement(By.xpath("//label[text()=' Payment Number ']//following::input")).sendKeys(b);
		String a = data.get(1);
		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Select a customer']"));
		Thread.sleep(5000);
		enter.sendKeys(a);
		Thread.sleep(5000);
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Select Invoice']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'INV')])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select payment mode']")).click();
		driver.findElement(By.xpath("//span[text()='Cash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.xpath("//div[contains(text(),'Payment created successfully')]")).getText());

	}

}
