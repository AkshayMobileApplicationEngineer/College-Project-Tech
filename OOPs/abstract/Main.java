public class Main {
      public static void main(String[] args) {
          tata tata = new tata();
          tata.intprint();
          tata.fiul();
      }
  }
  
  abstract class car {
      public void intprint() {
          System.out.println("Color is black");
      }
  
      abstract public void fiul();
  }
  
  class tata extends car {
  
      @Override
      public void fiul() {
          System.out.println("Abstaction is calling now");
      }
  }
  