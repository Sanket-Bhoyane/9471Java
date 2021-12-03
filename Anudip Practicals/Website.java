class Website{
String webName;
int webAge;
Website(){
System.out.println();
}
Website(String name, int age)
{
this.webName=name;
this.webAge=age;
}
public void showData(){
System.out.println("WebName: "+ webName + " webAge is " + webAge);
}
public static void main(String args []){
Website wb = new Website();
Website wb1 = new Website("Google", 30);
wb.showData();
wb1.showData();
}
}