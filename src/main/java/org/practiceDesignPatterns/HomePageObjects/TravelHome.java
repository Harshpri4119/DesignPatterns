package org.practiceDesignPatterns.HomePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.practiceDesignPatterns.AbstractClass.SearchFlightAvail;
import org.practiceDesignPatterns.PageComponents.FooterNavBarItems;
import org.practiceDesignPatterns.PageComponents.HeaderNavBarItems;

public class TravelHome {

    WebDriver driver;
    By footerElement = By.id("traveller-home");
    By headerElement = By.xpath("//div[@id='buttons']");
    String url = "https://rahulshettyacademy.com/dropdownsPractise/";
    SearchFlightAvail searchFlightAvail;

    public TravelHome(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo(){
        driver.get(url);
        driver.manage().window().maximize();
    }
    public HeaderNavBarItems getHeaderNavBarItems(){
        return new HeaderNavBarItems(driver, headerElement);
    }

    public FooterNavBarItems getFooterNavbarItems(){
        return new FooterNavBarItems(driver, footerElement);
    }

    public void bookTrip(SearchFlightAvail searchFlightAvail){
        this.searchFlightAvail = searchFlightAvail;
    }

    public void checkAvail(String origin, String destination){
        searchFlightAvail.checkAvail(origin, destination);
    }

    // Removed the quit method as per the req. - Harsha Vardhan QAE
}
