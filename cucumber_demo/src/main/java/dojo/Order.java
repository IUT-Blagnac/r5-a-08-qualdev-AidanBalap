package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderAuthor;
    private String orderTarget;
    private String message;
    private ArrayList<String> cocktailsOrdered = new ArrayList<String>();

    public void declareOwner(String orderAuthor) {
        this.orderAuthor = orderAuthor;
    }

    public void declareTarget(String target) {
        this.orderTarget = target;
    }

    public List<String> getCocktails() {
        return cocktailsOrdered;
    }

    public void addMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "From " + orderAuthor + " to " + orderTarget + ": " + message;
    }
}
