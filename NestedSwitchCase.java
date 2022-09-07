import java.util.Scanner;
public class NestedSwitchCase{
	public static void main(String[] args){
    Scanner input=new Scanner(System.in);
   System.out.println("Enter the your rank  below 4");
   int a=input.nextInt();
   switch(a){
case 4:
   System.out.println("fail");
   System.out.println("Enter the mark  below 30  at 10, 20, 30");
   a=input.nextInt();
 		  switch(a){
				case 10:
   						System.out.println("very Low");
	break;
				case 20:
						System.out.println("Low");
                break;
				case 30:
						System.out.println("Low");
					break;
					}
						break;	
case 3:
	System.out.println("Enter the mark  below 50  at 40, 50");
   a=input.nextInt();

      switch(a){
				case 40:
   						System.out.println("B grade ");
	break;
				case 50:
						System.out.println("B+  grade");
        break;
        }
		break;		

case 2:
	System.out.println("Enter the mark  below 70  at 70, 80");
   a=input.nextInt();
	switch(a){
   				case 70:
   						System.out.println("A  grade");
	break;
				case 80:
						System.out.println("A+  grade");
break;
}



 case 1:
 	System.out.println("Enter the mark  below 100  at 90, 100");
   a=input.nextInt();
 	switch(a){
				case 90:
  						 System.out.println(" A+  grade ");
	break;
				case 100:
						System.out.println(" O  grade");
break;
				
				}
				break;

default:
	System.out.println("Default ");
			}
}
}