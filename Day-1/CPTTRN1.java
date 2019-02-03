import java.util.Scanner;

class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            int b = sc.nextInt();
            for(int k=0;k<l;k++){
                for(int j=0;j<b;j++){
                    if(j%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}