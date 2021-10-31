package lv.bootcamp.inheritance.task1;

public class SpaceObject {

    private String name;
    private String type;
    private double width;
    private double height;
    private String color;
    private double coordinateX;
    private double coordinateY;


    public SpaceObject() {
    }


    public SpaceObject(String name, String type, double width, double height, String color, double coordinateX, double coordinateY) {
        this.name = name;
        this.type = type;
        this.width = width;
        this.height = height;
        this.color = color;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
}
