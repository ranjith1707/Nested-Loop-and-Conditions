
// Nessted If condition;
import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("LEVEL 1 !  and Entre your Score");
int level=input.nextInt();
  if(level>=30){
		  	 System.out.println("Welcome to second Level!   and Enter your Score");
		  	  level=input.nextInt();
		  	 		 if(level>50){
		  	  			System.out.println("welcome to the Third Level !   and entre the Score");
		  	  			level=input.nextInt();
		  	  					if(level>80){
		  	  						System.out.println("Welcom to the final round !   enter your Score");
		  	  						level=input.nextInt();
		  	  								if(level>=99){
		  	  									System.out.println("  Congrads    WiNn The MaTcH   !");
		  	  								}
		  	  								else
		               						   System.out.println("Your loss  try again");
  	  								}
  	  								else
               						   System.out.println("Your loss try again");
  	  				}
  	 				 else
               		   System.out.println("Your loss try again");
  		}
  		else
          System.out.println("Your loss try again");
	}
}