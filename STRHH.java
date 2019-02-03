import java.util.Scanner;

class HalfOfHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            int m = s.length();
            char arr[] = s.toCharArray();
            for(int j=0;j<m/2;j+=2){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}