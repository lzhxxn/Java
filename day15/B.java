import java.io.*;

class B 
{
	String fname = "result.txt";
	BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in)); //�о 
	FileWriter fw;
	PrintWriter pw; //��

	B(){
		try{
			fw = new FileWriter(fname);
			pw = new PrintWriter(fw, true); 
		}catch(IOException ie){
		}
	}

	void m1(){ //Keyboard --> File
		String line = "";
		try{
			line = brKey.readLine();
			pw.println(line);
			System.out.println("���� ���� �Ϸ�!");
		}catch(IOException ie){}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
	}
}
