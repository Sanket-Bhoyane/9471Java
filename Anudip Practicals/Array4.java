public class Array4 {
  
public static boolean contains(int[] arr,int character){
for(int n:arr){
    if(character==n){
      return true;
    }}
    return false;
    }
    public static void main(String[] args) {
 int[] my_array={1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
            System.out.println(contains(my_array,2013));
  System.out.println(contains(my_array,2015));
}
}
