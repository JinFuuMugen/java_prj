//: initialization/Flower.java

public class Flower{
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        System.out.println("Construct int, petalcount= "+petalCount);
    }
    Flower(String ss){
        System.out.println("Construct String, s= "+ss);
        s=ss;
    }
    Flower(String s, int petals){
        this(petals);
        this.s=s;
        System.out.println("String & Int");
    }
    Flower(){
        this("hi", 47);
        System.out.println("No args");
    }
    public static void main(String[] args) {
        Flower x=new Flower();
        Flower y=new Flower(5);
        Flower z=new Flower("qweqew");
        Flower k=new Flower("asdasd", 12);
    }
}