import java.io.*;

class A 
{
	BufferedReader br 
		= new BufferedReader(new InputStreamReader(System.in));

    void m1(){ //CompileException 예 
		try{
			System.out.print("취미는? ");
			String line = br.readLine();
			System.out.println("답: " + line);
		}catch(IOException ie){
			System.out.println("예외발생했네");	
		}
	}
	void m2(){ //RuntimeException 예 
		String str = "돈";
		try{
			System.out.println("#1");
			int i = Integer.parseInt(str);
			System.out.println("#2");
			System.out.println("i: " + i);
			System.out.println("#3");
		}catch(NumberFormatException ne){
			System.out.println("에이.. 숫자형태가 아니잖어");	
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
