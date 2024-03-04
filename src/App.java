import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a == 1){
            System.out.println("Top 1");
        }else if(a >= 2 && a <=3){
            System.out.println("Top 3");
        }else if(a > 3 && a <= 5){
            System.out.println("Top 5");
        }else if(a > 5 && a <= 10){
            System.out.println("Top 10");
        }else if(a > 10 && a <=25){
            System.out.println("Top 25");
        }else if(a > 25 && a <=50){
            System.out.println("Top 50");
        }else{
            System.out.println("Top 100");
        }

        sc.close();
    }
}
