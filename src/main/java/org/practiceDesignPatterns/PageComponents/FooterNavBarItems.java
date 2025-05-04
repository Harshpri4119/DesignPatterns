package org.practiceDesignPatterns.PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.practiceDesignPatterns.AbstractClass.AbstractCLass;

public class FooterNavBarItems extends AbstractCLass {

    By flightElement = By.cssSelector("[title='Flights']");
    By footerLinks = By.cssSelector("a");

    public FooterNavBarItems(WebDriver driver, By element) {
        super(driver, element);
    }

    public String getFlights(){
        return dynamicElement(flightElement).getAttribute("class");
    }

    public int getAllLinks(){
        return findAllLinks(footerLinks).size();
    }
}
