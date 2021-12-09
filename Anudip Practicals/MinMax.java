public class MinMax{
static void max(int[] a){
int max=a[0];
for(int i=0;i<a.length;i++){
if(max<a[i]){
max=a[i];
}}
System.out.println("Maximum value of given array is:"+max);
}
public static void main(String []args){
int[] a={30,60,12,14};
max(a);
}}