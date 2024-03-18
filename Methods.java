import java.until.Scanner;
Public class RectangleArea{
Public static double
computeArea(double length,double width{
//Calculate and return the area 
return length*width;
}
Public static void main(string[]args){
Scanner scanner=new
Scanner(System.in);
//Get dimensions from the user 
System.out.print("Enter the length of the rectangle:");
double length=scanner.nextDouble();
system.out.print("Enter the width of the rectangle:");
double width=scanner.nextDouble();
//Call the method to calculate the area
double area=computeArea(length,width);
//Print the calculated area
System.out.printIn("The area of the rectangle is:"+area);
}
}

 