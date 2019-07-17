package view.panels;

public class PrivateCarList {
    private String text;
    private int id;

    public PrivateCarList(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public String toString() {
        return text;
    }

    public int getId() {
        return id;
    }
}
