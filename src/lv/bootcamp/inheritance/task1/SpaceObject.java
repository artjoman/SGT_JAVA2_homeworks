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

    /* bind keyboard arrow keys and space to the methods rotate and accelerate in following way
WHEN pressing left arrow or right arrow - call rotate method with -1 or +1 values
WHEN pressing down arrow or up arrow - call accelerate method with -1 or + 1 values
WHEN pressing SPACE - show Spaceship current coordinates

*/

    //public static double rotateDirection (double degrees){
        //return direction;
        //direction cannot be less than 0 and larger than 360
    //}

    //public static double accelerateMove (double acc){
        //return accelerate;
        //DeltaX = cos(α) * acc
        //DeltaY = sin(α) * acc
        //if initially coordinateX and coordinate Y is (0,0)
        //and acc=4 and direction(a)=30:
        //deltaX=4*cos(a)=4*cos(30)=4*0.86602540378=3.46410161514
        //deltaY=4*sin(a)=4sin(30)=4*0.5=2
        //then coordinate X is 3.46410161514 and coordinate Y is 2

    //}

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
