import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n,r;

    System.out.println("Enter any value for n: ");
    n = scan.nextInt();
    System.out.println("Enter any value for r: ");
    r = scan.nextInt();

    int sumN = 1;
    int sumR = 1;
    int odd = 1;

    if(n>r && n>1 && r>=1){
        for (int i = 1; i<=n ; i++){
            sumN = sumN * i;
        }
        for (int j = 1; j <= r; j++){
            sumR = sumR * j;
        }
        for (int k=1 ; k<=(n-r) ; k++){
            odd = odd * k;
        }
    }else {
        System.out.println("Not allowed! Check your values.");
    }

    int c = sumN / (sumR * odd);
    System.out.println(c);


    }
}
