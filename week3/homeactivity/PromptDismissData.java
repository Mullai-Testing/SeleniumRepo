package week3.day1.homeactivity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptDismissData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Precondition:
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	
		// - Click on the "Prompt Box" button to trigger the alert.
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//- Switch to the alert 
		Alert alertConfirm = driver.switchTo().alert();
		
		
		//and type a message in the alert box.
		alertConfirm.sendKeys("TestDismiss");
		
		//to check what entered in alert box
		Thread.sleep(2000);
		//- Retrieve the typed text from the alert and verify it
		String textDismisseddata = alertConfirm.getText();
		System.out.println("Message typed in Dismissed prompt: "+textDismisseddata);
		
		//Thread.sleep(4000);
		// - Dismiss the alert.
		alertConfirm.dismiss();
		
		//- Retrieve the typed text from the alert and verify   //span[@id='confirm_result']
	
		String textConfirmdata =driver.findElement(By.id("confirm_result")).getText();
		System.out.println("Message typed after Dismissed prompt: "+textConfirmdata);
	}

}
