public class CountSetOfBIt {
    public static void count(int num){
        int count=0;
        while(num > 0){
            if((num & 1) == 1){ //check last bit or LSB
                count++;
            }
            num=num >> 1; //IT REMOVE LSB BIT
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int num=7;
        count(num);
    }
}
