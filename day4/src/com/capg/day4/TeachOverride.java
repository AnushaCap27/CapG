package com.capg.day4;

//Method overloading can be done within same class
//There will be many method with same name and different parameters
//You can call this 
class MyPerson {
  public void work() {
      System.out.println("sleeping..");
  }
  public void work(int homeWork) {
      System.out.println("doing home work");
  }
  public void work(String schoolWork) {
      System.out.println("doing School work");
  }
  public void work(double officeWork) {
      System.out.println("doing office work");
  }
}
class School extends MyPerson {
  //Our class should extends the other class
  //Method should be present in base and child class
  //it will override the behaviour of parent class and child class method will work
  @Override
  public void work() {
      System.out.println("Study the subject");
  }
}
public class TeachOverride {
  public static void main(String[] args) {
      MyPerson person = new MyPerson();
      person.work();
      // doing home work
      person.work(2);
      // doing subject school work
      person.work("English");
      // doing office work
      person.work(10.000);
      School school=new School();
      school.work("cap");
  }
}