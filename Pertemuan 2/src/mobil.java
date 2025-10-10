public class mobil {
  String tipe;
  String color;

  public void nyala(){
    System.out.println("mobil dengan warna " + this.color + " dan tipe " + this.tipe + "nyalakan mesin");
  }
  public void mati(){
    System.out.println("mobil dengan warna " + this.color + " dan tipe " + this.tipe + "matikan mesin");
  }
  public void klakson(){
    System.out.println("mobil dengan warna " + this.color + " dan tipe " + this.tipe + "bisa klakson");
  }
}
