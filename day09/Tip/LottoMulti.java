import java.io.*;
import java.util.*;

class LottoMulti 
{
	String fname = "�츮�ݸ���Ʈ.txt";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	FileReader fr;
	BufferedReader brFile;

	void readPath(){ //step 1
		P.p("����Ʈ ����(�⺻ : �츮�ݸ���Ʈ.txt): ");
		try{
			String path = br.readLine();
			if(path != null) path = path.trim();
			if(path.length() != 0){
				fname = path;
			}
			fr = new FileReader(fname);
       
	        brFile = new BufferedReader(fr);
			readFile();
		}catch(FileNotFoundException fe){
			P.pln("�׷� ������ �������� �ʾƿ�");
			readPath();
		}catch(IOException ie){
			readPath();
		}
	}

	Hashtable<Integer, String> map = new Hashtable<Integer, String>();
	void readFile(){ //step 2
		try{
			int count = 0; 
			String line = "";
			while((line = brFile.readLine()) != null){
				map.put(count++, line);
			}
		}catch(IOException ie){
		}

		//showMap();
		readWinnerCnt();
	}
	/*void showMap(){
		Set<Integer> keys = map.keySet();	
		for(int key: keys){
			String name = map.get(key);
			P.pln("key: " + key + ", name: " + name);
		}
	}*/

	int cntWinner;
    void readWinnerCnt(){//step 3
		P.p("��÷�ڼ�: ");
		String cntWinnerStr = "";
		try{
			cntWinnerStr = br.readLine();
		}catch(IOException ie){}
		if(cntWinnerStr != null) cntWinnerStr = cntWinnerStr.trim();
		if(cntWinnerStr.length() == 0){
			readWinnerCnt();
		}else{
			try{
				cntWinner = Integer.parseInt(cntWinnerStr);
				if(cntWinner<0 || cntWinner>map.size()){
                    P.pln("������ �Ѿ���� (�� "+map.size()+")");
					readWinnerCnt();
				}else{
					//P.pln("������ ��: " + cntWinner);
					moveKeys();
                    for(int i=0; i<cntWinner; i++) select();
					showWinner();
				}
			}catch(NumberFormatException ne){
				readWinnerCnt();
			}
		}
	}

	Vector<Integer> v = new Vector<Integer>();
	void moveKeys(){
		Enumeration<Integer> e = map.keys();
		while(e.hasMoreElements()){
			v.add(e.nextElement());
		}
		//for(int key : v) P.pln("key : " + key);
	}

	Random r = new Random();
	TreeSet<Integer> s = new TreeSet<Integer>();
	void select(){
		int i = r.nextInt(v.size()); //0 ~ 19
		int winnerKey = v.get(i);

		v.remove(i); 
		s.add(winnerKey);
	}
	void showWinner(){
		Iterator<Integer> winnerKeys = s.iterator();
		while(winnerKeys.hasNext()){
			int winnerKey = winnerKeys.next();
			System.out.println("��÷��=> ��ȣ: " + winnerKey + ", �̸�: " + map.get(winnerKey) );
		}
	}
	public static void main(String[] args) {	
		LottoMulti lo = new LottoMulti();
		lo.readPath();
	}
}


/* 
  < �˰��� > 
1. ������ �д´� ( ����: �ش�����X )
2. �����Ѵ� ( Map )
3. �����Ѵ� ( ������� -> ��÷�ڸ��[Set] ) 

cf) �������� ���� ( ��ȣ �Բ� ��� )
*/



