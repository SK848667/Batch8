package com.syntax.class09;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW_calendar_checkMark extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement leaveButton = driver.findElement(By.linkText("Leave"));
        leaveButton.click();
        WebElement leaveListButton = driver.findElement(By.linkText("Leave List"));
        leaveListButton.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
        WebElement mDD = driver.findElement(By.className("ui-datepicker-month"));
        Select monthDD = new Select(mDD);
        monthDD.selectByVisibleText("May");
        WebElement yDD = driver.findElement(By.className("ui-datepicker-year"));
        Select yearDD = new Select(yDD);
        yearDD.selectByVisibleText("2021");
        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement fromDate:fromDates){
            if(fromDate.getText().equals("1")){
                fromDate.click();
                break;
            }
        }
        WebElement toCalendar=driver.findElement(By.id("calToDate"));
        toCalendar.click();
        WebElement toMonth=driver.findElement(By.className("ui-datepicker-month"));
        Select toMonthDD=new Select(toMonth);
        toMonthDD.selectByVisibleText("May");
        WebElement toYear=driver.findElement(By.className("ui-datepicker-year"));
        Select toYearDD=new Select(toYear);
        toYearDD.selectByVisibleText("2021");
        List<WebElement> toDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement toDate:toDates){
            if(toDate.getText().equals("30")){
                toDate.click();
                break;
            }
        }
        WebElement cancelledCheckbox=driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        cancelledCheckbox.click();
        WebElement rejectedCheckbox= driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
        rejectedCheckbox.click();
        WebElement pendingCheckBox= driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        pendingCheckBox.click();
        WebElement subUnit=driver.findElement(By.id("leaveList_cmbSubunit"));
        Select itSupportDD=new Select(subUnit);
        itSupportDD.selectByVisibleText("IT Support");
        WebElement searchButton= driver.findElement(By.id("btnSearch"));
        searchButton.click();
        driver.quit();
    }

}
