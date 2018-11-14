import java.util.Scanner;
class TimeConversion{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int minutes;
    int time = 0;
    int hours;
    System.out.println("Enter a time in minutes.");
    
    hours = time / 60;
    minutes = time % 60;
    
   time=input.nextInt();
   
   System.out.println("The time in minutes is: " + minutes);
    
    System.out.println("The time in hours is: " + hours);
  }
  
}
