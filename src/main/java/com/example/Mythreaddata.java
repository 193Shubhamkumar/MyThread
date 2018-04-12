package com.example;



public class Mythreaddata implements Runnable  {
	
    public static int count = 1;
    public void run() {
    	while(Mythreaddata.count < 10);
    	
    	try {
    		System.out.println("print Thread 1 value"+(++Mythreaddata.count));
    		Thread.sleep(1000);
    		
    	 } catch (InterruptedException iex) {
    		 System.out.println("print value one by one");
    	 }
    	
    }

    

    public static void main(String args []) { 	
    	System.out.println("starting main thread");
    
    Mythreaddata m1 = new Mythreaddata();
    Thread t1 = new Thread(m1);
    t1.start();

    
}

    }

    

