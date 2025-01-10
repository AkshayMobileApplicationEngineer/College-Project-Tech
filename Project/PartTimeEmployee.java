class PartTimeEmployee extends Employee {
      private int hoursWorked;
      private int ratePerHour;
      private int daysWorked;
  
      public PartTimeEmployee(String name, int hoursWorked, int daysWorked, int ratePerHour) {
          super(name);
          this.hoursWorked = hoursWorked;
          this.ratePerHour = ratePerHour;
          this.daysWorked = daysWorked;
      }
  
      @Override
      public double calculateSalary() {
          return hoursWorked * ratePerHour * daysWorked;
      }
  
      @Override
      public void displayDetails() {
          System.out.println("Part-Time Employee: " + name);
          System.out.println("Hours Worked: " + hoursWorked);
          System.out.println("Days Worked: " + daysWorked);
          System.out.println("Rate Per Hour: " + ratePerHour);
      }
  }
  