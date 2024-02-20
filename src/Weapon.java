public class Weapon{
  
    private String name;
    private int damage;
    private boolean poisoned;
  
    public Weapon(){
      name = "WEAPON";
      damage = 0;
      poisoned = false;
    }
  
    public Weapon(String n, int d){
      name = n.toUpperCase();
      damage = d;
      poisoned = false;
    }
  
    public String toString(){
      return name + ": " + damage + " damage";
    }
    
  }