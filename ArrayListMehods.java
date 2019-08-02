import java.util.*;
class ArrayListMehods{
    public static void main(String [] args){
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("george");
        a1.add("Jim");
        a1.add("John");
        a1.add("Blake");
        a1.add("Kevin");
        a1.add("Micheal");
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("george");
        a2.add("Katy");
        a2.add("Kevin");
        a2.add("Michelie");
        a2.add("Ryan");
        
        a1.addAll(a2);
        System.out.println(a1);
        a1.retainAll(a2);
        System.out.println(a1);
        
        
        
            
    }
}
