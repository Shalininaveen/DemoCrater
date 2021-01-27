package Trial1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Expense {
	public WebDriver driver;

	public Expense(WebDriver driver) {
		this.driver = driver;
	}

	public void getexpense() throws InterruptedException, IOException {
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("CreateExpense");

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//Span[text()='Expenses'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/admin/expenses/create']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select a category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Add New Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("nemo");
		driver.findElement(By.xpath("//button[2]")).click();
		String a = data.get(1);
		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Select a customer']"));
		enter.sendKeys(a);
		enter.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(1000);
		System.out.println(
				driver.findElement(By.xpath("//div[contains(text(),'Expense created successfully')]")).getText());
		driver.close();

	}

}
