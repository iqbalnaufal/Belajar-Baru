/**
 * Auto Generated Java Class.
 */
public class SimulasiJaringanListrik {
  
  
  public static void main(String[] args) { 
    Elektronik meteran1 = new Meteran(100);
    Elektronik tv1 = new TV(5);
    Elektronik t1 = new Te(100);
    
    
    meteran1.output(t1);
    t1.output(tv1);
    
    
    meteran1.mematikan();
    t1.menyalakan();
    tv1.menyalakan();
    
    tv1.printStatus();
    
    meteran1.menyalakan();
    tv1.printStatus();
    
  }
  
  /* ADD YOUR CODE HERE */
  
}

class Elektronik {
  protected boolean saklar = false;
  protected int daya;
  protected Elektronik input, output;
  
  boolean getStatus() {
    boolean status;
    if (this.saklar && this.getClass().getSimpleName() == "Meteran")
      status = true;
    else if (this.saklar && input.getStatus())
      status = true;
    else
      status = false;

    return(status);
  }
  
  boolean printStatus () {
    System.out.print(this + " ");
    if (this.getStatus())
      System.out.println("menyala");
    else
      System.out.println("mati");

    return(this.getStatus());
  }
  
  boolean menyalakan() {
    this.saklar = true;
    return (this.getStatus());
  }
  
  boolean mematikan() {
    this.saklar = false;
    return (this.getStatus());
  }
  
  void input(Elektronik elektronik) {
    this.input = elektronik; 
  }
  
  void output (Elektronik elektronik) {
    this.output = elektronik;
    // meteran1.elektronik = tv1
    elektronik.input(this);
    // tv1.input(meteran1);
  }
}

class Meteran extends Elektronik {  
  Meteran (int daya) {
    this.daya = daya; 
  }
    
  boolean printStatus() {
    System.out.print("Meteran ");
    
    return(super.printStatus());
  }
}

class TV extends Elektronik {
  TV(int daya) {
    this.daya = daya;
  }
  
  boolean printStatus() {
    System.out.print("TV ");
    
    return(super.printStatus());
  }
}

class Te extends Elektronik {
  Te(int daya) {
    this.daya = daya;
  }
  boolean printStatus() {
    System.out.print("T ");
    
    return(super.getStatus());
  }
}