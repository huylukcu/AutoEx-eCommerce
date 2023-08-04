package tests.autoTesting;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC3_ImageInArrivals {
    @Test
    public void treeArrivalOnly() {

        Homepage homepage = new Homepage();
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());


//1) Open the browser

//2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get(ConfigurationReader.getProperty("au_url"));
        //3) Click on Shop Menu

        ReusableMethods.clickWithJS(homepage.shopButton);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitAndClick(homepage.shopButton,2);

        //4) Now click on Home menu button
        homepage.homeButton.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitAndClick(homepage.homeButton, 3);


        //5) Test whether the Home page has Three Arrivals only
        //6) The Home page must contain only three Arrivals
        jsexecutor.executeScript("window.scrollBy(0,1000)");
        int actualArrivals =homepage.threeArrivalOnly.size();
        int expectedArrivals = 3;
        Assert.assertEquals(actualArrivals,expectedArrivals);


        //7) Now click the image in the Arrivals
        String imageText= homepage.itemInImage1.getText().toLowerCase();
        homepage.image1.click();
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitAndClick(homepage.image1,5);

        //8) Test whether it is navigating to next page where the user can add that book into his basket.
        //9) Image should be clickable and should navigate to next page where user can add that book to his basket

        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(imageText));
        assert homepage.addToBasketButton.isDisplayed();

        Driver.closeDriver();
    }

}