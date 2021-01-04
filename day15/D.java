import java.io.*;

//File class 
class D 
{
	void m1() throws IOException { //���� ���� 
		File f = new File("a.txt"); //��������X
		if(f.createNewFile()){
			pln("���� ���� �Ϸ�!");
		}
	}
	void m2(){ //���丮 ���� 
		File f = new File("aa/bb/cc");
		f.mkdirs();
		pln("���丮 ���� �Ϸ�!");
	}
	void m3(){ //���� ���� �ľ�
        File f = new File("A.java"); //EditPlus 4.1.zip
		if(f.exists()){
			if(f.isDirectory()){
				pln("���丮�� ������");
			}else{
				pln("������ ������");
			}
		}else{
			pln("����X");
		}
	}
	void m4(){ //C:\SOO\Java\day15
		File f = new File("../"); //C:/SOO/Java/day15
		if(!f.isFile()){
			File childs[] = f.listFiles();
			for(File child: childs) {
				if(child.isFile()){
					pln("[F] " + child.getName());
				}else{
					pln("[D] " + child.getName());
				}
			}
		}
	}
	void m5(){ //���� ���� 
		File f = new File("A.class");
		f.delete();
	}
	void pln(String str){
		System.out.println(str);
	}
	public static void main(String[] args) throws IOException
	{
		D d = new D();
		//d.m1();
		//d.m2();
		//d.m3();
		//d.m4();
		d.m5();
	}
}
