package org.practiceDesignPatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.practiceDesignPatterns.AbstractClass.SearchFlightAvail;
import org.practiceDesignPatterns.HomePageObjects.TravelHome;
import org.practiceDesignPatterns.PageComponents.MultiTrip;
import org.practiceDesignPatterns.PageComponents.RoundTrip;
import org.testng.annotations.Test;

public class FlightTest {

    @Test
    public void flightTest(){

        WebDriver driver = new ChromeDriver();
        String origin = "ABC";
        String destination = "XYZ";


        TravelHome travelHome = new TravelHome(driver);
        travelHome.goTo();

        System.out.println("Footer Flight: " + travelHome.getFooterNavbarItems().getFlights());
        System.out.println("Header Flight: " + travelHome.getHeaderNavBarItems().getFlights());
        System.out.println("---");
        System.out.println("Footer Links: " + travelHome.getFooterNavbarItems().getAllLinks());
        System.out.println("Header Links: " + travelHome.getHeaderNavBarItems().getAllLinks());



        travelHome.bookTrip(new MultiTrip());
        travelHome.bookTrip(new RoundTrip());
        travelHome.checkAvail(origin, destination);

        travelHome.quitBrowser();
    }
}
