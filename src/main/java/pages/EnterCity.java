package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wrappers.LeafTapsWrappers;

public class EnterCity extends LeafTapsWrappers{
	
	@When("Enter the (.*)")
	public void enterCity(String cityName){
		enterById("city", cityName);
	}
	
	@And("Click the enter")
	public void clickEnter(){
		WebElement textBox = driver.findElementById("city");
		textBox.sendKeys(Keys.ENTER);
	}
	
	@Then("User should see only five days of weather forecast")
	public void verifyThenFiveDaysWeatherForecast(){
		List<WebElement> ele = driver.findElementsByXPath("//div[@id='root']/div/div");
		if(ele.size() == 5){
			System.out.println("PASS!");
		}else{
			System.err.println("FAIL!");
		}
	}
	
	@But("User should see error message")
	public void verifyErrMsg(){
		String errMsg = driver.findElementByXPath("//div[@data-test='error']").getText();
		if(errMsg.equals("Error retrieving the forecast")){
			System.out.println("PASS!");
		}else{
			System.err.println("FAIL!");
		}
	}
	

}
