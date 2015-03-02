package concurrenciathreads;

public class ThreadClass extends Thread {

	long lastExecution=0; 
	int counter=0;
	
	public ThreadClass(String name) {
		
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			long currentTime = System.currentTimeMillis();
			long elapsed = currentTime - lastExecution;
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
