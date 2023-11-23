import java.io.*;
import java.util.*;
class display
{
public static void main(String args[]) throws Exception
 {
int cnt=0;
String fname=args[0];
FileInputStream f1=new FileInputStream(fname);
Scanner s=new Scanner(f1);
while(s.hasNextLine())
{
 s.nextLine();
cnt++;
}
System.out.println("Total number of lines"+cnt);
f1.close();
}}
