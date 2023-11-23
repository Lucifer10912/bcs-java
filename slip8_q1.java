import java.util.*;
 
public class q1
{
 public static void main (String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the radius of the sphere: ");
 double r=sc.nextDouble();
 double surface_area = 4 * 3.14 * (r * r);
 double volume = ((double)4 / 3) * 3.14 * (r * r* r); 
 System.out.println("The surface area of the sphere ="+surface_area); 
 System.out.println("The volume of sphere = "+volume); 
 }
}