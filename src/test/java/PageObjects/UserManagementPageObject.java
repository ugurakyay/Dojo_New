package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPageObject extends PageObject { //Create Add Target State Story

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

    public void ManagementButtonClick() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/nav/div/a[6]")).click();
    }

    public void AddUser () throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div/div[1]/div/div/div[2]")).click();
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/input")).sendKeys("Test_Auto");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/input")).sendKeys("Test");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/input")).sendKeys("Dojo_Auto");
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div[1]/div/div[2]/div[3]/input")).sendKeys("dojo@test.com");
        browser.findElement(By.xpath("//select/option[text()='operator']\n")).click();
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[2]/div[2]/div[1]/div/div[3]/div/button")).click();


    }
}