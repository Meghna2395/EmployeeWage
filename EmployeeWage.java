public class EmployeeWage {
      
    public final String company;
    public final int empRatePerHour;
    public  final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){

     this.company = company;
     this.empRatePerHour = empRatePerHour;
     this.empRatePerHour = numOfWorkingDays;
     this.maxHoursPerMonth = maxHoursPerMonth;
}

public void setTotalEmpWage(int totalEmpWage){
   this.totalEmpWage = totalEmpWage;
}

public String toString(){
   return "Total Emp Wage for Company: " +company+" is: "+totalEmpWage;
  }
}



