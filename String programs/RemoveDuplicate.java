// remove duplicate characters from a give string
public class RemoveDuplicate {
    public static String dup(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!result.contains(ch+"")){
                result+=ch;
             }
        }
        return result;
    }
    public static void main(String[] args) {
        String str="abbac";
        System.out.println(str);
        System.out.println(dup(str));

    }

   
        
}
