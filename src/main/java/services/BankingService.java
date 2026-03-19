package services;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.CustomerPage;
import pages.AccountPage;

public class BankingService {

    WebDriver driver;

    public BankingService(WebDriver driver) {
        this.driver = driver;
    }

    public void performTransaction(String user, String deposit, String withdraw) {

        LoginPage loginPage = new LoginPage(driver);
        CustomerPage customerPage = new CustomerPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        loginPage.clickCustomerLogin();

        customerPage.selectUser(user);
        customerPage.clickLogin();

        accountPage.deposit(deposit);
        accountPage.withdraw(withdraw);
    }
}