package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CustomerPage {

    WebDriver driver;
    WebDriverWait wait;

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By userDropdown = By.id("userSelect");
    By loginBtn = By.xpath("//button[text()='Login']");

    public void selectUser(String name) {

        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(userDropdown)).click();

        // Select user from dropdown options
        By userOption = By.xpath("//option[text()='" + name + "']");
        wait.until(ExpectedConditions.elementToBeClickable(userOption)).click();
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}