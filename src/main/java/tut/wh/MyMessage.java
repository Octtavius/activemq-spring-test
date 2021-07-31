package tut.wh;

import java.io.Serializable;

public class MyMessage implements Serializable {
    private String text;
    private String description;

    public MyMessage(String text, String description) {
        this.text = text;
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "text='" + text + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
