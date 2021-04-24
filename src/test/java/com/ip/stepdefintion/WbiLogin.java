package com.ip.stepdefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbiLogin {

    private WebDriver driver;
    @Given("given the login url")
    public void givenTheLoginUrl() {
        System.setProperty("webdriver.chrome.driver", "C:\\rk\\suganya\\Studies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://whiteboxqa.com/login.php");

    }

    @When("put login credential")
    public void putLoginCredential() {
        WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        username.sendKeys("sugrrk06@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Woodranch1234$");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        login.click();

    }

    @Then("verify the profile title")
    public void verifyTheProfileTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("QA/QE/SDET Training.", title);


    }
}
