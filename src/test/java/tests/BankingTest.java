package tests;

import base.DriverFactory;
import base.BaseTest;
import org.testng.annotations.Test;
import services.BankingService;
import api.UserAPI;

public class BankingTest extends BaseTest {

    @Test
    public void bankingFlowTest() {

        BankingService service = new BankingService(DriverFactory.getDriver());

        service.performTransaction("Harry Potter", "1000", "500");

        UserAPI.validateUser();
    }
}