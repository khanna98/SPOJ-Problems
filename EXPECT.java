import java.util.Scanner;

class Expect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a!=42){
                System.out.println(a);
            }
            else{
                System.out.println(a);
                break;  
            }
        }
    }
}