package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddNewLanguagesPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(xpath="//*[@id='sidenav']/li[10]/a")
    public WebElement qualificationOption;

    @FindBy(id="addLanguage")
    public WebElement addLanguageButton;

    @FindBy(id="language_code")
    public WebElement languageDropDown;

    @FindBy(id="language_lang_type")
    public WebElement fluencyDropDown;

    @FindBy(id="language_competency")
    public WebElement competencyDropDown;

    @FindBy(id="btnLanguageSave")
    public WebElement addLanguageSaveButton;

    public AddNewLanguagesPage() {
        PageFactory.initElements(driver, this);
    }
}
