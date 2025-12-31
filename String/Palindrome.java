public class Palindrome {
    public static boolean Palindrome(String str){
        for(int i=0 ; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("String is not palindrome");
                return false;
            }
        }
        System.out.println("string is palindrome");
        return true;
}    public static void main(String[] args) {
        String str="naman";
        Palindrome(str);
    }
}

