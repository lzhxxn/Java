import java.io.*;

class A 
{
	BufferedReader br 
		= new BufferedReader(new InputStreamReader(System.in));

    void m1(){ //CompileException �� 
		try{
			System.out.print("��̴�? ");
			String line = br.readLine();
			System.out.println("��: " + line);
		}catch(IOException ie){
			System.out.println("���ܹ߻��߳�");	
		}
	}
	void m2(){ //RuntimeException �� 
		String str = "��";
		try{
			System.out.println("#1");
			int i = Integer.parseInt(str);
			System.out.println("#2");
			System.out.println("i: " + i);
			System.out.println("#3");
		}catch(NumberFormatException ne){
			System.out.println("����.. �������°� �ƴ��ݾ�");	
			System.out.println("#4");
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		//a.m1();
		a.m2();
	}
}
