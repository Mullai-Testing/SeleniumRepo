package week2.day3.homeactivity;
/*
 Assignment Details:	Delete an existing lead on a web page using Selenium WebDriver to interact with web
elements.

Requirements:
- Enter the username.			- Enter the password.		- Click the Login button.
- Click the "crm/sfa" link.		- Click the "Leads" link.	- Click "Find leads."	
- Click on the "Phone" tab.		- Enter the phone number.	
- Click the "Find leads" button.	- Capture the lead ID of the first resulting lead.
- Click the first resulting lead.	- Click the "Delete" button.
- Click "Find leads" again.			- Enter the captured lead ID.	- Click the "Find leads" button.

- Verify the presence of the message "No records to display" in the Lead List. This
message confirms the successful deletion.
- Close the browser.

Hints to Solve:
- Use Selenium WebDriver methods such as findElement(), getTitle(),
getText(),click(),sendKeys() and close() to perform the required actions. 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		//Precondition:
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://leaftaps.com/opentaps/");
		chromeDriver.manage().window().maximize();
		
		//- Enter login and click
		chromeDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		chromeDriver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//- Click the "crm/sfa" link.		- Click the "Leads" link.	
		//a tag 
		chromeDriver.findElement(By.linkText("CRM/SFA")).click();
		chromeDriver.findElement(By.linkText("Leads")).click();
		
		//- Click "Find leads."
		//- Click on the "Phone" tab.		- Enter the phone number.	
		chromeDriver.findElement(By.linkText("Find Leads")).click();
		//span[contains(text(),'Phone')]
		chromeDriver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//input[@name='phoneNumber']
		
		//- Capture the lead ID of the first resulting lead.
		//Note - Lead not present for the matching phone number
		//ask what to do
		chromeDriver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		
		
		//- Capture the lead ID of the first resulting lead.
		//Note - Lead  present for the matching phone number
		//- Click the "Find leads" button.	
		//button[contains(text(),'Find Leads')]
		
		chromeDriver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//shows the resulting lead.
		//- Capture the lead ID of the first resulting lead.
		//- Click the first resulting lead.
		
		//class
		//div[contains(@class,'x-grid3-col-partyId')]/a
		Thread.sleep(1000);
		
		String LinkID = chromeDriver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).getText();
		System.out.println(LinkID);
		chromeDriver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		//View Lead Window opens
		
		// - Click the "Delete" button. 
		chromeDriver.findElement(By.linkText("Delete")).click();
		
		//Thread.sleep(1000);
		chromeDriver.findElement(By.linkText("Find Leads")).click();		
		//- Click "Find leads" again.
		
		//- Enter the captured lead ID. 
		////input[@name='id']
		
		chromeDriver.findElement(By.xpath("//input[@name='id']")).sendKeys(LinkID);
		//- Click the "Find leads" button.
		Thread.sleep(1000);
		chromeDriver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		//- Verify the presence of the message "No records to display" in the Lead List. 
		//This message confirms the successful deletion.
		
		// - Close the browser
		chromeDriver.close();

		
		
	}

}
