import java.util.*;
interface I 
{
	
}

abstract class Staff
{
	String name;
	int age;
	int salary;
	String post;
	static int count= 0;
	Staff()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter name :");
		name=sc.nextLine();
		System.out.print("\n Enter Age :");
		age=sc.nextInt();
		
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nSALARY:"+salary+"\nDESIGNAION:"+post);	
	}
	public abstract void riseSalary();	
	
	
}

final class Doc extends Staff {
	public Doc(){
		salary=110000;
		post="Doc";
	}
	public void riseSalary(){
		salary=salary+15000;
		
	}
}

final class Nurse extends Staff{
	public Nurse(){
		salary=20000;
		post="Nurse";
	}
	public void riseSalary(){
		salary=salary+1000;
		
	}
}
final class Assistent extends Staff{
	public Assistent(){
		salary=70000;
		post="Assistent";
	}
	public void riseSalary(){
		salary=salary+20000;
		
	}
}

public class Project1 {
	public static void main(String args[])
	{
		int ch1=0,ch2=0;

		Staff s[]=new Staff[100];
		ArrayList<Staff> list=new ArrayList<Staff>();
		do{
		System.out.println();
        System.out.println();
		System.out.println("1.Add new Staff");
		System.out.println("2.Display all staff");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println();
        System.out.println();
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();

			if(ch1==1){
			do{
				System.out.println();
                System.out.println();
				System.out.println("1.Doc");
				System.out.println("2.Nurse");
				System.out.println("3.Assistent");
				System.out.println("4.Exit");
				System.out.println();
                System.out.println();
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:
						s[Staff.count++]=new Doc();
						list.add( new Doc() );
						break;
						
					case 2:
						list.add(new Nurse());
						s[Staff.count++]=new Nurse();
						break;
					
					case 3:
						list.add(new Assistent());
						s[Staff.count++]=new Assistent();
						break;
					}
			}while(ch2!=4);
		}
		if(ch1==2)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				Staff x=(Staff) i.next();
				x.display();
			}
			
		}
		if(ch1==3)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
			System.out.println(i.next());
				Staff x=(Staff) i.next();
				x.riseSalary();
			}
		}
		}while(ch1!=4);
		System.out.println("Total no. of Staff Created:"+Staff.count);
	}
}