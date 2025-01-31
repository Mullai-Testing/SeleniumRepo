package week2.day5.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBagsSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//03) Type "Bags for boys" in the Search box
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		
		//04) Choose the 	 item in the result (bags for boys)
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		
		//05) Print the total number of results (like 50000)
		Thread.sleep(1000);
		String textHeader = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']//h2/span[1]")).getText();
	    System.out.println("textHeader : " + textHeader + " bags for boys");
	    
	    //06) Select the first 2 brands in the left menu
	    //Thread.sleep(500);
	    driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item'])[1]")).click();
	   // Thread.sleep(500);
	    driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item'])[2]")).click();
	    
	    //07) Choose New Arrivals (Sort)
	    driver.findElement(By.xpath("//span[@class='a-dropdown-container']")).click();
	    driver.findElement(By.xpath("//div[@class='a-popover-wrapper']//li[5]")).click();
	    
	    //08) Print the first resulting bag info (name, discounted price)
String textFirstBagInfo = driver.findElement(By.xpath("(//div[@data-component-type=\"s-search-result\"])[1]//div[@data-cy='title-recipe']//a//h2//span")).getText();
		System.out.println("Name: "+ textFirstBagInfo);
		String textFirstBagInfoOff = driver.findElement(By.xpath("(//div[@data-component-type=\"s-search-result\"])[1]//div[@data-cy='price-recipe']//div[@class='a-row']/span[2]")).getText();
		System.out.println("Offer : "+ textFirstBagInfoOff);
		
		//09) Get the page title and close the browser(driver.close())
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+ pageTitle);
		
		driver.close();
	}

}
