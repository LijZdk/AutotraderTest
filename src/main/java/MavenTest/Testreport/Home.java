package MavenTest.Testreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	
	WebDriver driver;
	String postC = "W127TQ";
	
	By Title = By.xpath("//*[@id=\"home\"]/header/nav[2]/a");
	By Postcode = By.id("postcode"); 
	By DisOpt = By.id("radius");
	By Distance = By.xpath("//*[@id=\"radius\"]/option[20]"); //National
	By carMakeOpt = By.id("searchVehiclesMake");
	By CarMake = By.xpath("//*[@id=\"searchVehiclesMake\"]/option[9]"); //Ashton Martin
	By CarModel = By.id("searchVehiclesModel");
	By CarModelOpt = By.xpath("//*[@id=\"searchVehiclesModel\"]/option[15]");
	By SearchBar = By.id("search"); 
	By AshtonTitle = By.id("Aston Martin V8 5.3 Vantage Volante 2dr");
	By AshtonClick = By.xpath("//*[@id=\"201706066171061\"]/article/section[1]/div/h2/a");
	
	public Home(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}
	
	public void selectPostCode() {
		
		driver.findElement(Postcode).click();
		
	}
	
	public void selectDisOp() {
		
		driver.findElement(DisOpt).click();
		
	}
	
	public void selectDistance() {
		
		driver.findElement(Distance).click();
		
	}
	
	public void selectCarMkeOpt() {
		
		driver.findElement(carMakeOpt).click();
		
	}
	
	public void selectCarMake() {
		
		driver.findElement(CarMake).click();
		
	}
	
	public void selectCarModOpt() {
		
		driver.findElement(CarModelOpt).click();
		
	}
	
	public void SelectSearch() {
		
		driver.findElement(SearchBar).click();
		
	}
	
	public void selectCarModel() {
		
		driver.findElement(CarModel).click();
		
	}
	
	public void selectAshton() {
		
		driver.findElement(AshtonClick).click();
		
	}
	
}
