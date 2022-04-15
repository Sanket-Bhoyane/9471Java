
public abstract class Shape {
    private double area;
    private double circumference;


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
    public abstract void findArea();
    public abstract void findCircumference();
}

