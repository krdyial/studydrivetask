package com.studydrivetask.testng;

import com.studydrivetask.pages.StudyDrivePages;
import com.studydrivetask.utilities.ConfigReader;
import com.studydrivetask.utilities.Driver;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class StudyDriveTestNG {

StudyDrivePages sdp= new StudyDrivePages();
    @Test
    public void uploadDocument() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(5000);
        sdp.loginFirst.click();
        sdp.emailBox.sendKeys(ConfigReader.getProperty("email"));
        sdp.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        sdp.loginButton2.click();
        sdp.addButton.click();
        sdp.createDocument.click();
        sdp.courseSearchBox.click();
        sdp.selectCourse.click();
        sdp.dragAndDrop.sendKeys(ConfigReader.getProperty("path2"));
        sdp.descriptionPart.sendKeys(ConfigReader.getProperty("description2"));
        sdp.semesterBox.click();
        sdp.semesterSelect.click();
        sdp.docTypeBox.click();
        sdp.docTypeSelect.click();
        sdp.finishUploadButton.click();
        Thread.sleep(10000); //Upload takes some time so I need to put some wait

        // In cucumber I used hard assertion. In TestNG I will use Soft Assertion

        SoftAssert softAssert= new SoftAssert();
        String actualMessage= sdp.successMessage.getText();
        System.out.println("Actual Message= "+actualMessage);
        Assert.assertEquals(ConfigReader.getProperty("expectedMessage"),actualMessage);
        softAssert.assertAll();


        Driver.getDriver().quit();


    }






}

