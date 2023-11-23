import java.util.*; 
class account
{
String custnm; String accno; 
account()
{
custnm="Roy";
accno="ABOP123";
} 
account(String custnm,String accno)
{
this.custnm=custnm;
this.accno=accno;
}
} 
class savingacc extends account
{
int savingbal; 
int minbal=500; 
savingacc(String cnm,String ano,int savingbal)
{
super(cnm,ano);
this.savingbal=savingbal;
}
} 
class accdetails extends savingacc
{
double depositamt; 
double withdrawamt;
accdetails(String cnm,String ano,int savingbal)
{
super(cnm,ano,savingbal); 
this.depositamt=depositamt;
this.withdrawamt=withdrawamt;
}
public void deposit() 
{ 
int amt;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount you want to deposit: "); 
amt = sc.nextInt();
savingbal = savingbal + amt;
System.out.println("Balance after deposit: " + savingbal);
}
public void withdrawal() 
{ 
int amt;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount you want to withdraw: "); 
amt = sc.nextInt();
if (savingbal >= amt)
{ 
savingbal = savingbal - amt;
System.out.println("Balance after withdrawal: " + savingbal);
} 
else {
System.out.println("Your balance is less than " + amt + 
"\tTransaction failed...!!" );
}
} 
void display()
{
System.out.println("Customer Name:-\t"+custnm);
System.out.println("Customer Account No.:-\t"+accno);
System.out.println("Saving Balance:-\t"+savingbal);
System.out.println("Minimum Balance Should be:-\t"+minbal);
}
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Account No: ");
String acno = sc.next();
System.out.print("Enter Customer Name: ");
String cusnm = sc.next();
System.out.print("Enter Balance: "); 
int balance = sc.nextInt();
accdetails obj=new accdetails(cusnm,acno,balance); obj.deposit();
obj.withdrawal();
}
