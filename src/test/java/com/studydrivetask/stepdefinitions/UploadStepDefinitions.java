package com.studydrivetask.stepdefinitions;

import com.studydrivetask.pages.StudyDrivePages;
import com.studydrivetask.utilities.ConfigReader;
import com.studydrivetask.utilities.Driver;
import io.cucumber.java.en.*;
import javafx.scene.effect.SepiaTone;
import org.junit.Assert;
import org.openqa.selenium.Cookie;


import java.util.Set;
import java.util.concurrent.TimeUnit;

public class UploadStepDefinitions {

    StudyDrivePages sdp = new StudyDrivePages();
    @Given("user goes to homepage")
    public void user_goes_to_homepage() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        You should careful here.Website has cookie alert.
        It should be handled by manual "accept all" selection. Because of
        that situation, I put that Thread.sleep wait to gain some time.
         */
        Thread.sleep(5000);

    }

    @When("user clicks login")
    public void user_clicks_login() {
        sdp.loginFirst.click();
    }

    @When("user enters email")
    public void user_enters_email() {
        sdp.emailBox.sendKeys(ConfigReader.getProperty("email"));
    }

    @When("user enters password")
    public void user_enters_password() {
        sdp.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("user clicks login submit button")
    public void user_clicks_login_submit_button() {
        sdp.loginButton2.click();
    }

    @When("user clicks add button")
    public void user_clicks_add_button() {
       sdp.addButton.click();
    }

    @When("user clicks click create document button")
    public void user_clicks_click_create_document_button() {
            sdp.createDocument.click();
    }
    @When("user selects course name")
    public void user_selects_course_name() {
        sdp.courseSearchBox.click();
        sdp.selectCourse.click();
    }

    @When("user uploads the file")
    public void user_uploads_the_file() {
        sdp.dragAndDrop.sendKeys(ConfigReader.getProperty("path"));
        //I sent the document from my local computer(disk).
        Driver.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @When("user adds description")
    public void user_adds_description() {
        sdp.descriptionPart.sendKeys(ConfigReader.getProperty("description"));
    }

    @When("user selects semester")
    public void user_selects_semester() {
        sdp.semesterBox.click();
        sdp.semesterSelect.click();

    }

    @When("user selects document type")
    public void user_selects_document_type() {
       sdp.docTypeBox.click();
       sdp.docTypeSelect.click();
    }

    @When("user clicks finish upload")
    public void user_clicks_finish_upload() throws InterruptedException {
        sdp.finishUploadButton.click();
        Thread.sleep(10000); // Upload takes some time so I need to put some wait

    }

    @Then("user verifies {string} text")
    public void user_verifies_text(String expectedMessage) {
        String actualMessage= sdp.successMessage.getText();
        System.out.println("Actual Message= "+actualMessage);
        System.out.println("Expected Message= "+expectedMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
        Driver.getDriver().close();
    }





}
