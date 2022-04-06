package com.capg.day2;

class Student{
	String USN;
	String Name;
	String Branch;
	long Phone;
	char Address;


public void setUSN(String usn) {
    this.USN = usn;
}

public void setName(String name) {
    this.Name = name;
}

public void setBranch(String branch) {
    this.Branch = branch;
}



public void print() {
    System.out.println("usn " + this.USN);
    System.out.println("name " + this.Name);
    System.out.println("branch " + this.Branch);
}

public Student() {
	
}

public Student(String usn, String name, String branch) {
    this.USN = usn;
    this.Name = name;
    this.Branch = branch;
}

public String getUSN() {
    return this.USN;
}

public String getName() {
    return this.Name;
}

public String getBranch() {
    return this.Branch;
}
}




public class MyPojo {
	public static void main(String[] args) {
		Student st=new Student();
		//st.print();
		 st.setUSN("4DM17IS005");
	      st.setName("Raj");
	      st.setBranch("ISE");
	      System.out.println(st.getUSN());
	      System.out.println(st.getName());
	      System.out.println(st.getBranch());
	}

}
