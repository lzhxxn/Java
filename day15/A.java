import java.io.*;

class A 
{
	InputStream is = System.in; //node, byte, 입력  
	InputStreamReader isr = new InputStreamReader(is); //bridge, character, 입력
	BufferedReader brKey = new BufferedReader(isr); //filter, character, 입력

	PrintStream ps = System.out; //node, byte, 출력 
	void m1() { //Keyboard --> Moniter
		ps.print("기억하는 영화는? ");
		String line = "";
		try{
			line = brKey.readLine();
			ps.println("읽은 값: " + line);
		}catch(IOException ie){
		}
	}

	void m2(){ //File --> Moniter 
		BufferedReader brFile = null; //filter, character, 입력 
		FileReader fr = null; //node, character, 입력
		try{
			fr = new FileReader("../수스자바.java");
			brFile = new BufferedReader(fr); 
			String line = "";
			while((line = brFile.readLine()) != null){
				ps.println(line);
			}
		}catch(FileNotFoundException fe){
		}catch(IOException ie){
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		//a.m1();
		a.m2();
	}
}
