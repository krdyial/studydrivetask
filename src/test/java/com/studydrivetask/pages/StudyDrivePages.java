package com.studydrivetask.pages;

import com.studydrivetask.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyDrivePages {


    public StudyDrivePages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
        @FindBy(xpath = "/html/body/div[2]//div/div[2]/footer/div/div[1]/div/button[2]")
        public WebElement acceptAll;

        @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div/div/nav/div/button[1]")
        public WebElement loginFirst;


        @FindBy(xpath = "//input[@type='email']")
        public WebElement emailBox;

        @FindBy(xpath = "//input[@type='password']")
        public WebElement passwordBox;

        @FindBy(xpath = "//button[@class='w-full btn btn-cta-surfaced btn-md']")
        public WebElement loginButton2;

        @FindBy(id = "add-button")
        public WebElement addButton;

        @FindBy(partialLinkText = "Create document")
        public  WebElement createDocument;

        @FindBy(xpath = "(//div[@class='relative'])[4]")
        public WebElement courseSearchBox;

        @FindBy(xpath="/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div/div[1]/div[1]/div[1]/div/div/form/div/div/div/div/div/ul/li")
        public WebElement selectCourse;

        @FindBy(xpath="//div[@class='dz-message']//button")
        public WebElement browseFileButton;

        @FindBy(xpath="//input[@type='file']")
        public WebElement dragAndDrop;

        @FindBy(xpath = "//input[@placeholder='Add description']")
        public WebElement descriptionPart;

        @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div")
        public WebElement semesterBox;

        @FindBy(xpath="//div[contains(text(),'Summer 2021')]")
        public WebElement semesterSelect;

        @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div[1]/div/div[1]/div")
        public WebElement docTypeBox;

        @FindBy(xpath="//div[contains(text(),'Other')]")
        public WebElement docTypeSelect;

        @FindBy(xpath = "//button[@id='finish-upload']")
        public WebElement finishUploadButton;

        @FindBy(xpath = "//div[@class='ml-3']")
        public WebElement successMessage;

        @FindBy(xpath="//a[@title='Profile']")
        public WebElement profileButton;

        @FindBy(xpath = "(//a[@target='_SELF'])[2]")
        public WebElement myDocuments;

        @FindBy(partialLinkText = "VeryImportantDocument.doc")
        public WebElement documentName;

        @FindBy(xpath="//h1")
        public  WebElement documentsHead;

        @FindBy(xpath = "//div[@data-specific-auth-trigger='download']")
        public WebElement downloadButton;












}
