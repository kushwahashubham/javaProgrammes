class A{
    int a;
    private int b;
    public int z;
    protected int k;
    void read(int a, int b, int z, int k)
    {
        this.a=a;
        this.b=b;
        this.z=z;
        this.k=k;
    }
    void displayA()
    {
        System.out.println(a+b+z+k);
    }
}
class B extends A
{
    int s=60;
    void displayB()
    {
        System.out.println(a+b+z+k+s);
    }
}
class test
{
    public static void main(String []args)
    {
        A a1= new A();
        a1.read(10,20,30,40);
        a1.displatA();
        B b1= new B();
        b1,displayB();
    }
}