
import org.testng.annotations.*;

import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
  @Test
  public void MyFirstTest() throws InterruptedException {
	 
      System.setProperty(
              "webdriver.chrome.driver",
              "C:/eclipse-workspace/GitWorkspace/SeleniumJava/src/chromedriver.exe");
	// Initialize browser
	  WebDriver driver = new ChromeDriver();
	   
	  // Open Google
	  driver.get("http://www.google.com");
	  Thread.sleep(5000); 
	  // Close browser
	  driver.close();	  
	  
	  String myName="Suresh";
	  Assert.assertTrue(myName == "Suresh");
	  Reporter.log("Hello from TEST CASE 1");
  }
    
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
