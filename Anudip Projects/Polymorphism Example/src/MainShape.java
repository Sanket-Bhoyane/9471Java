public class MainShape {
    public static void main(String [] args){
        Shape s=null;
        s=new Circle(1);

        s.findArea();
        s.findCircumference();
        System.out.println("The Area Of Circle:"+s.getArea());
        System.out.println("The Circumference Of Circle:"+s.getCircumference());
        System.out.println();
        s=new Rectangle(20,5);
        s.findArea();
        s.findCircumference();
        System.out.println("The Area Of Rectangle:"+s.getArea());
        System.out.println("The Circumference Of Rectangle:"+s.getCircumference());}
}
