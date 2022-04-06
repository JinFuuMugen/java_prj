import java.util.Arrays;

public class darray {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,2,3,4,5,6,7,8,9};
        
        System.out.println(Arrays.toString(removeElement(arr,1)));
    }
    public static int[] removeElement (int[] arr, int value)
    {
        int offset=0;
        
        for (int i=0; i<arr.length; i++){
            if (arr[i]==value){
                offset++;

            }   else {
                    arr[i-offset]=arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length-offset);
        }
}
