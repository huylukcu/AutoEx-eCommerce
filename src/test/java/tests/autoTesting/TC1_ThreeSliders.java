package tests.autoTesting;

import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class TC1_ThreeSliders {
    static Homepage homepage = new Homepage();

    @Test
    public static void main(String[] args) {
        //1) Open the browser
        //2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get(ConfigurationReader.getProperty("au_url"));

        //3) Click on Shop Menu

      homepage.shopButton.click();
      homepage.homeButton.click();

    }


//1) Open the browser

//2) Enter the URL “http://practice.automationtesting.in/”
//3) Click on Shop Menu
//4) Now click on Home menu button
//5) Test whether the Home page has Three Sliders only
//6) The Home page must contains only three sliders

}

