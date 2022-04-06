//: initialization/SimpleConstructor.java
//Демонстрация простого конструктора

class Rock{
    Rock(){
        System.out.print("Rock ");
    }
}

class Rock2{
    Rock2(int i){
        System.out.print("Rock2 "+i+"; ");
    }
}

public class SimpleConstructor{
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
            new Rock();
        for (int i=0; i<10; i++)
            new Rock2(i);

    }
}
///:~