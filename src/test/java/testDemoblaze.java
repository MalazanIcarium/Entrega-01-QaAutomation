import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class testDemoblaze {
    private String url = PropertiesFile.getProperty("url");
    public WebDriver driver = DriverFactory.getDriver();

    @Test
    public void testDemoblaze() {
        driver.get(url);
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement laptopsCategory = driver.findElement(By.linkText("Laptops"));
        laptopsCategory.click();
        WebElement laptopSonyVaioI5 = driver.findElement(By.linkText("Sony vaio i5"));
        laptopSonyVaioI5.click();
        WebElement laptopPrice = driver.findElement(By.className("price-container"));
        laptopPrice.getText();
        
        driver.quit();        
    }

}
