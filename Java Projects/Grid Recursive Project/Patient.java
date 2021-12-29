import java.util.Scanner;

public class Patient {
static String pName;
static int check_patient,inP_num_days_spent,inP_daily_rate,inP_services,inP_medication,outP_services,outP_medication,charge;
static Scanner sc;
  
public static void main(String args[]){
  
sc= new Scanner(System.in);
pName=sc.nextLine();
 
System.out.println("do you want to be admitted as an inpatient-1 or an outpatient-0");
check_patient=sc.nextInt();
 
if(check_patient==0){
inPatient();
charge=inPcalculation();
}
else if(check_patient==1){
outPatient();
charge=outPCalculation();
}
}
  
public static void inPatient(){
  
System.out.println("enter the number of days spent in the hosptal");
inP_num_days_spent=sc.nextInt();
if(checkValue(inP_num_days_spent)==1) {
System.out.println("enterd invalid one,pls enter again");
inP_num_days_spent=sc.nextInt();
}
  
System.out.println("enter the daily rate");
inP_daily_rate=sc.nextInt();
if(checkValue(inP_daily_rate)==1) {
System.out.println("enterd invalid one,pls enter again");
inP_daily_rate=sc.nextInt();
}
  
System.out.println("enter the Charges for hospital services (lab tests, etc.)");
inP_services=sc.nextInt();
if(checkValue(inP_services)==1) {
System.out.println("enterd invalid one,pls enter again");
inP_services=sc.nextInt();
}
  
System.out.println("enter the Hospital medication charges");
inP_medication=sc.nextInt();
if(checkValue(inP_medication)==1) {
System.out.println("enterd invalid one,pls enter again");
inP_medication=sc.nextInt();
}
}
  
public static void outPatient(){
  
System.out.println("enter the Charges for hospital services (lab tests, etc.)");
outP_services=sc.nextInt();
if(checkValue(outP_services)==1) {
System.out.println("enterd invalid one,pls enter again");
outP_services=sc.nextInt();
}
  
System.out.println("enter the Hospital medication charges");
outP_medication=sc.nextInt();
if(checkValue(outP_medication)==1) {
System.out.println("enterd invalid one,pls enter again");
outP_medication=sc.nextInt();
}
}
  
public static int checkValue(int p){
if(p<0) return 1;
else return 0;
}
  
public static int inPcalculation(){
  
return 1;
}
  
public static int outPCalculation(){
  
return 1;
}
}
