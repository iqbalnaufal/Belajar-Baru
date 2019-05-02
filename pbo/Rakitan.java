/**
 * Auto Generated Java Class.
 */
public class Rakitan {
  
  
  public static void main(String[] args) { 
    Intel intel1 = new Intel(2);
    DIMM dimm1 = new DIMM(2);
    AMD amd1 = new AMD(3);
    SODIMM sodimm1 = new SODIMM(4);
    Komputer komputer1 = new Komputer(intel1, dimm1);
    
    komputer1.cetakInfo();
    komputer1.mencabut(intel1);
    komputer1.mencabut(dimm1);
    komputer1.memasang(amd1);
    komputer1.memasang(sodimm1);
    komputer1.cetakInfo();

  }
  
  /* ADD YOUR CODE HERE */
  
}

class Komputer {
  protected CPU cpu;
  protected Memory memory;
  
  Komputer (CPU cpu, Memory memory) {
    this.cpu = cpu;
    this.memory = memory;
  }
  
  Komputer () {
  
  }
  
  public void memasang(CPU cpu) {
    this.cpu = cpu;
    System.out.println("CPU " + cpu.getCPUData() + " dipasang");
  }
  
  public void memasang(Memory memory) {
    this.memory = memory;
    System.out.println("Memory " + memory.getMemoryData() + " dipasang");
  }

  public void mencabut(CPU cpu) {
    System.out.println("CPU " + this.cpu.getCPUData() + " dicabut");
    this.cpu = null;
  }
  
  public void mencabut(Memory memory) {
    System.out.println("Memory " + this.memory.getMemoryData() + " dicabut");
    this.memory = null;
  }
  
  public void cetakInfo() {
    System.out.println("Spesifikasi: " + "CPU: " + cpu.getCPUData() + ", Memory " + memory.getMemoryData());
  }
}

class CPU {
  protected String nama;
  protected int kecepatan;
  
  CPU (String nama, int kecepatan) {
    this.nama = nama;
    this.kecepatan = kecepatan;
  }
  
  public String getCPUData() {
    return (nama + " " + kecepatan + " GHz");
  }
}

class Memory {
  protected String jenis;
  protected int kapasitas;
  
  Memory (String jenis, int kapasitas) {
    this.jenis = jenis;
    this.kapasitas = kapasitas;
  }
  
  public String getMemoryData() {
    return (jenis + " " + kapasitas + " GB");
  }
}

class Intel extends CPU{
  Intel (int kecepatan) {
    super("Intel", kecepatan);
  }
}

class DIMM extends Memory{
  DIMM (int kapasitas) {
    super("DIMM", kapasitas);
  }
}

class AMD extends CPU{
  AMD (int kecepatan) {
    super("AMD", kecepatan);
  }
}

class SODIMM extends Memory{
  SODIMM (int kapasitas) {
    super("SODIMM", kapasitas);
  }
}
