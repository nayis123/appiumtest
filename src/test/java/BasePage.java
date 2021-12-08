import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Random;

public class BasePage extends BaseTest {

    //--------------- Wait
    @Step("<wait> saniye bekle")
    public void waitForSecond(int wait) throws InterruptedException {
        Thread.sleep(1000 * wait);
        MyLogger.log.info(wait + " saniye beklendi");
    }

    //--------------- Click
    @Step("<selectorid> id'li elemente tıkla")
    public void clickByid(String selectorid) {
        appiumDriver.findElement(By.id(selectorid)).click();
        MyLogger.log.info(selectorid + " id'li elemente tiklandi");
    }

    @Step("<selectorxpath> xpath'li elemente tıkla")
    public void clickByXPath(String selectorxpath) {
        appiumDriver.findElement(By.xpath(selectorxpath)).click();
        MyLogger.log.info(selectorxpath + " xpath'li elemente tiklandi");
    }

    //--------------- Send Keys
    @Step("<id> id'sine <text> textini yaz")
    public void sendKeysById(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        MyLogger.log.info(text + " mesaji yazildi");
    }

    //--------------- Assertion
    @Step("check <idControl> id")
    public void controlFromId(String idControl) {
        Assert.assertTrue("", appiumDriver.findElement(By.id(idControl)).isDisplayed());
    }

    //--------------- Scroll
    @Step("Scroll Down")
    public void scrollDown() {
        int startx = 720, starty = 2450, endx = 720, endy = 360;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
        MyLogger.log.info("Sayfa asagi kaydirildi");
    }

    //--------------- Random
    @Step("random element ekle")
    public void selectRandomElement() {
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
        MyLogger.log.info("rastgele element eklendi");
    }

    @Step("random beden sec")
    public void selectRandomSize(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/tvInSizeItem']"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
        MyLogger.log.info("rastgele bir beden secildi");
    }
}

