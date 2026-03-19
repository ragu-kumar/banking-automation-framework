package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AccountPage {

    WebDriver driver;
    WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By depositTab = By.xpath("//button[contains(text(),'Deposit')]");
    By withdrawTab = By.xpath("//button[contains(text(),'Withdrawl')]");
    By amountField = By.xpath("//input[@type='number']");
    By depositBtn = By.xpath("//button[text()='Deposit']");
    By withdrawBtn = By.xpath("//button[text()='Withdraw']");

    public void deposit(String amount) {

        wait.until(ExpectedConditions.elementToBeClickable(depositTab)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(amountField)).clear();
        driver.findElement(amountField).sendKeys(amount);

        wait.until(ExpectedConditions.elementToBeClickable(depositBtn)).click();
    }

    public void withdraw(String amount) {

        // Click withdraw tab
        wait.until(ExpectedConditions.elementToBeClickable(withdrawTab)).click();

        // Wait for NEW input field (fresh DOM)
        By withdrawInput = By.xpath("//form[contains(@ng-submit,'withdrawl')]//input");

        wait.until(ExpectedConditions.visibilityOfElementLocated(withdrawInput)).clear();
        driver.findElement(withdrawInput).sendKeys(amount);

        // Click withdraw button
        wait.until(ExpectedConditions.elementToBeClickable(withdrawBtn)).click();
    }
}