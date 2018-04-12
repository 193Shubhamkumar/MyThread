package com.example;

class MyRunnableThread implements Runnable{
	 
    public static int Count = 0;
    
//    public static int myThread = 0;
    
   // public MyRunnableThread(){
         
    //}
    public void run() {
    	
        while(MyRunnableThread.Count <= 5){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread.Count));
                Thread.sleep(1000);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
       }
    } 

  

    public static void main(String args[]) {
        System.out.println("Starting Main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnableThread.Count <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread.Count));
                Thread.sleep(1000);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread ");
   }
}

