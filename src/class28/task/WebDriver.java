package class28.task;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the Google Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Google Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the Google Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the elements from the Google Chrome Browser");
    }
}

class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the FireFox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the FireFox Browser");
    }

    @Override
    public void findElement() {

        System.out.println("Finding the elements from the FireFox Browser");
    }
}