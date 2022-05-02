public class Solution{
  
    public static boolean validParentheses(String parens)
    {
      
      int trigger=0;
      
      
      while (trigger>=0){
      for (int i=0; i<parens.length(); i++){
  
        if (parens.charAt(i)==')')
            trigger--;
        
        else if (parens.charAt(i)=='(')
          trigger++;
      }
    }                                                   
      
    if(trigger!=0)
        return false;
    else 
        return true;
      
  // else    if (parens.indexOf(")")<parens.indexOf("("))
  //        return false;
      
      
  //    else if ((parens.indexOf(")")==-1)&&(parens.indexOf("(")==-1))
  //      return true;
  //    else {
  //      int l=0;
  //      int r=0;
  //      for (int i=0; i<parens.length(); i++){
  //       if (parens.charAt(i)==')')
  //         r++;
  //       else if (parens.charAt(i)=='(')
  //         l++;
  //      }
  //      if (r!=l)
  //        return false;
  //      else
  //       return true;
  //      }
    }
    public static void main(String[] args) {
        boolean dfdfds;
        System.out.println("fsdfdsfsdfdsfdsfd");
        dfdfds=validParentheses("()");
        System.out.println("Answer:"+dfdfds);
        dfdfds=validParentheses("()))");
        System.out.println(dfdfds);
        dfdfds=validParentheses("())");
        System.out.println(dfdfds);
        dfdfds=validParentheses("(()");
        System.out.println(dfdfds);
        dfdfds=validParentheses("(()())");
        System.out.println(dfdfds);
    }
  }