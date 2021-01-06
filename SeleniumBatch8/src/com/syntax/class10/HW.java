package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    /*
    HW
Go to aa.com/homePage.do
select depart date
select return date
select destination
click on search
quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigating to the page
        driver.get("https://www.aa.com/homePage.do");
        Thread.sleep(5000);

        WebElement book = driver.findElement(By.id("jq-findFlights"));
        book.click();
        WebElement roundTrip = driver.findElement(By.xpath("//span[text()='Round trip']"));
        roundTrip.click();
        //WebElement redeemMiles = driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[2]/div/label"));
        //redeemMiles.click();

        WebElement departFrom = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        departFrom.clear();
        departFrom.sendKeys("JFK");
        WebElement destinationTo = driver.findElement(By.name("destinationAirport"));
        destinationTo.sendKeys("KBP");
        WebElement numOfPass = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        numOfPass.sendKeys("2");

// departure
        WebElement calendarBtn1 = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][1]"));
        calendarBtn1.click();
        WebElement departMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String departureMonthText = departMonth.getText();
        while (!departureMonthText.equals("May")) {
            WebElement nextCalendarPage = driver.findElement(By.xpath("//a[@title = 'Next']"));
            nextCalendarPage.click();
            departMonth = driver.findElement(By.xpath("(//span[@class = 'ui-datepicker-month'])[1]"));
            departureMonthText = departMonth.getText();
        }
        List<WebElement> departDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement departDate : departDates) {
            if (departDate.getText().equals("11")) {
                departDate.click();
                break;
            }
        }

// return Btn
        WebElement calendatBtn2 = driver.findElement(By.id("aa-returningFrom"));
        calendatBtn2.click();
        ;
        WebElement returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        String returnMonthText = returnMonth.getText();
        while (!returnMonthText.equals("June")) {
            WebElement nextbuttonCalendar = driver.findElement(By.xpath("//a[@title = 'Next']"));
            nextbuttonCalendar.click();
            returnMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span"));
            returnMonthText = returnMonth.getText();
        }
        List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement returnDay : returnDays) {
            if (returnDay.getText().equals("13")) {
                returnDay.click();
                break;
            }
        }

// search
        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        Thread.sleep(2000);
        // driver.quit();
    }
}