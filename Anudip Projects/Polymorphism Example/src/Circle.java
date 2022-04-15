public class Circle extends Shape {
  private double radius;
  public Circle(double radius){
      this.radius=radius;
  }

    @Override
    public void findArea() {
setArea(Math.PI*radius*radius);
    }

    @Override
    public void findCircumference() {
setCircumference(2*Math.PI*radius);
    }
}
