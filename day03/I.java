import java.io.*;

class I 
{
	void input(){
		System.out.println("ȭ��ǿ��� ���� ������ ����?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
			String line = br.readLine();
			System.out.println("������� �Է³���: " +line);
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
