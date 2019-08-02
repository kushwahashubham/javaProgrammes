class OC{
    int a=20;
    static int b=20;
    private static int c=20;
    
    static class SNC{
        void display(){
            //System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
class Demo{
    public static void main(String []args){
        OC.SNC s1 = new OC.SNC ();
        s1.display();
    }
}