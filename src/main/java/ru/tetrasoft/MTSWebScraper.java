package ru.tetrasoft;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class MTSWebScraper {
    static ChromeDriver driver = new ChromeDriver();
    private ConfigReader configReader;

    void setupTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    // Закрытие ChromeDriver
    @AfterAll
    static void teardown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public MTSWebScraper() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    static void openLoginPage() {
        driver.get("https://lk-b2b.mts.ru");
    }

    public void login(String username, String password) {
        // Реализуйте авторизацию
        String MTSLogin = this.configReader.getMTSLogin();
        String MTSPassword = this.configReader.getMTSPassword();

        driver.findElement(By.id("phoneInput")).sendKeys(MTSLogin);
        String s = "mts-button__inner";
        driver.findElement(By.className("mts-button__inner")).click();

        driver.findElement(By.id("password")).sendKeys(MTSPassword);
        driver.findElement(By.className("button__content")).click();
    }
/*
    public String getDataBalance(String phoneNumber) {
        WebElement searchBox = driver.findElement(By.id("phoneSearchInput"));
        searchBox.sendKeys(phoneNumber);
        searchBox.submit();

        WebElement dataBalanceElement = driver.findElement(By.id("dataBalance"));
        return dataBalanceElement.getText();
    }

    public void close() {
        driver.quit();
    }*/
}
