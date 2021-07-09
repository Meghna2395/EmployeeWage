public class EmployeeWage {
    public static final int parttime= 1;
    public static final int fulltime=2;

    private final String company;
    private final int empRatePerHour;
    private  final int numOfWorkingDays;
    private int totalEmpWage;

public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){

     this.company = company;
     this.empRatePerHour = numOfWorkingDays;
     this.maxHoursPerMonth = maxHoursPerMonth;
}

public void computeEmpWage(){
  int empHrs = 0, totalEmpHrs = 0 , totalWorkingDays =0;
while(totalEmpHrs <= maxHoursPerMonth && 
                totalWorkingDays < numOfWorkingDays){
  totalWorkingDays++;
int  empCheck = (int) Math.floor(Math.random() * 10)% 3;
switch (empCheck){
case parttime:
 empHrs = 4;
break;
case fulltime:
 empHrs = 8;
default:
   empHrs = 0;
}

totalEmpHrs += empHrs;
System.out.println("Day#:" + totalWorkingDays + "Emp Hr: " + empHrs);
}
totalEmpWage = totalEmpHrs * empRatePerHour;
}

public String toString(){
   return "Total Emp Wage for Company: "+company+" is: "+ totalEmpWage;
}

public static void main (String[] args){
 EmployeeWage atos = new EmployeeWage("Atos",20,5,40);
 EmployeeWage wipro = new EmployeeWage("wipro",10,4,20);
System.out.println(atos);
wipro.computeEmpWage();
System.out.println("wipro");
  }
}


