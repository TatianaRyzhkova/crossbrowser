package com.uscommunities.general;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**

 * Contains methods that allow to perform most of the actions on page.

 * 

 * @author acui@uscommunities.org (Alan Cui)

 * 

 */

public class WebElmtAction {

	
	public WebElmtAction() {
		super();
	}


	public static void Click(final WebDriver driver, final By locator)
		      throws RuntimeException {
		    WebElement element = getElement(driver, locator);
		    element.click();
		    
		  }

	 public static WebElement getElement(WebDriver driver, By locator)
		      throws RuntimeException {
		    return driver.findElement(locator);
		  }
	 
	  /**

	   * Returns true if element is present. Use this if your element should be present immediately.

	   * @param driver

	   * @param locator

	   * @return true if element is present.

	   */
	 
	 public static boolean isElementPresent(WebDriver driver, By locator) {
		    try {
		      driver.findElement(locator);
		      return true;
		    } catch (Exception e) {
		      return false;
		    }
		  }
	 
	  /**

	   * Polls for a element and gets text from it.

	   * @param driver

	   * @param locator

	   * @param failureMsgToShowIfEmntNotFound

	   */
	 
	 public static String getText(final WebDriver driver, final By locator) {
		    if (isElementPresent(driver, locator)) {
		      return driver.findElement(locator).getText();
		    }
		    throw new ElementNotFoundException(locator, "Could not getText", driver);
		  }

	
	/**
	 * Go through the page and store all the links
	 * 
	 * @param driver
	 */
	public List<String> createLinkList(WebDriver driver) {
		List<String> hrefs = new ArrayList<String>();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = links.iterator();
			while(iterator.hasNext()) {
				WebElement link = iterator.next();
				hrefs.add(link.getAttribute("href"));
			}
				return hrefs;
		}
	
	/**
	 * Go through stored link list and validate each list is workable
	 * 
	 * @param driver
	 */
		
	public void iterateTroughLinkList(WebDriver driver, List<String> hrefs) {	
		Iterator<String> iterator = hrefs.iterator();
		while(iterator.hasNext()) {
			String href = iterator.next();			
			WebElement link = driver.findElement(By.cssSelector("a[href=" +href + "]"));
			link.click();
			
			driver.navigate().back();  
		
		}
	}
	  /**

	   * Returns the X location of the element.

	   * @param driver

	   * @param locator

	   * @return

	   */
	 public static int getElementPositionX(WebDriver driver, By locator) {
		    WebElement element = driver.findElement(locator);
		    return element.getLocation().getX();
		  }
	 
	  /**

	   * Returns the Y location of the element.

	   * @param driver

	   * @param locator

	   * @return

	   */

	  public static int getElementPositionY(WebDriver driver, By locator) {
		    WebElement element = driver.findElement(locator);
		    return element.getLocation().getY();
		  
	  }
	  
	  /**

	   * Resizes the browser to the size specified and refreshes the page. 

	   * @param driver

	   * @param int windowWidth

	   * @param int windowHeight

	   */

	  public static void resizeBrowserAndRefresh(WebDriver driver, int windowWidth,

	      int windowHeight) {

	    driver.manage().window().setPosition(new Point(0, 0));

	    driver.manage().window().setSize(new Dimension(windowWidth, windowHeight));

	    System.out.println("<b>Actual Browser Size:</b> " + getBrowserSize(driver));

	    driver.navigate().refresh();

	    System.out.println("Refreshed page");

	  }
	  
	  /**

	   * Returns the size of the current browser used by the test.

	   * @param driver

	   * @return browser size as {@link String} eg:"W:1600 H:900"

	   */

	  public static String getBrowserSize(WebDriver driver) {

	    return "W: " + driver.manage().window().getSize().getWidth() + " H: "

	        + driver.manage().window().getSize().getHeight();

	  }
	  
	  /**

	   * Opens the url.

	   * @param driver

	   */

	  public static void open(final WebDriver driver, String url) {

		  	 driver.get(url);

	  }
	
}
