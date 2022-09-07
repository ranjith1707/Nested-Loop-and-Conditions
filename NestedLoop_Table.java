import java.util.Scanner;
public class NestedLoop_Table{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number of Lins");
int b=input.nextInt();
int a=1; 
for(int i=1; i<=b; i++){
        for (int j=1; j<=5; j++){
             if(a<10)
                System.out.print(" "+a);
            else
                System.out.print(a);
             
            for(int k=0; k<5; k++){
                System.out.print(" ");
            }
            a++;
        }
            System.out.println();
    }     
    }
}