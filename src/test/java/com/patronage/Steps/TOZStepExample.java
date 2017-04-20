package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.TOZObjectExample;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


public class TOZStepExample extends DriverFactory implements En{

    String baseUrl = "http://www.toz.pl/";
    TOZObjectExample toe = PageFactory.initElements(driver, TOZObjectExample.class);

    public TOZStepExample()
    {

        Given("^user is on startpage$", () -> {
            driver.get(baseUrl);
        });

        Then( "^user should see results in footer$", () -> {

            //Name
            Assert.assertTrue( toe.getFooter().getText().contains("Towarzystwo Opieki nad Zwierzętami"));

            //Address
            Assert.assertTrue( toe.getFooter().getText().contains("ul. Noakowskiego 4, 00-666 Warszawa"));

            //Contact
            Assert.assertTrue( toe.getFooter().getText().contains("tel. 22 825-75-35, faks: 22 825-60-49"));

            //Account Number
            Assert.assertTrue( toe.getFooter().getText().contains("48 1030 1582 0000 0008 1026 2001"));
        });
    }


}
