package com.comp301.lec03;

public class ContainerMain {
  public static void main(String[] args) {
    Container<String> name = new Container<>("Tuna");
    Container<Double> price = new Container<>(1.67);
    System.out.println(name.getContents());
    System.out.println(price.getContents());
  }
}
