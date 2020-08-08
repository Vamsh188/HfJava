import java.util.Scanner;

public class ScExample {
    int k,v,a,b;
    Scanner sc = new Scanner(System.in);

    public void method1(){
        System.out.println("enter the value");
         k = sc.nextInt();
System.out.println("k value " + k);

    }

    public static void main(String[] args) {
        ScExample scExample = new ScExample();
        scExample.method1();
    }

}
