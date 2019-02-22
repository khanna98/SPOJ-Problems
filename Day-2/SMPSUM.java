import java.util.Scanner;

class IterativeSum{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i = a;
    int sum=0;
    while(i<=b){
        sum+=(i*i);
        i++;
    }
    System.out.println(sum);
    sc.close();
   }
}