import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count=0;
        
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        int v = sc.nextInt();
        for(int i = 0; i < n;i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}