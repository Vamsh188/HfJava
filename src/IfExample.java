import java.util.Scanner;

public class IfExample {
    public void method() {

        int pass = 35;
        int first = 60;
        int dis = 80;

        Scanner scanner = new Scanner(System.in);

        int student;
        do {
            System.out.println ("please enter student marks");
            student = scanner.nextInt();

        if (student >= pass && 100 >= student) {
            if (dis <= student) {
                System.out.println("dis");
            } else if (first <= student) {
                System.out.println("first");
            } else {
                System.out.println("pass");
            }

        } else if (student > 100) {
            System.out.println("invailed marks");
        } else {
            System.out.println("failed");
        }
    }
        while (student != 10000);

}

    public static void main(String[] args) {

       IfExample iftty = new IfExample();
       iftty.method();
    }
}
