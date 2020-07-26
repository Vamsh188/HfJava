public class ArrayExample {

//index+length

    int sal[] = {25000, 58444, 36000, 26000, 78000, 40000, 20000};

    public void method() {
        for (int i = 0; i < sal.length; i++) {
            if (35000 < sal[i]) {
                System.out.println(sal[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayExample rry = new ArrayExample();
        rry.method();
        System.out.println(args[0]);
    }

}

