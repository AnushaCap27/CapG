package com.cag.day7;

class MySThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class MySecondThread {
	public static void main(String[] args) {
		MySThread t1=new MySThread();
		MySThread t2=new MySThread();
		t1.setName("A");
		t2.setName("B");
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
