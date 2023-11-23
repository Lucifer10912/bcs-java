import java.util.*;
 
class slip3_1
{
 public static void main(String args[])
 {
 String temp;
 Scanner s= new Scanner(System.in);
 
 System.out.print("Enter how many number of cities: ");
 int n= s.nextInt();
 
 String names[] = new String[n];

 System.out.println("Enter"+n+" city names:");
 for(int i=0; i<n; i++)
 {
 
 names[i] = s.nextLine();
 }
 
 //sorting strings 
 
 for(int i=0; i<n; i++)
 {
 for(int j=i+1; j<n; j++)
 {
 if(names[i].compareTo(names[j])>0)
 {
 temp=names[i];
 names[i]=names[j];
 names[j]=temp;
 }
 }
 }
 
 System.out.println("\nSorted names are in Ascending Order: ");
 for(int i=0;i<n;i++)

 {
 System.out.println(names[i]);
 }
 }
}