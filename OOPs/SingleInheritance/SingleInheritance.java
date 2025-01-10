
public class SingleInheritance{
    public static void main(String []args)
    {
        // Creating an object of the class
        System.out.println("main".length());
        hr  hr=new hr();
        hr.salary();
        hr.bonus();

    }
}

class employee{
    int salary=12000;
    public void salary()
    {
        System.out.println("Salary is: "+salary);
    }
}


class hr extends employee{
    int bonus=2000;
    public void bonus(){
        System.out.println("Bonus is : "+bonus);
    }
}