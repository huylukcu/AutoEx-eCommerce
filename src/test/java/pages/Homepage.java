package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Homepage {
    public Homepage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Shop")
    public WebElement shopButton;
    @FindBy(linkText = "Home")
    //@FindBy(xpath = "//a[.='Home']")
    public WebElement homeButton;
    @FindBy (xpath = "//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]")
    public WebElement threeSliders;

    @FindBy(xpath = "//div[@data-slide-duration='0']")
    public List<WebElement> threeSlidersOnly;

    @FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
    public List<WebElement> threeArrivalOnly;

    @FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[1]//img")
    public WebElement image1;

    @FindBy(xpath = "//button[.='Add to basket']")
    public WebElement addToBasketButton;
    @FindBy(xpath = "//div[@class='woocommerce-message']")
    public WebElement messageText;

    @FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[1]//h3")
    public WebElement itemInImage1;

    @FindBy(xpath = "//div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div[3]//h3")
    public WebElement itemInImage3;

    @FindBy(xpath = "//img[@title='Mastering JavaScript']")
    public WebElement image3LessThan450;

    @FindBy(css = "li[class='description_tab active']")
    public WebElement descriptionButton;

    @FindBy(xpath = "//div[@id='tab-description']/p")
    public WebElement descriptionText;
    @FindBy(xpath = "//span[@class='posted_in']/a")
    public WebElement categoryOfBook;





}
