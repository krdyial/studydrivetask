package com.studydrivetask.stepdefinitions;

import com.studydrivetask.pages.StudyDrivePages;
import com.studydrivetask.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.nio.file.Files;
import java.nio.file.Paths;

public class MyDocumentsDefinitions {
    StudyDrivePages sdp = new StudyDrivePages();

    @When("user clicks user icon")
    public void user_clicks_user_icon() {
        sdp.profileButton.click();
    }

    @When("user clicks My documents menu")
    public void user_clicks_My_documents_menu() {
        sdp.myDocuments.click();
    }

    @When("user clicks  name of VeryImportantDocument.doc document")
    public void user_clicks_name_of_VeryImportantDocument_doc_document() {
        sdp.documentName.click();
    }

    @When("user clicks download document")
    public void user_clicks_download_document() {
        sdp.downloadButton.click();

    }

    @Then("user verifies the file downloaded into {string}")
    public void user_verifies_the_file_downloaded_into(String path) {
        boolean isDownloaded= Files.exists(Paths.get(path));
        Assert.assertTrue(isDownloaded);
    }

}
