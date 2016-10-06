package ishwar;

import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Game



{
	public static void main(String[] args) 



{
	String con="";
	String con1="";
	int count=0;
	int input=0;
	
	System.out.println("========================"+"rules"+"============================");
	System.out.println("small margin in this game will mean diffrence of 30 and less ");
	System.out.println("large margin in this game will mean diffrence of 30 and more ");
	System.out.println("Total no of hit allowed is 5");
	System.out.println("========================"+"rules"+"============================");
	System.out.println("Enter a number between 1 to 100 to play game");
	Scanner obj=new Scanner(System.in);
		input=obj.nextInt();
	Random robj=new Random();
	
	int sys_no=robj.nextInt(100);
	if(input==sys_no)
	{
		System.out.println("you won at"+count+"chance");
	}
	else
	{
		System.out.println(sys_no);
		while(input!=sys_no)
			
		{
			if(sys_no>input)
				
			{
				con1="Try with bigger no";
			}
			else
			{
				con1="Try with smaller no";
			}
			int difference=Math.abs(sys_no-input);
			if(difference>30)
			{
				 con="  by large Margin";
				
			}
			else if((difference<=30)&&(difference>=1))
					{
					 con=" by small margin";
					
					}
			System.out.println("you missed the hit"+con);
			System.out.println(con1);
			System.out.println("enter a no again");
			Scanner obj1=new Scanner(System.in);
			 input=obj1.nextInt();
			 count=count+1;
			 if(count==4)
			 {
				 break;
			 }
			
		}
		
		
		if(count<=5&&input==sys_no)
		{
		System.out.println("yes,you hit in  now");
		System.out.println("congrates");
		}
		else
		{
			System.out.println("Times up");
			System.out.println("you lost the game");
		}
	}
	
	
	Game.main(new String[0]);
	
}
System.out.println();

System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();



}
