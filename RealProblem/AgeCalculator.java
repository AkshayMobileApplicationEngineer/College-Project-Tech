import java.util.Scanner;

public class AgeCalculator {

    public static int birthdate;
    public static int birthmonth;
    public static int birthyear;

    public static int currentdate;
    public static int currentmonth;
    public static int currentyear;

    public static String BOD[];
    public static String TODAY[];
    public static Scanner sc = new Scanner(System.in);


    public static int yourDay;
    public static int yourMonth;
    public static int yourYear;
        public static void main(String[] args) {
    
            System.out.println("Enter your birth date in DD-MM-YYYY format(12-12-1999):");
            BOD = sc.nextLine().split("-");
        System.out.println("Enter your current date in DD-MM-YYYY format(12-12-1999):");
        TODAY = sc.nextLine().split("-");
        
        birthdate = Integer.parseInt(BOD[0]);
        birthmonth = Integer.parseInt(BOD[1]);
        birthyear = Integer.parseInt(BOD[2]);
        
        currentdate = Integer.parseInt(TODAY[0]);
        currentmonth = Integer.parseInt(TODAY[1]);
        currentyear = Integer.parseInt(TODAY[2]);
         

       findtheage(birthdate,birthmonth,birthyear,currentdate,currentmonth,currentyear);
                      
               sc.close();
               }
               private static void findtheage(int birthdate, int birthmonth, int birthyear, int currentdate,
                       int currentmonth, int currentyear) {
           


                        if(currentmonth > birthmonth) {
                            yourDay= currentdate - birthdate;
                        }
                        else if(currentmonth < birthmonth) {
                            yourDay = currentdate + (30 - birthdate);
                        }



                        if(currentmonth > birthmonth) {
                            yourMonth = currentmonth - birthmonth;
                        }
                        else if(currentmonth < birthmonth) {
                            yourMonth = 12 - (birthmonth - currentmonth);
                        }


                        if(currentyear > birthyear) {
                            yourYear = currentyear - birthyear;
                        }
                        else if(currentyear < birthyear) {
                            yourYear = 0 - (birthyear - currentyear - 1);
                        }
                        System.out.println("You are " + yourYear + " years, " + yourMonth + " months, " + yourDay + " days old.");
               }

       
                
}