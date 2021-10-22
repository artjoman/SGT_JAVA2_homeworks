package lv.bootcamp.inheritance.task1;

public class SpaceObject {

    private String name;
    private String type;
    private int width;
    private int height;
    private String colour;
    private static double coordinateX;
    private static double coordinateY;

    public SpaceObject() {
    }

    public SpaceObject(String name, String type, int width, int height, String colour, double coordinateX, double coordinateY) {
        this.name = name;
        this.type = type;
        this.width = width;
        this.height = height;
        this.colour = colour;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public static double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", colour='" + colour + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
