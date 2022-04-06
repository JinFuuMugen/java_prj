public class StripCommentsTst{
    public static void main(String[] args) {
        String str=" \nyou\n are\n glack\n ";
        String[] strbuff=str.split(" ");
        for (String s:strbuff){
           // if(s!="")
                System.out.println(s);
        }
    }
}