package Methodridding;

public class Main {
      public static void main(String[] args) {
            SBI sbi=new SBI();
            ICICI icici=new ICICI();
            AXIS axis=new AXIS();
            sbi.getRateOfInterest();
            icici.getRateOfInterest();
            axis.getRateOfInterest();
      }
}
class Bank{
      public void getRateOfInterest(){
            System.out.println("Rate of Interest is 5 %");
      }
}
class SBI extends Bank{
      public void getRateOfInterest(){
            System.out.println("Rate of Interest is 8%");
      }
      
}
class ICICI extends Bank{
      public void getRateOfInterest(){
            System.out.println("Rate of Interest is 7%");
      }
}
class AXIS extends Bank{
      public void getRateOfInterest(){
            System.out.println("Rate of Interest is 9%");
      }
}
