import java.util.*;

interface A{
    int sum(int a,int b);
}
 class B{
    

    public static void main(String[] args) {
        A a1 = (a,b) -> {
            return(a+b);
            };
    System.out.println(a1.sum(2,3));
  }
}
