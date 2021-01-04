import java.io.*;

//File class 
class D 
{
	void m1() throws IOException { //파일 생성 
		File f = new File("a.txt"); //실제생성X
		if(f.createNewFile()){
			pln("파일 생성 완료!");
		}
	}
	void m2(){ //디렉토리 생성 
		File f = new File("aa/bb/cc");
		f.mkdirs();
		pln("디렉토리 생성 완료!");
	}
	void m3(){ //파일 존재 파악
        File f = new File("A.java"); //EditPlus 4.1.zip
		if(f.exists()){
			if(f.isDirectory()){
				pln("디렉토리가 존재함");
			}else{
				pln("파일이 존재함");
			}
		}else{
			pln("존재X");
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
	void m5(){ //파일 삭제 
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
