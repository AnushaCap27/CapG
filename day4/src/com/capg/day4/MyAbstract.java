package com.capg.day4;

abstract class Mobile {
   public void sendmsg()
  {
       System.out.println("Sending message");
  }
  public void call() {
      System.out.println("dialing");
  }
  
  abstract public void brand();
}
class Redmi extends Mobile {
  @Override
  public void brand() {
     
	  System.out.println("Redmi user");
      }
}
public class MyAbstract {

  public static void main(String[] args) {
      Redmi R1 = new Redmi();
      R1.sendmsg();
      R1.call();
      R1.brand();   
  }
}