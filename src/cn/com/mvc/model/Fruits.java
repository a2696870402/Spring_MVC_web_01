package cn.com.mvc.model;

public class Fruits {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;
    private double price;
    private String producing_area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducing_area() {
        return producing_area;
    }

    public void setProducing_area(String producing_area) {
        this.producing_area = producing_area;
    }
}
