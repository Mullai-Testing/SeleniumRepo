package week2.day3.homeactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				chromeDriver.findElement(By.linkText("Create Lead")).click();
				chromeDriver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("companyName9");
				chromeDriver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("firstName9");
				chromeDriver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("LastName9");
				chromeDriver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("firstNameLocal9");
				chromeDriver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("departmentName9");
				////textarea[@id='createLeadForm_description']
				chromeDriver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Description9");
				//input[@id='createLeadForm_primaryEmail']
				chromeDriver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@gmail.com");
			
				WebElement sourceDropdown = chromeDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				//instantiate Select Class
				//import org.openqa.selenium.support.ui.Select;
				Select dd1 = new Select(sourceDropdown);
				//3 methods to select 1.index 2.text 3. value
				
				//select the value or option
				dd1.selectByValue("NY");
				
				////input[@name='submitButton']
				chromeDriver.findElement(By.xpath("//input[@name='submitButton']")).click();
				//-  onClick the Create Button data created
				
				//- Click on the edit button.
				chromeDriver.findElement(By.linkText("Edit")).click();
				
				//Clear the Description Field.
				chromeDriver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
				//textarea[@id='updateLeadForm_importantNote']
				chromeDriver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("updateLeadForm_importantNote");
				// Click on the update button.
				////input[@value='Update']
				chromeDriver.findElement(By.xpath("//input[@value='Update']")).click();
				//Get the Title of the Resulting Page.
				//div[@id='sectionHeaderTitle_leads']
				String textTitle = chromeDriver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
				System.out.println(textTitle);
				//Close the browser window. 
				chromeDriver.close();
				
				
				
	}

}
