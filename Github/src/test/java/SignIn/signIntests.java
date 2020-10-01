package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class signIntests {

    private static WebDriver driver;

    // import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\23490\\Desktop\\Github\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Input project URL = Postman Sign In page URL

        driver.get("https://github.com/login");
        // Global Waiting period
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Maximize the window

        driver.manage().window().maximize();
        // Get page title
        System.out.println(driver.getTitle());

        // locate username field
        driver.findElement(By.id("login_field")).sendKeys("kuforijiabdulwasiu@gmail.com");
        // locate the password field
        driver.findElement(By.id("password")).sendKeys("Kilani67");
        // click on the log in button
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[9]")).click();
        Thread.sleep (10000);

        driver.quit ();
}
    // initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        signIntests test = new signIntests ();
        test.setUp();
    }

}
