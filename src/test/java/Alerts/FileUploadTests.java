package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Federico\\Desktop\\FEDETOLO\\testing\\demoTAU\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getuploadedFiles(),"chromedriver.exe", "Uploaded files incorrect");
    }
}
