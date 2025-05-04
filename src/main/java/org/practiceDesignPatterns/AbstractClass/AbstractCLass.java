package org.practiceDesignPatterns.AbstractClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractCLass {

    WebElement element;

    public AbstractCLass(WebDriver driver, By element) {
        this.element = driver.findElement(element);
    }

    public WebElement dynamicElement(By findElementBy){
       return element.findElement(findElementBy);
    }

    public List<WebElement> findAllLinks(By findElementsBy){
        return element.findElements(findElementsBy);
    }
}
