package classwork.example06;

import java.util.Stack;

public class WebTabHistory {
    private Stack<String> history;
    private Stack<String> forwardHistory;

    public WebTabHistory(String homePage) {
        history = new Stack<>();
        forwardHistory = new Stack<>();
        history.push(homePage);
    }

    public void goToPage(String pageUrl) {
        forwardHistory.clear();
        history.push(pageUrl);
    }

    public String getCurrentPage() {
        return history.peek();
    }

    public String goForward() {
        if (forwardHistory.isEmpty()) {
            return null;
        }
        history.push(forwardHistory.peek());
        return forwardHistory.pop();
    }

    public String goBack() {
        if (history.size() == 1) {
            return history.peek();
        }
        forwardHistory.push(history.peek());
        return history.pop();
    }

}
