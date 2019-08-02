import java.util.*;
class IlleagalTriangleException{
if(a+b<c){
System.out.println("the sum of a and b is smaller than c");
}
else if(b+c<a){
System.out.println("the sum of b and c is smaller than a");
}
else{
System.out.println("the sum of c and a is smaller than b");
}
}

class Triangle{
int a,b,c;
Triangle(int a,int b,int c){
a = this.a;
b = this.b;
c = this.c;
}

public static void main(String []a) throws IlleagalTriangleException{

try(Exception e){
	Triangle a1 = new Triangle(1,2,3);
	
if(a+b>c && b+c>a && c+a>b){
System.out.println("the sum of the two sides is greater than the third");
}
else{
throw IlleagalTriangleException;
}
}
catch(IlleagalTriangleException e){
System.out.println("Exception is thrown");
}
}
}