public class ClassD extends ClassB {

    public void metho3(){
        System.out.println("hello this Class D");
    }
    public void method4(){
        System.out.println("hello this Clss d ");
    }

    public static void main(String[] args) {

        ClassD d = new ClassD();
        d.metho3();
        d.method4();
        d.method1();
        d.method2();
        System.out.println(d.name);
    }

}
