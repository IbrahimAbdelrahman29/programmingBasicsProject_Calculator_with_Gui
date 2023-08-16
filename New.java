package pkgnew;
import java.util.*;
import java.io.*;
        public class New {
static Scanner s=new Scanner(System.in);
   public static void main (String[]args) throws FileNotFoundException{
int option ;
double x ;
double y ;
    PrintStream p=new PrintStream (new File("out.txt")); 
       System.out.println("Choose");
       System.out.println("1-App");
       System.out.println("2-Code");
       int k=s.nextInt();
    if(k==1){ 
        new NewJFrame().setVisible(true);
    }
    else if (k==2){
do{
option=menu1 (); 
    switch (option){
        case 1:
            if(option==1) 
           Binary (p);
           break;
        case 2:
       if(option==2) 
           Unairy (p);
            break;
        case -1:
            System.out.println("Good Bye");
            break;
        default:
            System.out.println("invaild option");
            break;
        }
}
while(option!=-1);
}}

public static void Binary (PrintStream p)throws FileNotFoundException{
    int operation ;
    int option;
   operation= menu2();
           if (operation==1){
               option=menu4();
               if(option==1){
                   
               System.out.println("Please enter num1");
               double x=s.nextDouble();
                System.out.println("Please enter num2");
               double y=s.nextDouble();
               
             ADDITION(x,y);
               
             System.out.println("Addition of two numbers="+ADDITION(x,y) );
             p.println(x+"+"+y+"="+ADDITION(x,y));
              
               }  else if (option==2){
                       System.out.println("please enter rows ");
                          int r=s.nextInt();
        System.out.println("please enter coloumb");
                          int c=s.nextInt();

       ADDITIONarry(r,c,p);
               }
               else{ 
                   System.out.println("Error");
                       }
           }
           else if (operation==2){
               System.out.println("Please enter num1");
          double x=s.nextDouble();
             System.out.println("Please enter num2");
          double y=s.nextDouble();
            SUBTRACTATION(x,y) ;
             System.out.println("Subtraction of two numbers="+SUBTRACTATION(x,y));
           p.println(x+"-"+y+"="+SUBTRACTATION(x,y));
           }
           else if (operation==3){
               System.out.println("Please enter num1");
         double  x=s.nextDouble();
             System.out.println("Please enter num2");
          double y=s.nextDouble();
          MULTIPLICATION(x,y) ;
            
            System.out.println("Multiplication of two numbers="+MULTIPLICATION(x,y) );
          p.println(x+"*"+y+"="+MULTIPLICATION(x,y) );
          }
           else if (operation==4){
               System.out.println("Please enter num1");
          double x=s.nextDouble();
             System.out.println("Please enter num2");
          double y=s.nextDouble();
             DIVISION(x,y)  ; 
             
             System.out.println("Division of two numbers="+DIVISION(x,y));
           p.println(x+"/"+y+"="+DIVISION(x,y)); 
           }
           else if (operation==5){
               System.out.println("Please enter num1");
         double  x=s.nextDouble();
             System.out.println("Please enter num2");
          double y=s.nextDouble();
               REMINDER(x,y);  
               System.out.println("Reminder of two numbers="+REMINDER(x,y));
          p.println(x+"%"+y+"="+REMINDER(x,y));
          
           }
           else {
           System.out.println("invaild number");
           }       
}
public static void Unairy ( PrintStream p)throws FileNotFoundException{
   int operation; 
Scanner s=new Scanner (System.in);

    operation=menu3();      
       if(operation==1){
              System.out.println("Please enter numebr");
              double  x=s.nextDouble();
              SQUAREROOT(x); 
               
              System.out.println("Square-Root of number="+ SQUAREROOT(x));
              
          p.println("squareroot"+"("+x+")"+"="+SQUAREROOT(x));
            
           }
           else if (operation==2){
               System.out.println("Please enter number");
         double  x=s.nextDouble();
                 NUMBERSQUARED(x);
                 
                System.out.println("Number Squared="+NUMBERSQUARED(x)); 
           p.println("squared"+"("+x+")"+"="+NUMBERSQUARED(x));
           
           }
           else if (operation==3){
               System.out.println("Please enter number");
         double  x=s.nextDouble();
              NUMBERINCREMENT(x);  
              System.out.println("Number increment="+NUMBERINCREMENT(x));
               p.println(x+"+1"+"="+NUMBERINCREMENT(x));
           }
           else if (operation==4){
               System.out.println("Please enter number");
         double  x=s.nextDouble();
                 NUMBERDECREMENT(x);
              System.out.println("Number decrement="+NUMBERDECREMENT(x)); 
              p.println(x+"-1"+"="+NUMBERDECREMENT(x));  
           }          
}
public static double ADDITION (double x,double y){

                double addition=x+y;
          
return addition ;
}

public static double SUBTRACTATION (double x,double y){

           double subtraction=x-y;
           
return subtraction ;
}

public static double MULTIPLICATION (double x,double y){

           double Multiplication=x*y;
           
return Multiplication ;
}

public static double DIVISION (double x,double y){

           double Division=x/y;
           
return Division ;
}

public static double REMINDER (double x,double y){

           double Reminder=x%y;
           
return  Reminder ;
}

public static double SQUAREROOT (double x){

                double squareroot=Math.sqrt(x);
           
return  squareroot ;
}

public static double NUMBERSQUARED (double x){

           double numbersquared=Math.pow(x,2);
           
return numbersquared  ;
}

public static double NUMBERINCREMENT (double x){

           double numberincrement=x+1;
           
return  numberincrement ;
}

public static double NUMBERDECREMENT (double x){

                   double numberdecrement=x-1;
           
return  numberdecrement ;
}

public static void drawline (char n, int length){
    for (int i=0 ; i<length ; i++){
    System.out.print(n);    
    }
    System.out.println();
}
public static void ADDITIONarry (int r,int c,PrintStream p){
double arr1 [][] = new double [r][c]; 
double arr2 [][] = new double [r][c]; 
double arr3 [][] = new double [r][c];
    System.out.println("Please Enter frist Array");
for (int i =0 ; i<r ; i++){
for(int j = 0 ; j<c ; j++){
arr1 [i][j] = s.nextDouble();
}} 
   System.out.println("Please Enter second Array");
for (int i =0 ; i<r ; i++){
for(int j = 0 ; j<c ; j++){
arr2 [i][j] = s.nextDouble();
}} 
    System.out.println("Sum");
for (int i =0 ; i<r ; i++){
for(int j = 0 ; j<c ; j++){
arr3 [i][j] = arr1 [i][j] + arr2 [i][j];
    System.out.println(arr3[i][j]);
p.println("Sum="+arr3[i][j]);
}} 
}
public static int menu1(){
System.out.println("Caculator\n");
drawline('#',10);
System.out.println("Choose");
drawline('*',5);
System.out.println("1.Binary operatios");
System.out.println("2.Uniary operatios");
System.out.println("(-1).End the program");
int option=s.nextInt();
return option;}
public static int menu2(){
System.out.println("CHOOSE");
     drawline('*',5);
           System.out.println("1-Addition");
           System.out.println("2-Subtraction");
           System.out.println("3-Multipilcation");
           System.out.println("4-Divison");
           System.out.println("5-Reminder");
           int option=s.nextInt();
return option;}
public static int menu3(){
System.out.println("CHOOSE");
drawline('*',5);
           System.out.println("1-Square-Root");
           System.out.println("2-Number Squared");
           System.out.println("3-Number increment");
           System.out.println("4-Number decrement");
           int option=s.nextInt();
return option;}
public static int menu4(){
System.out.println("CHOOSE");

           System.out.println("1-Addition for numbers");
           System.out.println("2-Addition for arrays");
           int option=s.nextInt();
    return option;       
}
}