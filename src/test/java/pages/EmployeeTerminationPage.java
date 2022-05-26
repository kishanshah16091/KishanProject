package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeTerminationPage extends CommonMethods {

    @FindBy(xpath="//input[@id='btnTerminateEmployement']")
    public WebElement termBtn;

    @FindBy(xpath="//input[@id='dialogConfirm']")
    public WebElement Confirm;

    @FindBy(xpath="//input[@id='btnTerminateEmployement']")
    public WebElement Activate;

    public EmployeeTerminationPage(){
        PageFactory.initElements(driver, this);
    }
}
