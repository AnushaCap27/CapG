package com.cag.day7;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class MyFirstThread {
	public static void main(String[] args) {
		Thread t1=new Thread( new MyThread());
		Thread t2=new Thread(new MyThread());
		t1.setName("A");
		t2.setName("B");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
