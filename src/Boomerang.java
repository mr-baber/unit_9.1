public class Boomerang extends Ranged {
    private int weight;
  
    public Boomerang(){
      super("WOOD BOOMERANG", 5, 25);
      weight = 1;
    }
  
    public Boomerang(String n, int dmg, int dist, int w){
      super(n, dmg, dist);
      weight = w;
    }
  
    public String toString(){
      return super.toString() + ", weighs " + weight + " pounds";
    }
  }