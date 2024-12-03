package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RolesManagementPageObject extends PageObject { //Create Add Target State Story

    @Override
    public void navigateTo() {
        String url = ConfigReader.getInstance().getHost();
        if (url != null && !url.isEmpty()) {
            browser.get(url);
        } else {
            throw new RuntimeException("Target URL is not provided or invalid.");
        }
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void RolesButtonClick() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[1]/ul/li[2]/div/div[2]/span")).click();

    }

    public void AddRoles() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div/div/div[1]/div/div/div[2]/span")).click();
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/input")).sendKeys("auto_role");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div/div[1]/div/div/div[3]/div/button")).click();

    }

    public void EditExistingRoles() throws InterruptedException {
        Thread.sleep(3000);
        WebElement collectionCheckbox = browser.findElement(By.xpath("//input[@type='checkbox' and @class='group-permission-checkbox' and @name='collection']"));
        if (!collectionCheckbox.isSelected()) {
            collectionCheckbox.click();
        }

        // 'collection_read' checkbox'ını bul ve aktif yap
        WebElement collectionReadCheckbox = browser.findElement(By.xpath("//input[@type='checkbox' and @class='group-permission-checkbox' and @name='collection_read']"));
        if (!collectionReadCheckbox.isSelected()) {
            collectionReadCheckbox.click();

            // "story" checkbox'ını aktif et
            WebElement storyCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='story']"));
            if (!storyCheckbox.isSelected()) {
                storyCheckbox.click();
            }

// "story_read" checkbox'ını aktif et
            WebElement storyReadCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='story_read']"));
            if (!storyReadCheckbox.isSelected()) {
                storyReadCheckbox.click();
            }

// "story_create" checkbox'ını aktif et
            WebElement storyCreateCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='story_create']"));
            if (!storyCreateCheckbox.isSelected()) {
                storyCreateCheckbox.click();
            }

// "story_update" checkbox'ını aktif et
            WebElement storyUpdateCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='story_update']"));
            if (!storyUpdateCheckbox.isSelected()) {
                storyUpdateCheckbox.click();
            }

// "story_delete" checkbox'ını aktif et
            WebElement storyDeleteCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='story_delete']"));
            if (!storyDeleteCheckbox.isSelected()) {
                storyDeleteCheckbox.click();


                // "library" checkbox'ını aktif et
                WebElement libraryCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='library']"));
                if (!libraryCheckbox.isSelected()) {
                    libraryCheckbox.click();
                }

// "library_read" checkbox'ını aktif et
                WebElement libraryReadCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='library_read']"));
                if (!libraryReadCheckbox.isSelected()) {
                    libraryReadCheckbox.click();
                }

// "library_delete" checkbox'ını aktif et
                WebElement libraryDeleteCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='library_delete']"));
                if (!libraryDeleteCheckbox.isSelected()) {
                    libraryDeleteCheckbox.click();
                }
// "listener" checkbox'ını aktif et
                WebElement listenerCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='listener']"));
                if (!listenerCheckbox.isSelected()) {
                    listenerCheckbox.click();
                }

// "listener_read" checkbox'ını aktif et
                WebElement listenerReadCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='listener_read']"));
                if (!listenerReadCheckbox.isSelected()) {
                    listenerReadCheckbox.click();
                }

// "listener_create" checkbox'ını aktif et
                WebElement listenerCreateCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='listener_create']"));
                if (!listenerCreateCheckbox.isSelected()) {
                    listenerCreateCheckbox.click();
                }

// "listener_update" checkbox'ını aktif et
                WebElement listenerUpdateCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='listener_update']"));
                if (!listenerUpdateCheckbox.isSelected()) {
                    listenerUpdateCheckbox.click();
                }
// "dashboard" checkbox'ını aktif et
                WebElement dashboardCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='dashboard']"));
                if (!dashboardCheckbox.isSelected()) {
                    dashboardCheckbox.click();
                }

// "dashboard_read" checkbox'ını aktif et
                WebElement dashboardReadCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='dashboard_read']"));
                if (!dashboardReadCheckbox.isSelected()) {
                    dashboardReadCheckbox.click();
                }
// "insights" checkbox'ını aktif et
                WebElement insightsCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='insights']"));
                if (!insightsCheckbox.isSelected()) {
                    insightsCheckbox.click();
                }

// "insights_read" checkbox'ını aktif et
                WebElement insightsReadCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='insights_read']"));
                if (!insightsReadCheckbox.isSelected()) {
                    insightsReadCheckbox.click();
                }

// "insights_delete" checkbox'ını aktif et
                WebElement insightsDeleteCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='insights_delete']"));
                if (!insightsDeleteCheckbox.isSelected()) {
                    insightsDeleteCheckbox.click();
                }
// "management" checkbox'ını aktif et
                WebElement managementCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='management']"));
                if (!managementCheckbox.isSelected()) {
                    managementCheckbox.click();
                }

// "management_read" checkbox'ını aktif et
                WebElement managementReadCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='management_read']"));
                if (!managementReadCheckbox.isSelected()) {
                    managementReadCheckbox.click();
                }

// "management_update" checkbox'ını aktif et
                WebElement managementUpdateCheckbox = browser.findElement(By.xpath("//input[@class='group-permission-checkbox' and @name='management_update']"));
                if (!managementUpdateCheckbox.isSelected()) {
                    managementUpdateCheckbox.click();


                    // click Save changes button
                    browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div/div[1]/div/div/div[3]/div/button")).click();

                    // click X and close pop-up
                    browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div/div[1]/div/div/div[1]/button")).click();
                }
            }
        }
    }
}

