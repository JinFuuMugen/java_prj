public class MaxMinAvg {
    public static void main(String[] args) {
        int n=100;
        double[]a=new double[n];
        double min=1;
        double max=0;
        double avg=0;
        for(int i=0; i<n;i++)
        {
            a[i]=Math.random();
            avg+=a[i];
            if(a[i]<min)
            min=a[i];
            if(a[i]>max)
            max=a[i];
        }
        avg=avg/100;
        System.out.println("Минимальное: "+min+"\nМаксимальное: "+max+"\nСреднее: "+avg);
    }
}
