package Webstrnt_Flow;

import java.io.IOException;
import java.util.List;

import Pages_packages.HomePage_Webstraunt;
import org.junit.Assert;
import org.junit.Before;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Webstrnt_E2E_Flow extends TestBase {
	HomePage_Webstraunt Hm;
	public Webstrnt_E2E_Flow() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException {
		intilization();
		//HomePage_Webstraunt Hm = new HomePage_Webstraunt();

	}
	@Test
	public void HomePageTest_E2EFlow() throws InterruptedException {
		//Hm.SendTextinSearchInput();

		driver.findElement(By.xpath("//input[@id='searchval']")).sendKeys("stainless work table");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 rounded-l-none rounded-r-normal box-border text-base-1/2 leading-4 m-0 py-2 px-2 capitalize align-top w-24 z-10 xs:py-3 xs:px-5 xs:w-auto  bg-blue-300 hover:bg-blue-600 text-white text-shadow-black-60 bg-linear-gradient-180-blue border-black-25 shadow-inset-black-17 align-middle font-semibold']")).click();
		List<WebElement> Tables = driver.findElements(By.xpath("//div[starts-with(@class,'ag-item')]"));
		System.out.println(Tables.size());

		for(WebElement webelement:Tables){
			String name = webelement.getText();
			System.out.println(name);
			Assert.assertTrue(name.contains("Table"));
		}
		Thread.sleep(4000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//input[@class='btn btn-cart btn-small']")).click();
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//input[@class='item_number' and Value='600ebt3072d']")).click();
		driver.findElement(By.xpath("//span[@class='bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 group-hover:bg-green-600 group-hover:bg-top-bottom-4-1/2 rounded-r rounded-l flex items-center text-sm-1/2 py-1 pr-2 pl-2-1/2 xxxs:rounded-r-none  hover:bg-green-600 text-white text-shadow-black-60 bg-green-primary bg-linear-gradient-180-green border-black-25 shadow-inset-black-17 align-middle font-semibold']")).click();
		driver.findElement(By.xpath("//button[@class='emptyCartButton btn btn-mini btn-ui pull-right']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='bg-origin-box-border bg-repeat-x border-solid border box-border cursor-pointer inline-block text-center no-underline hover:no-underline antialiased hover:bg-position-y-15 mr-2 rounded-normal text-base px-7 py-2-1/2 hover:bg-green-600 text-white text-shadow-black-60 bg-green-primary bg-linear-gradient-180-green border-black-25 shadow-inset-black-17 align-middle font-semibold']")).click();
	}
	@AfterMethod
	public void Quit(){
driver.quit();
	}
}
