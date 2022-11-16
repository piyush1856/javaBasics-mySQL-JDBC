package day3.liveClass._2SysnchronizedBlock;

public class Main {
	
	public static void main(String[] args) {
		
		
		Common c1=new Common();
		//Common c2 = new Common();
		
		
		//object level lock
		//ThreadA t1=new ThreadA(c1,"Ram");
		//ThreadB t2=new ThreadB(c1,"Shyam");
		
		
		
		//class level lock
		Common c2 = new Common();
		ThreadA t1=new ThreadA(c1,"Ram");
		ThreadB t2=new ThreadB(c2,"Shyam");
		
		 
		

		t1.start();
		t2.start();
		
		
	}
		
		
		
}
/*
 * synchronized block:
=================

--if we are using synch block, we should use it inside any method, not 
as a class instance member, otherwise we will get a compile time error.

diff bt synch method and synch block:
=============================

1. in case of sync method, a thread can access only either object level
lock or class level lock of that class only.


class A{

void synchronized fun1(){

}

static void synchronized fun2(){

}
}

--but in case of synch block, a thread can access to the synch area either
by taking that class level lock, that class object level lock or any other class
level lock or object level lock also. (any type of lock.)


2. with the help of synch method one thread can enter into the that area 
only after getting one lock.

whereas with synch block a thread can enter into the sycnh area by acquiring
multiple locks simulteniosly.

class X{

public synchronized void m1(){  

Y y1 = new Y();

synchronized(y1){

Z z1 = new Z();

synchornized(z1){

synchonized(B.class){
---
--//critical area 1hour
--
}
}
}
}

}

--a thread try to execute the critical are required total 4 locks:

3 object level lock : x , y ,z 
1 class level lock : B.class




*** A thread which enters into the synchronized area is known as synchronized thread.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

