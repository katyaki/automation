package DropDown;

public class SwitchToFrames {



    /* Swtiching to iframes and to default html


    driver.switchTo().defaultContent(); // you are now outside both frames
driver.switchTo().frame("cq-cf-frame");
// now continue step 6
driver.findElement(By.xpath("//button[text()='OK']")).click();


     */

    /*
      driver.findElement(By.xpath("//button[text() = \"Edit\"]")).click();//causes page to alert() something

wait.until(ExpectedConditions.alertIsPresent());
// Before you try to switch to the so given alert, he needs to be present.

Alert alert = driver.switchTo().alert();
alertText = alert.getText();
alert.accept();


alert.dismiss();


return alertText;

https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select

      */





}
