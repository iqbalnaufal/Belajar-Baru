/**
 * Auto Generated Java Class.
 * Test
 *test2
 */
public class AgeOfEmpires {
  
  public AgeOfEmpires() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  
  public static void main(String[] args) {
    Army[] S = new Army[10];
    for (int i=0; i<9; i++) {
      S[i] = new Swordman (i, new Posisi(1,1)); 
      i++;
      S[i] = new Horseman (i, new Posisi(1,1)); 
      i++;
      S[i] = new Archer (i, new Posisi(1,1));
    }
    
    for (int i=0; i<9; i++) {
      S[i].bergerak(new Posisi(4,5));
    }
    
    Horseman H = new Horseman (99, new Posisi(1,1)); 
    for (int i=0; i<9; i++) {
      S[i].menyerang(H);
    }
    /*
    Horseman[] H = new Horseman[10];
    for (int i=0; i<10; i++) {
      H[i] = new Horseman (i, new Posisi(1,1)); 
    }
    
    for (int i=0; i<10; i++) {
      H[i].bergerak(new Posisi(4,5));
    }
    
    /*
    Swordman S1 = new Swordman(1, new Posisi(2,3));
    Swordman S2 = new Swordman(2, new Posisi(2,3));
    S1.bergerak(new Posisi(4,5));
    S2.bergerak(new Posisi(4,4));
    */
  }
  
  /* ADD YOUR CODE HERE */
  
}

class Posisi {
  public int x, y;
  
  Posisi (int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Army {
  protected int nama;
  protected Posisi pos;
  protected String jenis;
  
  public void bergerak(Posisi pos) {
    System.out.println(this.jenis + this.nama + " berjalan ke " + pos.x + "," + pos.y); 
  }
  
  public void menyerang (Army prajurit) {
    System.out.println(this.jenis + this.nama); 
  }
}

class Swordman extends Army{
  Swordman (int nama, Posisi pos) {
    this.jenis = "Swordman S";
    this.nama = nama;
    this.pos = pos;
  }
}

class Horseman extends Army{
  Horseman (int nama, Posisi pos) {
    this.jenis = "Horseman H";
    this.nama = nama;
    this.pos = pos;
  }
}

class Archer extends Army{
  Archer (int nama, Posisi pos) {
    this.jenis = "Archer A";
    this.nama = nama;
    this.pos = pos;
  }
  
  public void menyerang (Army prajurit) {
    super.menyerang(prajurit);
    System.out.println(" memanah " + prajurit); 
  }
}

