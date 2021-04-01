package class24.demo5;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new GoogleChrome();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadAFileFromWebsite();
        webDriver.closeWebsite();
    }
}
