public class SpecificValue{
public static void main(String [] args){
int[] Input={2001,2005,2010,2012,1655,2020,2021};
int Sp=1655;
SpecificValue.getValue(Input,Sp);
}
public static void getValue(int[] Input,int Sp){
for(int i=0;i<Input.length;i++){
if(Input[i]==Sp){
System.out.println("Yes, its");
System.out.println(+Sp);}}}}