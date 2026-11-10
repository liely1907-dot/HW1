import java.util.*;
public class Assignment01Q02 {
    public static void main(String[] args){
        int in = Integer.parseInt(args[0]);
        int i = 1, max = in*2 -1;
        int count = 0;
        double res = 0;
        while (i <= max){
            if (count % 2 == 0){
                res += 1.0/i;
            }
            else{
                res -= 1.0/i;
            }
            i +=2;
            count++;
        }
        res = res * 4;
        System.out.println(res + " " + Math.PI);
    }
}
