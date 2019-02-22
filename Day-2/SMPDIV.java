import java.util.Scanner;

class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int j=1;
            while(j<n){
                if(j%x==0 && j%y!=0){
                    System.out.print(j + " ");
                }
                j++;
            }
            System.out.println();
        }
        sc.close();
    }
}