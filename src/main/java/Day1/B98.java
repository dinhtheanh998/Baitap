package Day1;

import java.util.Scanner;

public class B98 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        float a, b, c,d, e, f;
        float Dx, Dy, D;
        System.out.println("Nhap cac he so a b c d e f");
        a =  sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d= sc.nextFloat();
        e = sc.nextFloat();
        f= sc.nextFloat();
        D = a*e - d * b;
        Dx = c*e - f*b;
        Dy = a*f - d*c;

        if(D == 0 && Dx ==0 && Dy == 0) {
            System.out.println("Vo so nghiem");
        }else if(D != 0){
            System.out.printf("Nghiem %.2f, %.2f " ,Dx/D,Dy/D);
        }else {
            System.out.println("vo nghiem");
        }
    }
}
