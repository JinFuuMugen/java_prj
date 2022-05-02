class Stack{
   private int stck[];
   private int tos;

    Stack(int size)
    {
        tos=-1;
        stck=new int[size];
    }
    void push(int item)
    {
        if(tos==stck.length-1)
        System.out.println("Стек заполнен.");
        else 
        stck[++tos]=item;
    }
    int pop()
    {
        if(tos<0)
        {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
        return stck[tos--];
    }
}