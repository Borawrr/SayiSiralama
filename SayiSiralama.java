import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        
        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a Sayisini giriniz : ");
        a = scanner.nextInt();
        System.out.print("b Sayisini giriniz : ");
        b = scanner.nextInt();
        System.out.print("3. Sayisini giriniz : ");
        c = scanner.nextInt();

        if(a>b && a>b){
            if(b>c){
                System.out.println("c < b < a");
            }else{
                System.out.println("b < c < a");
            }
        
        }else if (b>a && b>c){
            if(a>c){
                System.out.println("c < a < b");
            }else{
                System.out.println("a < c < b");
            }
        }else if (c > a && c > b){
            if(b>a){
                System.out.println("a < b < c");
            }else{
                System.out.println("b < a < c");
            }
        }

        scanner.close();
    }
}
