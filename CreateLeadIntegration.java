package week5.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadIntegration extends BaseTest {
	@Test(dataProvider="sendData")
	public void createLead(String companyname,String fname,String lname,String phno) throws InterruptedException
	{
		
	
		// TODO Auto-generated method stub
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");

				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
				driver.findElement(By.name("submitButton")).click();
	}	
	@DataProvider
	
public String sendData() throws IOException {
		ReadExcelIngrationwithdp r=new ReadExcelIngrationwithdp();
		String[][] data2 = r.sendData();
		
		return sendData();
	}

}
