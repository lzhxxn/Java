import java.io.*;

class I 
{
	void input(){
		System.out.println("화장실에서 먼저 나오는 것은?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
			String line = br.readLine();
			System.out.println("사용자의 입력내용: " +line);
			}
		}catch(IOException ie){
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println("args[0]: " + args[0]);
		//System.out.println("args[1]: " + args[1]);

		new I().input();
	}
}
