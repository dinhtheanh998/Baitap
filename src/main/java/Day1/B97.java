package Day1;

import java.util.Scanner;

public class B97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b < c ){
            System.out.println("Nhập cái tam giác vào");
        }else {
            if(a == b && b ==c ) {
                System.out.println("Đều");
            }else if(a==b || b ==c || a==c) {
                if(a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b){
                    System.out.println("vuong can");
                }else {
                    System.out.println("Cân");
                }
            }else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b) {
                System.out.println("vuông");
            }
        }
    }
}
