class C implements Runnable {
	C(){
		new Thread(this).start(); //Thread is created by JVM
		m();
	}
	void m(){
		while(true){
			System.out.println("main()�� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
	public void run(){
		while(true){
			System.out.println("thread�� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) {
		C c = new C();
	}
}
