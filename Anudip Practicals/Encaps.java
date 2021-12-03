class Encapsulation{
private int empAge;
private String empName;
public int getempAge(){
return empAge;
}
public String getempName(){
return empName;
}
public void setempAge(int newvalue){
empAge=newvalue;
}
public void setempName(String newvalue){
empName=newvalue;
}}
class Encaps{
public static void main(String[] args){
Encapsulation obj=new Encapsulation();
obj.setempAge(23);
obj.setempName("Maari");
System.out.println("empAge is "+ obj.getempAge());
System.out.println("empName is "+ obj.getempName());
}}