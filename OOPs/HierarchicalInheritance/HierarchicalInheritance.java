package HierarchicalInheritance;
public class HierarchicalInheritance {
    public static void main(String[] args) {
        try {
            B b = new B();
            C c = new C();
            b.showA();
            b.showB();
            c.showA();
            c.showC();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class A {
    void showA() {
        System.out.println("A");
    }
}

class B extends A {
    void showB() {
        System.out.println("B");
    }
}

class C extends A {
    void showC() {
        System.out.println("C");
    }
}