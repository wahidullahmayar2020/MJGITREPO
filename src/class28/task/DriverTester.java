package class28.task;

public class DriverTester {
    public static void main(String[] args) {
       WebDriver webDriver= new FireFox();
       webDriver.openBrowser();
       webDriver.maximizeWindow();
       webDriver.findElement();
       webDriver.closeBrowser();
    }
}
