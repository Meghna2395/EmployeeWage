public class EmployeeWageBuilder{
    public static final int  parttime = 1;
    public static final int  fulltime = 2;

private int numOfCompany = 0;
private CompanyEmpWage[] = companyEmpWageArray;


public EmpWageBuilderArray(){
    companyEmpWageArray = new CompanyEmpWage[5];
}

private void addCompanyWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
   companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
numOfCompany++;
}

private void computeEmpWage(){
 for (int i = 0; i< numOfCompany; i++){
   companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
   System.out.println(companyEmpWageArray[i]);
}
}

public int computeEmpWage(CompanyEmpWage companyEmpWage)

 


{



int emphrs=0;


int totalemphrs=0;


int totalworkingdays=0;


while (totalemphrs <= maxhourspermonth && totalworkingdays < noofworkingdays);

{

totalworkingdays++;


int empCheck=(int) Math.floor(Math.random()*10)%3;



switch(empCheck)

{

case parttime:

emphrs=4;

break;

case fulltime:

emphrs=8;

break;

default:

emphrs=0;

}

totalemphrs += emphrs;

System.out.println("Day#: " + totalworkingdays + "Emp hr: " +emphrs);

}
return totalEmpHrs * companyEmpWage.empRatePerHour;
}

  public static void main (String[] args){
    EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
    empWageBuilder.addCompanyEmpWage("Atos",20,10,5);
    empWageBuilder.addCompanyEmpWage("Wipro",10, 50, 30);
    empWageBuilder.computeWage();
}
