public class Wall {

}
// Floor.java
public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {

        if (width < 0) {
            width = 0;
        }

        if (length < 0) {
            length = 0;
        }

        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
}

// Carpet.java
public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

