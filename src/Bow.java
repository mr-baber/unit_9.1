public class Bow extends Ranged {
    private int pullback;
  
    public Bow(){
      super("WOODEN BOW", 5, 20);
      pullback = 3;
    }
  
    public Bow(String name, int damage, int distance, int pullback){
      super(name, damage, distance);
      this.pullback = pullback;
    }
  
    public String toString(){
      return super.toString() + ", " + pullback + " seconds to draw";
    }
  }