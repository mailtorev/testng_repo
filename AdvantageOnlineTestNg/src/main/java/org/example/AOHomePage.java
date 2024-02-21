package org.example;


import org.openqa.selenium.WebDriver;

public class AOHomePage {

    WebElement header;

    public AOHomePage() {
    }

    public String getTitle(){

        pageTitle = driver.getTitle();

        return pageTitle;
    }


}
