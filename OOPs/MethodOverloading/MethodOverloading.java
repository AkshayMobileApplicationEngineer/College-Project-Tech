package MethodOverloading;

public class MethodOverloading {
      public int add(int a,int b){
            return a+b;
      }
      public int add(int a,int b,int c){
            return a+b+c;
      }
      public String add(String a,String b){
            return a+b;
      }
      public static void main(String[] args) {
            MethodOverloading obj=new MethodOverloading();
            System.out.println(obj.add(1, 2));
            System.out.println(obj.add(1, 2, 3));
            System.out.println(obj.add("Hello", "World"));
      }
}
