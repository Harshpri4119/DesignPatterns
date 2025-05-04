package org.practiceDesignPatterns.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.practiceDesignPatterns.AbstractClass.AbstractCLass;

public class HeaderNavBarItems extends AbstractCLass {

    By flightElement = By.cssSelector("[title='Flights']");
    By headerLinks = By.cssSelector("a");

    public HeaderNavBarItems(WebDriver driver, By headerElement) {
        super(driver, headerElement);
    }

    public String getFlights(){
        return dynamicElement(flightElement).getAttribute("class");
    }

    public int getAllLinks(){
        return findAllLinks(headerLinks).size();
    }
}
