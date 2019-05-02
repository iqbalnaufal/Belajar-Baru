/**
 * Auto Generated Java Class.
 */
public class Belajar {
  
  
  public static void main(String[] args) { 
    Manusia alvin = new Manusia("Alvin");
    Manusia qhistina = new Manusia ("Qhistina");
    Bunga mawar = new Bunga("mawar");
    Apel apel = new Apel("apel");
    //Belajar belajar = new Belajar();
    
    alvin.memberi(mawar, qhistina);
    alvin.memberi(apel, qhistina);
  }
  
  /* ADD YOUR CODE HERE */
  
}

class Manusia {
  String nama;
  
  Manusia(String nama) {
    this.nama = nama;
  }
  
  void memberi(Bunga bunga, Manusia manusia) {
    System.out.println(this.nama + " memberi " + bunga.getNama() + " kepada " + manusia.nama);
  }
  
  void memberi(Apel apel, Manusia manusia) {
    System.out.println(this.nama + " memberi " + apel.nama + " kepada " + manusia.nama);
  }
}

class Bunga {
  private String nama;
  
  Bunga (String nama) {
    this.nama = nama;
  }
  
  String getNama() {
    return (this.nama);
  }
}

class Apel {
  String nama;
  
  Apel (String nama) {
    this.nama = nama;
  }
}