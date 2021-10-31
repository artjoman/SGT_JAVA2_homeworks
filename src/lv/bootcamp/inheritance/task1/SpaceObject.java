package lv.bootcamp.inheritance.task1;

/** class SpaceObject;
 * contains following attributes:
 * name,type, width,height,color,coordinateX,coordinateY
 */

public class SpaceObject {
    private String name;
    private  String type;
    private int width;
    private int height;
    private String color;
    private double coordinateX;
    private  double coordinateY;

    public SpaceObject() {
    }

    /**
     * Argument constructor SpaceObject, creates Space object with following attributes:
     * @param name- String
     * @param type- String
     * @param width -int
     * @param height -int
     * @param color -String
     * @param coordinateX -double
     * @param coordinateY - double
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
