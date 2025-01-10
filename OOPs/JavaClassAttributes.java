package OOPs;

public class JavaClassAttributes {
   final String name = "Manu";
    int rollNo;
    String address;


    public static void main(String[] args) {
        JavaClassAttributes java=new JavaClassAttributes();
        
        java.rollNo = 12345;
        java.address = "123, ABC Street";
        System.out.println("Name: " + java.name);
        System.out.println("Roll No.: " + java.rollNo);
        System.out.println("Address: " + java.address);
        System.out.println("Attributes of java object:\n ");

        
        java.address="Delhi";
        java.rollNo = 67890;
        System.out.println("Name: " + java.name);
        System.out.println("Roll No.: " + java.rollNo);
        System.out.println("Address: " + java.address);
        System.out.println("Attributes of java object:\n ");

        JavaClassAttributes java2=new JavaClassAttributes();
        
        java2.address="Patna";
        java2.rollNo = 11111;
        System.out.println("Name: " + java.name);
        System.out.println("Roll No.: " + java.rollNo);
        System.out.println("Address: " + java.address);
        System.out.println("Attributes of java object:\n ");

    }
}
