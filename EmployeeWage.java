public class EmployeeWage{

public static final int parttime=1;

public static final int fulltime=2;


public static int computeEmpWage(String company, int emprateperhour, int numofworkingdays, int maxhoursperMonth)

 


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


int totalEmpWage = totalemphrs*emprateperhour;

System.out.println("Total Emp Wage for company: " +company+" is: "+totalEmpWage);

}
public static void main (String[] args){
computeEmpWage("Atos",20,5,10);
computeEmpWage("Wipro",10,8,30);
}

}

