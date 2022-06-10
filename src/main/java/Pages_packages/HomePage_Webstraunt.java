package Pages_packages;

import java.io.IOException;

import Base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Webstraunt extends TestBase {

	public HomePage_Webstraunt() throws IOException {
	//	PageFactory.initElements(driver,HomePage_Webstraunt.class);
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="searchval")
	public WebElement SearchInputText;

	@FindBy(xpath="//button[contains(text(),'Search')]")
	public WebElement SearchButton;



	public void SendTextinSearchInput(){
		SearchInputText.sendKeys("stainless work table");
	}
	
}
