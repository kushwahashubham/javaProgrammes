class Demo 
{
    int i;
   static char c;
   static String s;
    boolean b;
   public static void main(String [] args) 
{
    int v=10;
    Demo a1 = new Demo();
    System.out.println( a1.i+" " + a1.b);   // instance variable is being alled with the ob of class
    System.out.println(Demo.c+" " + Demo.s +" "+ v);    // static variableis being alled without the help of the obj of the class
}
}