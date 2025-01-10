package OOPs;

public class Student {
        String name;
         int rollNo;

         public static void main(String[] args) {
        
            Student student=new Student();
            student.name="John";
            student.rollNo=16;
            student.printdata();

            Student student2=new Student();
            student2.name="Ram";
            student2.rollNo=120;
            student2.printdata();
        }
        public void printdata(){
            System.out.println("Student Name: " + name);
            System.out.println("Roll No: " + rollNo);

        }

}
