package lv.bootcamp.inheritance.task1;

/**
 * Class SpaceObject for creating space objects
 */
public class SpaceObject {
    private String name;
    private String type;
    private int width;
    private int height;
    private String color;
    private double coordinateX;
    private double coordinateY;

    /**
     * The toString method for class Object returns a string consisting of the name of the class of which the object is
     * an instance.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }

    public SpaceObject() {
    }



    /**
     * Argument constructor
     *
     * @param coordinateX
     * @param coordinateY
     */
    public SpaceObject(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    /**
     * Argument constructor
     *
     * @param name
     * @param type
     * @param width
     * @param height
     * @param color
     * @param coordinateX
     * @param coordinateY
     */
    public SpaceObject(String name, String type, int width, int height, String color, double coordinateX, double coordinateY) {
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
