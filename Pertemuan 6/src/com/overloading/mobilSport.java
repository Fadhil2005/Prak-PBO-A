package com.overloading;

public class mobilSport {
  private String nama;

  public mobilSport(String nama){
    this.nama = nama;
  }
  public void gigi(int g){
    System.out.println(nama + " masuk ke gigi " + g);
  }
  public void gigi(int g, int t){
    System.out.println(nama + " masuk ke gigi " + " dengan turbo " + t);
  }
}
