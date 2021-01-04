class F extends Thread 
{
	int i;
    F(){
		start();
	}
	void m(){
	    System.out.println("Ω√¿€");
		synchronized(this){
			i++;
		}
		System.out.println("≥°");
	}
	public void run(){
		m();
	}
	public static void main(String[] args) 
	{
		F f = new F();
		f.m();
		try{
			Thread.sleep(10);
		}catch(Exception e){}
		System.out.println("f.i: " + f.i);
	}
}
