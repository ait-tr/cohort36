package classwork.example06;

public class Main {
    /*
    Разработать класс История посещений, которая будет хранить на какие веб-страницы вы переходили
     */

    public static void main(String[] args) {
        WebTabHistory tabHistory = new WebTabHistory("https://www.google.com");
        tabHistory.goToPage("https://www.google.com/search?q=java");
        tabHistory.goToPage("https://www.java.com/en/");
        tabHistory.goToPage("https://www.java.com/en/download/");

        System.out.println("Currently on page: " + tabHistory.getCurrentPage());
        System.out.println("Going back 2 times...");
        tabHistory.goBack();
        tabHistory.goBack();
        System.out.println("Currently on page: " + tabHistory.getCurrentPage());

        System.out.println("Going forward");
        tabHistory.goForward();
        System.out.println("Currently on page: " + tabHistory.getCurrentPage());
    }
}
