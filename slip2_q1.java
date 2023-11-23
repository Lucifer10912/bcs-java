class slip2_1
{
public static void main(String args[])
{
String fname = args[0];
String lname = args[1];
int w = Integer.parseInt(args[2]);
float h = Float.parseFloat(args[3]);
float BMI = w/(h * h);
System.out.println("First name is:" +fname);
System.out.println("Last Name is:" + lname);
System.out.println("weight is:" + w);
System.out.println("height is:"+ h);
System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
}
}