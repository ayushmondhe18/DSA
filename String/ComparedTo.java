public class ComparedTo {
     // IT COMPARE BASE ON LEXICAN ORDER 
     // IN THIS OPERATOR a AND A ARE TREAT SAME
    public static void Compare(String str[]){
        String largest=str[0];
        for(int i=1 ; i<str.length; i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String str[]={"apple","mango" , "banana",};
        Compare(str);

    }
}
