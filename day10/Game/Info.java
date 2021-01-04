import java.io.*;
import java.util.*;

class Info 
{
	String fname="info.txt";
	String delimiter = ":";
	HashMap<String, String> map =  new HashMap<String, String>();
	BufferedReader br;

	Info(){
		FileReader fr = null;
		try{
			fr = new FileReader(fname);
			br = new BufferedReader(fr);

			readInfo();
		}catch(FileNotFoundException fe){
		    P.pln("먼저 셋팅파일("+fname+")을 만들어주세요");
			System.exit(-1);
		}finally{
			try{
				fr.close();
			}catch(IOException ie){}
		}
	}
	void readInfo(){
		try{
			String line = null;
		    while((line=br.readLine()) != null){
				String tokens[] = line.split(delimiter);
				map.put(tokens[0].trim(), tokens[1].trim());
			}

			//showMap();
		}catch(IOException ie){
		}finally{
			try{
				br.close();
			}catch(IOException ie){}
		}
	}
	/*void showMap(){
	    Set<String> keys = map.keySet();
		for(String key: keys){
			P.pln("key: " + key + ", value: " + map.get(key));
		}
	}*/
}
