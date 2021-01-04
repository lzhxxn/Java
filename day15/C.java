import java.io.*;

class C
{
	FileInputStream fis; //node 
	BufferedInputStream bis; //filter 

	//PrintStream ps = System.out; //node
	FileOutputStream fos; //node 
	BufferedOutputStream bos; //filter

    C(){
		try{
			fis = new FileInputStream("../자료실/DiscordSetup.exe");
			bis = new BufferedInputStream(fis, 2048);
			fos = new FileOutputStream("DiscordSetup.exe");
			bos = new BufferedOutputStream(fos, 2048);
		}catch(FileNotFoundException fe){
		}
	}
	void m1(){ //File --> File 
		byte bs[] = new byte[512];
		int su = 0; 
		try{
			while((su = bis.read(bs)) != -1){
				bos.write(bs, 0, su);
			}
			bos.flush();
			System.out.println("파일 복사(DiscordSetup.exe) 완료!");
		}catch(IOException ie){
		}finally{
			try{
			    if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}catch(IOException ie){}
		}
	}
	public static void main(String[] args){
		C c = new C();
		c.m1();
	}
}
