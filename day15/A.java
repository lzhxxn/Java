import java.io.*;

class A 
{
	InputStream is = System.in; //node, byte, �Է�  
	InputStreamReader isr = new InputStreamReader(is); //bridge, character, �Է�
	BufferedReader brKey = new BufferedReader(isr); //filter, character, �Է�

	PrintStream ps = System.out; //node, byte, ��� 
	void m1() { //Keyboard --> Moniter
		ps.print("����ϴ� ��ȭ��? ");
		String line = "";
		try{
			line = brKey.readLine();
			ps.println("���� ��: " + line);
		}catch(IOException ie){
		}
	}

	void m2(){ //File --> Moniter 
		BufferedReader brFile = null; //filter, character, �Է� 
		FileReader fr = null; //node, character, �Է�
		try{
			fr = new FileReader("../�����ڹ�.java");
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
