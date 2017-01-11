package com.GDocs.steps;

import com.GDocs.steps.genericSteps.TestBase;
import com.GDocs.views.GDocsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.commons.jxpath.Container;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Valeria Marc on 11/27/2016.
 */
public class GDocsSteps extends TestBase {
    private GDocsPage gDocsPage = PageFactory.initElements(driver, GDocsPage.class);

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String link) {
        driver.get(link);
    }


    @And("^I login to existing account$")
    public void iLoginToExistingAccount() throws InterruptedException {
        driver.findElement(By.id("Email")).click();
        Thread.sleep(1000);
        gDocsPage.getUsername().sendKeys("tesstarre2017@gmail.com");
        gDocsPage.getNextButton().click();
        //driver.findElement(By.id("Passwd")).click();
        Thread.sleep(1000);
        gDocsPage.getPassword().sendKeys("istqb2017");
        gDocsPage.getSignInButton().click();
    }

    @And("^I create new presentation slide$")
    public void iCreateNewPresentationSlide() throws InterruptedException {
      gDocsPage.getMenuButton().click();
        Thread.sleep(2000);
        driver.findElement(By.className("docs-homescreen-leftmenu-menuitem-text"));
        gDocsPage.getSlideDoc().click();
        Thread.sleep(2000);
        driver.findElement(By.className("docs-homescreen-fcc-flex-content-wrapper"));
        gDocsPage.getNewSlide().click();


    }

    @And("^I add text into first slide$")
    public void iAddTextIntoFirstSlide()  {

    }

    @Then("^I download the created slide$")
    public void iDownloadTheCreatedSlide()  {
gDocsPage.getFileMenu().click();
        gDocsPage.getDownloadSubMenu().click();
    }
}
