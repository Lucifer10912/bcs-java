import java.util.*;
class bank
{
int ano;
String nm;
float bal;
 void get()
{
 Scanner t=new Scanner(System.in);
 System.out.println("Enter account num and holder name");
 ano=t.nextInt();
 nm=t.next();
System.out.println("Enter balance");
bal=t.nextFloat();
}
void show()
{
 System.out.println("account no"+ano);
System.out.println("Account holder name"+nm);
System.out.println("balance"+bal);
}
void deposite(float d)
 {
 bal=bal+d;
 System.out.println("new balance after depositing amount"+bal);
}
void withdrwal(float w)
 {
 bal=bal-w;
 System.out.println("new balance after withdrawling 
amount"+bal);
}
 public static void main(String arag[])throws Exception
{
 bank t1=new bank();
 t1.get();
 t1.show();
Scanner t=new Scanner(System.in);
System.out.println("Enter amount to deposite");
float d=t.nextFloat();
t1.deposite(d);
System.out.println("Enter amount to withdrawl");
float w=t.nextFloat();
t1.withdrwal(w);
}
}
