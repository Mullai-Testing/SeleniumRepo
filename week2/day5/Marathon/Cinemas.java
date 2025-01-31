package week2.day5.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		// Set the implicit wait timeout (15 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click on Cinema under Quick Book
		driver.findElement(By.className("cinemas-inactive")).click();
		
		//5) Select Your Cinema location
		//Thread.sleep(1000);
		//click the button to view wrapper list
		driver.findElement(By.id("cinema")).click();
		
		//5) Select Your Cinema
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[8]")).click();
		
		
		//view wrapper list auto selected from here based dev code
		//6) Select Your Date as Tomorrow
		//not selected so sleep
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[2]")).click();
		
		//7) Select Your Movie
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[8]")).click();
		
		
		//8) Select Your Show Time
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[1]")).click();
		
		//9) Click on Book Button
	    driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
	   
	    //10) Click Accept on Term and Condition popup
	    
	    WebElement visibleAcceptWindowElement=driver.findElement(By.xpath("//div[contains(@class,'p-dialog-enter-done')]"));
		System.out.println("Popup Accept window closed. This is element : "+visibleAcceptWindowElement);
		
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[2]")).click();
		
		//11) Click any one available seat
		//div[@class='all-seats']//tr[6]//td[4]
		////span[@id='SL.SILVER|I:15']
		//Thread.sleep(1000);  
		//"(//span[@class='seat-current-pvr'])[9]"
		driver.findElement(By.xpath("//div[@class='all-seats']//tr[6]/td[18]/span")).click();
		
	
		String seatNo= driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		
		System.out.println("seatNo: "+seatNo);
		System.out.println("grandTotal: "+grandTotal);
	

		//12) Click Proceed Button
	    driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		//Thread.sleep(1000);
	   
	    //Click next Proceed Button
		driver.findElement(By.xpath("//div[@class='register-btn col-md-3']/button")).click();
		//button[@class='sc-dQpIV kXNFEA btn-proceed"ed']
		System.out.println("Proceeded button clicked");
		
		//16) Close the popup
		Thread.sleep(1000); 
		System.out.println("Popup opened");
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//17) Print Your Current Page title
		String pageTitle=driver.getTitle();
		System.out.println("Page  Title: "+ pageTitle);
		//18) Close Browser
		driver.close();

		
		
	}

}
