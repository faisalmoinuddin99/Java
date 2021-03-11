/*
Inheritance in Interface
 */

interface sampleInterface {
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface {
    @Override
    default void meth1() {
        System.out.println("method 1");
    }

    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface {

    @Override
    public void meth2() {
        System.out.println("Method 2");
    }

    @Override
    public void meth3() {
        System.out.println("Method 3");
    }

    @Override
    public void meth4() {

        System.out.println("Method 4");
    }
}

public class Main {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();

        msc.meth1(); // method 1
        msc.meth2(); // Method 2
        msc.meth3(); // Method 3
        msc.meth4(); // Method 4
    }
}