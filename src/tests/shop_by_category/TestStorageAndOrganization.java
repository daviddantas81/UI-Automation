package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.storageAndOrganizationPage;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 */
public class TestStorageAndOrganization {
    protected WebDriver driver;
    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();
        driver = cm.getDriver ();
    }

    @Test
    public void verifyHeader() throws Exception {
        final  String pageHeader = "Storage & Organization";

        storageAndOrganizationPage storageAndOrganization = new storageAndOrganizationPage (driver);

        Assert.assertEquals ( pageHeader, storageAndOrganization.getPageHeader ().getText () );

    }


    @After
    public void tearDown() throws Exception {
    driver.quit ();
    }


}