import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int one= 0;
        int two = 0;
        int three = 0;

        String strNumB = Integer.toString(B);
        int[] arr = new int[strNumB.length()];
        
        for(int i = 0; i < strNumB.length(); i++){
            arr[i] = strNumB.charAt(i) -'0';
        }
        one = arr[2]*A;
        two = arr[1]*A;
        three = arr[0]*A;
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(one+(two*10)+(three*100));
    }
}