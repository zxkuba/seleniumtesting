package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FIRSTNAME = "//div[contains(@class, \"mbm _1iy_ _a4y _3-90 lfloat _ohe\")]/div/div/input";
    public static final String XPATH_LASTNAME = "//div[contains(@class, \"mbm _1iy_ _a4y rfloat _ohf\")]/div/div/input";
    public static final String XPATH_MAIL = "//div[contains(@class, \"mbm _a4y\")]/div/div/input";
    public static final String XPATH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";

    //public static final String XPATH_HIDDENMAIL = "//div[contains(@id, \"u_0_u\" and @class, \"_5-ah\")]/di //public static final String XPATH_PASSWORD = "//div[contains(@id, \"password_field\")]/div/div/div/input";
    //public static final String XPATH_PASSWORD = "//*[@id=\"password_step_input\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");

        WebElement firstName = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstName.sendKeys("Jan");

        WebElement lastName = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastName.sendKeys("Kowalski");

        WebElement mail = driver.findElement(By.xpath(XPATH_MAIL));
        mail.sendKeys("jan.kowalski@gmail.com");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("3");

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("3");

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYar = new Select(year);
        selectYar.selectByValue("1986");

        //WebElement password = driver.findElement(By.xpath(XPATH_PASSWORD));
        //mail.sendKeys("123Frytki");

        //while (!driver.findElement(By.xpath(XPATH_HIDDENMAIL)).isDisplayed());

        //WebElement hiddenMail = driver.findElement(By.xpath(XPATH_HIDDENMAIL));
        //hiddenMail.sendKeys("jan.kowalski@gmail.com");

        //while (!driver.findElement(By.xpath(XPATH_PASSWORD)).isEnabled());


    }
}
