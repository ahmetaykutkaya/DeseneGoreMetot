import java.util.Scanner;
public class Main {
    static void f(int x) {

        if (x<-1) return ;
        else {
            System.out.print(x+" ");
            f(x-5);
            System.out.print(x+" ");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int n;
        System.out.println("N sayisini giriniz  :");
        n = data.nextInt();
        f(n);

    }
}