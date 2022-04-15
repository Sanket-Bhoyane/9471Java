
public class Rectangle extends Shape {
    private double length;
    private  double width;
public Rectangle(double length,double width){
    this.length=length;
    this.width=width;
}
    @Override
    public void findArea() {
setArea(length*width);
    }

    @Override
    public void findCircumference() {
setCircumference(2*length*width);
    }
}
