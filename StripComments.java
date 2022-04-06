public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
		String[] txt_buff=text.split("\n");
    String[] str_buff=new String[]{"s", "t"};
    String ans=new String();
    for(String s:txt_buff){
        str_buff[0]=s;
        for(int i=0; i<commentSymbols.length; i++){
          str_buff=str_buff[0].split(commentSymbols[i]);
        }      
      
        if(str_buff[0].charAt(str_buff[0].length()-1)==' ')
          str_buff[0]=str_buff[0].substring(0, str_buff[0].length()-1);
      
        if(ans.isEmpty())
          ans=ans+str_buff[0];
        else 
          ans=ans+'\n'+str_buff[0];
      }
    return ans;
    } 
    public static void main(String[] args) {
        StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } );
    }   
	}