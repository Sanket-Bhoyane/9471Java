 class EncapDemo{
private int i;
public int geti(){
return i;
}
public void seti(int xyz){
i=xyz;
}}
 class Encapsulation5
{
 public static void main(String []args){
EncapDemo obj=new EncapDemo();
obj.seti(234);
System.out.println("i value" +obj.geti());
}
}