import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        
        if(one == two && two == three){
            System.out.println(10000+one*1000);
        }else if(one == two || one == three){
            System.out.println(1000+one*100);
        }else if(two == three){
            System.out.println(1000+two*100);
        }else{
            if(one >= two && one >= three){
                System.out.println(one*100);
            }else if(two >= one && two >= three){
                System.out.println(two*100);
            }else{
                System.out.println(three*100);
            }
        }
    }
}