import java.util.ArrayList;
class IPL_Team{
    
    String tname,wicketKeeper,allrounder,captain;
    
    IPL_Team(String tname, String wicketKeeper, String allrounder, String captain){
        tname = this.tname;
        wicketKeeper = this.wicketKeeper;
        allrounder = this.allrounder;
        captain = this.captain;
    }
    
    class player{
        String plName;
        int price;
        
        player(String plName, int price){
            plName = this.plName;
            price = this.price;
        }
    }
}

class A{
    public static void main(String [] args){
        IPL_Team pl = new IPL_Team("Sing","Shbham","loki","Atul");
        IPL_Team pm = new IPL_Team("Don","Shivam","goli","xyz");
        IPL_Team pn = new IPL_Team("henk","jinks","mona","donkey");
        IPL_Team.player s1 = pl.new player("Atul",1200000);
        IPL_Team.player s2 = pm.new player("xyz",1200000);
        IPL_Team.player s3 = pn.new player("donkey",1200000);
        ArrayList<IPL_Team> AL=new ArrayList<IPL_Team>();     
        AL.add(pl);
        AL.add(pm);
        AL.add(pn);
        for(IPL_Team va:AL){
            System.out.println(va.tname+" "+va.wicketKeeper+ " " +va.allrounder+ " " +va.captain+ " ");
        }1
    }
}