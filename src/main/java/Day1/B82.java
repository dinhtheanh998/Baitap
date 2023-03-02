package Day1;

import java.util.Scanner;

public class B82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float max;
        System.out.println(" nhap 3 so  a b c ");

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a - b > 0){
            max = a;
            if(a-c < 0) {
                max = c;
            }
        }else {
            max = b;
            if(b-c < 0){
                max = c;
            }
        }
        System.out.println(max);
    }
}
