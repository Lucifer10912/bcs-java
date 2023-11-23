class slip4_1{ 
public static void main(String args[])
{ 
int m1[][]={{1,3,4},{2,4,3},{3,4,5}}; 
 
int t[][]=new int[3][3]; 
 
//Code to transpose a matrix 
for(int i=0;i<3;i++)
{ 
for(int j=0;j<3;j++)
{ 
t[i][j]=m1[j][i]; 
} 
} 
 
System.out.println("Printing Matrix without transpose:"); 
for(int i=0;i<3;i++)
{ 
for(int j=0;j<3;j++)
{ 
System.out.print(m1[i][j]+" "); 
} 
System.out.println();//new line 
} 
System.out.println("Printing Matrix After Transpose:"); 
for(int i=0;i<3;i++)
{ 
for(int j=0;j<3;j++)
{ 
System.out.print(t[i][j]+" "); 
} 
System.out.println();//new line 
} 
}} 