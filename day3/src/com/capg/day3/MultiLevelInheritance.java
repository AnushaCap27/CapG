package com.capg.day3;

//Multilevel inheritance 
class A1 {
  public void printA() {
      System.out.println("class A");
  }
}

class B1 extends A1{
  public void printB() {
    System.out.println("class B");
  }
}

class C1 extends B1{
  public void printC()
  {
      System.out.println("class c");
  }
}

public class MultiLevelInheritance {
  public static void main(String[] args) {
      C1 obj=new C1();
      
      obj.printA();
      obj.printB();
      obj.printC();
  }
}

