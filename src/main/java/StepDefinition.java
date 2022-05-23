
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class StepDefinition {
    WebDriver driver;
    WebDriver wait;
    @Given("^user is on login page$")
    public void user_is_on_login_page() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.myntra.com/");

    }

    @When("^login page title is Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra$")
    public void login_page_title_is_online_shopping_for_women_men_kids_fashion_lifestyle_myntra() {

        String title = driver.getTitle();
        System.out.println(title);
        // Assert.assertEquals("login page title is Online Shopping for Women, Men, Kids
        // Fashion & Lifestyle - Myntra", title);
    }

    @Then("^user mouse hover on profile button$")
    public void user_mouse_hover_on_profile_button() {

        WebElement profile = driver
                .findElement(By.xpath("//span[@class='desktop-userTitle'][contains(text(),'Profile')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profile).build().perform();

    }

    @And("^clicks on login button$")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//a[contains(text(),'login / Signup')]")).click();

    }

    @Then("^user enters mobile number into the field$")
    public void user_enters_mobile_number_into_the_field()  {
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8169834449");

	/*	String alertMessage = driver.switchTo().alert().getText();
		System.out.print(alertMessage);

	1st
	  	driver.switchTo().alert().accept();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);

		2nd
		Alert alert =driver.switchTo().alert();
		String textonAlert = alert.getText();
		System.out.println(textonAlert);
		alert.accept();

		3rd
		driver.findElement(By.xpath("//div[contains(text(),'CONTINUE')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.alertIsPresent());

        4th need to inspect xpath
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		assertEquals("Your cancellation request has been successfully executed.",driver.findElement(By.xpath("")).getText().toString());
	*/}

    @And("^clicks on continue button$")
    public void clicks_on_continue_button() {
        driver.findElement(By.xpath("//div[contains(text(),'CONTINUE')]")).click();

    }
    @Then("^clicks on login with password$")
    public void clicks_on_login_with_password() {

        driver.findElement(By.xpath("//span[contains(text(),'Password')]")).click();
    }

    @And("^user enters password into the field$")
    public void user_enters_password_into_the_field() {

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("G@ayatree123");

    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();

    }

}
