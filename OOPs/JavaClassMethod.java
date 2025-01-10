package OOPs;

/**
 * JavaClassMethod
 */
public class JavaClassMethod {

    int LicenseID;
    String name;

    public void eat(){
        System.out.println(name+" is Eating...");
    }
    public static void main(String[] args) {
        JavaClassMethod dog1 = new JavaClassMethod();
        dog1.name="tomi";
        dog1.eat();
    }
}