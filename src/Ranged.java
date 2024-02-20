// MOD.3.B.2
// Classes that extend a superclass, called subclasses,
// can draw upon the existing attributes and behaviors
// of the superclass without repeating these in the code.

// MOD.3.B.3
// Extending a subclass from a superclass creates an 
// "is-a" relationship from the subclass to the superclass.

// MOD.3.B.4
// The keyword extends (see below) is used to establish an
// inheritance relationship between a subclass and a 
// superclass. A class can extend only one superclass.

public class Ranged extends Weapon {
  
    private int distance;
  
    public Ranged(){
      // MOD 3.B.8
      // When a subclass's constructor does not explicitly 
      // call a superclass's constructor using super, Java 
      // inserts a call to the superclass's no-argument 
      // constructor. 
      distance = 0;
    }
  
  // MOD 3.B.5
  // Constructors are not inherited. 
    
    public Ranged(String n, int dmg, int dist){
      // MOD 3.B.6
      // The superclass constructor can be called from the 
      // first line of a subclass constructor by using the 
      // keyword super (see below) and passing appropriate
      // parameters.
  
      // MOD 3.B.7
      // The actual parameters passed in the call to the
      //supercalss constructor provide values that the 
      //constructor can use to initialize the object's 
      //instance variables. 
      super(n, dmg);
      distance = dist;
    }
  
    public String toString(){
      return super.toString() + ", effective up to " + distance + " feet";
    }
  }