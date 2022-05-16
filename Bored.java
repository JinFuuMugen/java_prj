public class Bored {
    public static void main(String[] args) {
        int i=(int)(50*Math.random());
        int j=i;
        while (j>0){
            System.out.println("Мне скучно "+j+" раз.");
            j--;
        }
        if(i>10)
            System.out.println("Слишком много)))");
        else if(i==10)
            System.out.println("РОВНО POG");
        else 
            System.out.println("Не так уж");
    }
}
