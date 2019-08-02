class OC{
    int a=20;
    static int b=20;
    private static int c=20;
    
    class NSNC{
        void display(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
class Demo{
    public static void main(String []args){
        OC s2 = new OC();
        OC.NSNC s1 =  s2.new NSNC ();
        s1.display();
    }
}