class Teacher{
String designation="Teacher";
String collegeName="MMCOE";
}
class BioTeacher extends Teacher{
String Subject="Bio";
public static void main(String args []){
BioTeacher obj=new BioTeacher();
System.out.println(obj.collegeName);
System.out.println(obj.designation);
System.out.println(obj.Subject);
}
}