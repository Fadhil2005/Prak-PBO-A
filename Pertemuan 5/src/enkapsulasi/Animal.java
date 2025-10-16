package enkapsulasi;

public class Animal {
  private String namaHewan;
  private int umur;

  public void setNama(String namaHewan){
    this.namaHewan = namaHewan;
  }
  public String getNama(){
    return namaHewan;
  }

  public void setUmur(int umur){
    this.umur = umur;
  }

  public int getUmur(){
    return umur;
  }
}
