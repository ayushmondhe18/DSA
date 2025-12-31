import java.util.*;
public class ShortestPath {
    public static void ShortestPath(String path){
        int x=0, y=0;
        for(int i=0 ; i <path.length(); i++){
            char dir=path.charAt(i);

            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        float x2=x*x;
        float y2=y*y;
        float ShortCut=(float)Math.sqrt(x2+y2);
        System.out.println(ShortCut);
    }
    public static void main(String[] args) {
        String path="NNNNS";
        ShortestPath(path);
    }
}
