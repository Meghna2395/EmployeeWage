public class EmployeeWage{

     public static void main (String args[]){
      int Full_Time = 1;
      int Part_Time = 2;
      int Rate_Per_Hour =20;
  
           int empHrs=0;
           int empWage =0;
            double empCheck = Math.floor(Math.random() * 10) %3;
         if (empCheck == Part_Time)
       empHrs = 4;
      else if (empCheck ==  Full_Time)
           empHrs = 8;
       else 
            empHrs = 0;
    empWage = empHrs * Rate_Per_Hour;
    System.out.println("Emp Wage:"+ empWage);


        }
} 
