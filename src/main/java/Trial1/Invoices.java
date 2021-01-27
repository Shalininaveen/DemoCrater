package Trial1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Invoices {
	public WebDriver driver;

	public Invoices(WebDriver driver) {
		this.driver = driver;
	}

	public void getinvoice() throws IOException, InterruptedException {
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("CreateInvoice");

		driver.findElement(By.xpath("(//Span[text()='Invoices'])[1]")).click();
		driver.findElement(By.xpath("(//a[@href='/admin/invoices/create'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='text-lg']")).click();
		String a = data.get(1);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(a);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='" + a + "']")).click();
		Thread.sleep(1000);
		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Type or click to select an item']"));
		String b = data.get(2);
		enter.sendKeys(b);
		Thread.sleep(1000);
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(2000);
		System.out.println(
				driver.findElement(By.xpath("//div[contains(text(),'Invoice created successfully')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Send Invoice')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shalininaveen1996@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shalinisparkz1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'Cancel')])[1]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Mark as sent')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		

	}

}
