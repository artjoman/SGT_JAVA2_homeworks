package lv.bootcamp.inheritance.task2;

public class Spaceship extends lv.bootcamp.inheritance.task1.SpaceObject {

    private int mass;
    private int velocityX;
    private int velocityY;
    private int direction;
    private int acceleration;
    private int fuel;
    private int fuelConsumption;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    /**
     * Updates object's direction when rotating.
     * @param degrees   degrees to turn
     */
    // Add degrees and calculate the modulus of 360° when turning
    public void rotate(int degrees) {
        this.setDirection((this.getDirection() + degrees) % 360);
    }

    /**
     * Updates object's coordinates when accelerating.
     * @param acc   units to move
     */
    // newCoordinateZ = oldCoordinateZ + DeltaZ
    // Multiply degrees by 0.01745 to convert to radians
    public void accelerate(int acc) {
                                                    // DeltaX = cos(α) * acc
        this.setCoordinateX(this.getCoordinateX() + Math.cos(this.getDirection() * 0.01745) * acc);
                                                    // DeltaY = sin(α) * acc
        this.setCoordinateY(this.getCoordinateY() + Math.sin(this.getDirection() * 0.01745) * acc);

    }

}
