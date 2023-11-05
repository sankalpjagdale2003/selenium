package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SANKALP JAGDALE\\Downloads\\chromedriver_win32 (1)");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.example.com");

        driver.quit();
    }
}
