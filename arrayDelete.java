import java.util.Arrays;

public class arrayDelete {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,5,5,6,7};

        System.out.print(Arrays.toString(removeElement(a, 5))+" ");
        System.out.println();
    }

    public static int[] removeElement(int a[], int num)
    {
        int j=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]!=num)
            {
                j++;
            }
            
        }
        int b[]=new int[j];
        j=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]!=num)
            {   
                b[j]=a[i];
                j++;
            }
            
        }
        return b;
    }
}
