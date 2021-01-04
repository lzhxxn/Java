class D 
{
	D(){
		new Chef().start();
		new Thread(new Server()).start();
		new Thread(new Server()).start();
		payCheck();
	}
    void payCheck(){
		while(true){
			System.out.println("계산을 한다");
			try{
				Thread.sleep(3000);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) {
		new D();
	}
}
class Chef extends Thread {
	public void run(){
		while(true){
			System.out.println("요리를 한다");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){}
		}
	}
}
class Server implements Runnable {
	public void run(){
		while(true){
			System.out.println("서빙을 한다");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
}
