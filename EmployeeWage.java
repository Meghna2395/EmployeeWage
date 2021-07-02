public class EmployeeWage{

public static final int parttime=1;

public static final int fulltime=2;

public static final int emprateperhour=20;

public static final int noofworkingdays=2;

public static final int maxhrsinmonth=10;



public static void main(String[] args)
 


{



int emphrs=0;


int totalemphrs=0;


int totalworkingdays=0;


while (totalemphrs <= maxhrsinmonth && totalworkingdays < noofworkingdays)

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

System.out.println("Day#: " + totalworkingdays + "Emphr: " +emphrs);

}


int totalempwage = totalemphrs*emprateperhour;

System.out.println("Total Emp Wage: " +totalempwage);


}

}

