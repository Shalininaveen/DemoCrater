package Trial1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestSuite extends base {
	public WebDriver driver;

	public TestSuite() throws IOException {
		this.driver = initializedriver();
		this.driver.get("https://demo.craterapp.com/");
		this.driver.manage().window().maximize();

	}

	@Test
	public void testcase1() throws InterruptedException, IOException {

		Login log = new Login(this.driver);
		log.login();
	}

	@Test
	public void testcase2() throws InterruptedException, IOException {

		Customers cust = new Customers(this.driver);
		cust.getcustomers();
	}

	@Test
	public void testcase3() throws InterruptedException, IOException {

		Item cust = new Item(this.driver);
		cust.getitems();
	}

	@Test
	public void testcase4() throws InterruptedException, IOException {

		Estimates est = new Estimates(this.driver);
		est.getestimate();
	}

	@Test
	public void testcase5() throws InterruptedException, IOException {
		Invoices in = new Invoices(this.driver);
		in.getinvoice();
	}

	@Test
	public void testcase6() throws InterruptedException, IOException {
		Payment pay = new Payment(this.driver);
		pay.getpayment();

	}

	@Test
	public void testcase7() throws InterruptedException, IOException {
		Expense exp = new Expense(this.driver);
		exp.getexpense();

	}

}
