package Trial1;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Item {
	public WebDriver driver;

	public Item(WebDriver driver) {
		this.driver = driver;
	}

	public void getitems() throws InterruptedException, IOException {
		dataDriven d = new dataDriven();
		ArrayList<String> data = d.getData("CreateItems");

		driver.findElement(By.xpath("//span[text()='Items']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/admin/items/create'])[1]")).click();
		String a = (String) data.get(1);
		String b = (String) data.get(2);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(b);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(2000);
		System.out
				.println(driver.findElement(By.xpath("//div[contains(text(),'Item created successfully')]")).getText());

	}

}
