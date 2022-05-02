public class BubbleSort {
    public static void main(String[] args) {
        int n=12;
        double a[]=new double[n];
        for(int i=0; i<a.length; i++)
        {
            a[i]=Math.random();
            System.out.print (a[i]+" ");            
        }
        System.out.println("\n");
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a.length-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    double buff=a[j];
                    a[j]=a[j+1];
                    a[j+1]=buff;                    
                }
            }
        }

        for(int i=0; i<a.length; i++)
        System.out.print (a[i]+" ");
        System.out.println();
    }
}
