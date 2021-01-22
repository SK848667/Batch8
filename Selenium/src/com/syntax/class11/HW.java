package com.syntax.class11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HW {

    /*
 TC:4 --> do on selenium project
Go to http://www.uitestpractice.com/
interact with drag and drop, iframe, double click
click on home
delete one user from the table
go to the next link
click on the ajax link and wait for the text
verify that the text is displayed
go to Form
and fill out everything
go to widgets
upload any file and verify it is uploaded
go to actions and perform all the necessary actions
go to SwitchTo
work with alerts and frames
go to select
perform actions on all dropdowns
  */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.uitestpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Controls Page  ////////////////////////////////////////////////////////////////
        //Drag and Drop control
        WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable, droppable).perform();
        //Button Double Click
        WebElement buttonDoubleClick = driver.findElement(By.name("dblClick"));
        action.doubleClick(buttonDoubleClick).perform();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        //Iframe
        driver.switchTo().frame("iframe_a");
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Hello World !!!");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        //Home Page /////////////////////////////////////////////////////////////////////////
        WebElement homeClick = driver.findElement(By.linkText("Home"));
        homeClick.click();
        //Delete User
        WebElement deleteUser = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]/button[3]"));
        deleteUser.click();
        Thread.sleep(2000);
        WebElement confirmDelete = driver.findElement(By.xpath("//input[@type='submit']"));
        confirmDelete.click();
        //AjaxCall Page  ///////////////////////////////////////////////////////////////////////
        Thread.sleep(2000);
        WebElement ajaxCallPage = driver.findElement(By.linkText("AjaxCall"));
        ajaxCallPage.click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Getting text from Ajax link
        WebElement ajaxlink = driver.findElement(By.xpath("//a[@data-ajax='true']"));
        ajaxlink.click();
        WebElement ajaxLinkText = driver.findElement(By.className("ContactUs"));
        System.out.println(ajaxLinkText.getText());
        //Form Page  ///////////////////////////////////////////////////////////////////////////
        WebElement formPage = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
        formPage.click();
        //User Application form
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Steve");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("Klyman");
        WebElement martialStatus = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[2]"));
        martialStatus.click();
        WebElement hobbyCheckBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]"));
        hobbyCheckBox.click();
        WebElement countrySelection = driver.findElement(By.id("sel1"));
        Select selectCountry = new Select(countrySelection);
        selectCountry.selectByVisibleText("Iceland");
        WebElement dateOfBirth = driver.findElement(By.id("datepicker"));
        dateOfBirth.click();
        WebElement birthMonthSelection = driver.findElement(By.className("ui-datepicker-month"));
        Select selectMonth = new Select(birthMonthSelection);
        selectMonth.selectByVisibleText("Feb");
        WebElement birthYearSelection = driver.findElement(By.className("ui-datepicker-year"));
        Select selectYear = new Select(birthYearSelection);
        selectYear.selectByVisibleText("1988");
        List<WebElement> birthdaysSelection = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement birthDay : birthdaysSelection) {
            if (birthDay.getText().equals("29")) {
                birthDay.click();
                break;
            }
        }
        WebElement phoneNumber = driver.findElement(By.id("phonenumber"));
        phoneNumber.sendKeys("5551234567");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("testusername");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@email.com");
        WebElement aboutYourself = driver.findElement(By.id("comment"));
        aboutYourself.sendKeys("Hello syntax");
        WebElement password = driver.findElement(By.id("pwd"));
        password.sendKeys("testpassword!");
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        System.out.println("User added");
        //Widgets Page  ///////////////////////////////////////////////////////////
        WebElement widgetsPage = driver.findElement(By.linkText("Widgets"));
        widgetsPage.click();
        //Choosing File and Uploaded
        WebElement chooseFile = driver.findElement(By.id("image_file"));
        chooseFile.sendKeys("C:\\Users\\SK\\IntelliJ\\Selenium\\src\\com\\syntax\\class11\\TestFile.xlsx");
        WebElement uploadFile = driver.findElement(By.xpath("//input[@type='button']"));
        uploadFile.click();
        WebElement uploadedText = driver.findElement(By.className("ContactUs"));
        System.out.println(uploadedText.getText());


        ///----------------------------------------


        //Actions Page  /////////////////////////////////////////////////////
        WebElement actionPage = driver.findElement(By.linkText("Actions"));
        actionPage.click();
        Thread.sleep(2000);

        //Click me
        WebElement clickMe = driver.findElement(By.xpath("//button[@name='click']"));
        clickMe.click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert.accept();
        //Double click me
        WebElement doubleClickMe = driver.findElement(By.xpath("//button[@name='dblClick']"));
        action.doubleClick(doubleClickMe).perform();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert.accept();
        //Drag and Drop
        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropMeHere = driver.findElement(By.id("droppable"));
        //////////Actions actions = new Actions(driver);
        action.dragAndDrop(dragMe, dropMeHere).perform();
        //SwitchTo Page   //////////////////////////////////////////////////
        WebElement switchTo = driver.findElement(By.linkText("Switch to"));
        switchTo.click();
        //Alert
        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alert']"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert.accept();
        //Confirm
        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirm']"));
        confirmButton.click();
        Thread.sleep(2000);
        Alert alert4 = driver.switchTo().alert();
        System.out.println(alert4.getText());
        alert.accept();
        //Prompt
        WebElement promptButton = driver.findElement(By.xpath("//button[@id='prompt']"));
        promptButton.click();
        Thread.sleep(2000);
        Alert prompAlert = driver.switchTo().alert();
        prompAlert.sendKeys("test");
        prompAlert.accept();
        WebElement printedText = driver.findElement(By.xpath("//div[@id='demo']"));
        System.out.println(printedText.getText());
        //Launch modal
        WebElement launchModal = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[4]"));
        launchModal.click();
        Thread.sleep(2000);
        WebElement modalWindow = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[1]"));
        modalWindow.click();
        //////// Select Page   ////////////////////////////////////////////////////////////////////////////
        WebElement selectPage = driver.findElement(By.linkText("Select"));
        selectPage.click();
        //Drop down
        WebElement singleSelect = driver.findElement(By.id("countriesSingle"));
        Thread.sleep(2000);
        Select select = new Select(singleSelect);
        List<WebElement> listOptions = select.getOptions();
        for (WebElement option : listOptions) {
            System.out.println("Options of countries: " + option.getText());
        }
        select.selectByVisibleText("United states of America");
        WebElement countrySelect = select.getFirstSelectedOption();
        System.out.println("country Selected: " + countrySelect.getText());
        //Multiple select
        WebElement MultipleSelect = driver.findElement(By.id("countriesMultiple"));
        Select multiCountrySelect = new Select(MultipleSelect);
        multiCountrySelect.selectByVisibleText("India");
        multiCountrySelect.selectByVisibleText("China");
        multiCountrySelect.selectByValue("england");
        List<WebElement> countiesSelected = multiCountrySelect.getAllSelectedOptions();
        for (WebElement webElement : countiesSelected) {
            System.out.println("Countries Selected: " + webElement.getText());
        }
        //Countries button
        WebElement countriesDDButton = driver.findElement(By.id("dropdownMenu1"));
        countriesDDButton.click();
        WebElement countrySelected = driver.findElement(By.linkText("United States of America"));
        countrySelected.click();
        Thread.sleep(3000);
        System.out.println("I am done with the tests and all tests passed");
        driver.close();
    }
}