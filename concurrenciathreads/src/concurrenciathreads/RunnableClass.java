package concurrenciathreads;

import java.util.Random;

public class RunnableClass implements Runnable{

	long lastExecution=0; 
	int counter=0;
	long elapsed=0;
	
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			long currentTime = System.currentTimeMillis();
			elapsed = (lastExecution == 0) ? 0 : currentTime - lastExecution;;
			lastExecution= currentTime;
			System.out.println(Thread.currentThread().getName()+ elapsed + " ms. [" + (++counter)+"]");
			long sleep = (long)(Math.random()*2000);
			try{
				Thread.sleep(sleep);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
	}

}
