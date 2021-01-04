import java.io.*;
import java.util.*;

class Q {
    TreeSet<String> tempSet = new TreeSet<String>(); //�ߺ� ȸ��� �� 
	Vector<String> filteredList = new Vector<String>(); //���͸��� ��������Ʈ  
	Random r = new Random();
	BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));
	int teamNum;
	int score;
	QTimer timer;

	void init(){ //step 1 & 2
		readInfo();
		readOriginal();
	}
	void readInfo(){
	    Info info = new Info();

		Setting.ORIGINAL = info.map.get("original");
		Setting.ORIGINAL_BACK = info.map.get("original_back");
		Setting.FILTERED = info.map.get("filtered");
		String timeStr = info.map.get("time");
		Setting.TIME = Integer.parseInt(timeStr);
		String intervalStr = info.map.get("interval");
		Setting.INTERVAL = Integer.parseInt(intervalStr);
		Setting.dirScore = info.map.get("dirScore");
	}
	void readOriginal(){
		 FileReader fr = null;
		 BufferedReader br = null;
		 File f = null;
		 String line = "";
		 try{
			 fr = new FileReader(Setting.ORIGINAL);
			 br = new BufferedReader(fr);
			 while((line = br.readLine()) != null){
				 if(line != null) line = line.trim();
				 if(line.length() != 0) {
					 //P.pln(line);	
					 tempSet.add(line);
				 }
			 }	

			 saveStartFile();
		 }catch(FileNotFoundException fe){
			 P.pln(Setting.ORIGINAL+"�̶� ������ �� ã��");
		 }catch(IOException ie){
		 }finally{
			 try{
				 if(br != null) br.close();
				 if(fr != null) fr.close();
			 }catch(IOException ie){}

			 f = new File(Setting.ORIGINAL);
			 f.renameTo(new File(Setting.ORIGINAL_BACK));
		 }
	}
	void saveStartFile(){
		FileWriter fw = null;
		PrintWriter pw = null;
		try{
			fw = new FileWriter(Setting.FILTERED);
			pw = new PrintWriter(fw, true);
			for(String item: tempSet){
				pw.println(item);
			}
			P.pln(Setting.FILTERED+"�� ���� ���� �Ϸ�!");
		}catch(IOException ie){
		}finally{
			try{
				if(pw != null) pw.close();
				if(fw != null) fw.close();
			}catch(IOException ie){}
		}
	}

	void start(){ //step 3 
		FileReader fr = null;
		BufferedReader br = null;
		String line = null;
		try{
			fr = new FileReader(Setting.FILTERED);
			br = new BufferedReader(fr);
			while((line = br.readLine()) != null){
				if(line != null) line = line.trim();
				if(line.length() != 0){
					filteredList.add(line);
				}
			}

			//for(String q: filteredList) P.pln("������ ����: " + q);
			inputTeamNum();
		}catch(FileNotFoundException fe){
		}catch(IOException ie){
		}
	}
	void inputTeamNum(){
		P.p("#����ȣ: ");
		try{
			String line = brKey.readLine();
			if(line != null) line = line.trim();
            teamNum = Integer.parseInt(line);

            timer = new QTimer(this);
			timer.start();

            showQ();
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			inputTeamNum();
		}
	}
	void showQ() throws IOException {
		while(true){
			int size = filteredList.size();
			if(size>0){
				int i = r.nextInt(size);
				P.pln(filteredList.get(i));
				String line = brKey.readLine();
				if(line != null) line = line.trim();
				if(line.equalsIgnoreCase("O")){
					score++;
					filteredList.remove(i);
				}
			}else{
				P.pln("������ �� ��������� �Ф�");
				//timer.recordScore(); //���ھ�� �������� �ʰ���.. �ֳĸ� �߰��� ����⶧����.. 
				timer.saveFilteredList(); //������ �������.. ���Ṯ���� filtered.txt���� �����Ͽ� ����
				System.exit(-1);
			}
		}
	}
	public static void main(String[] args) {
		Q q = new Q();
		q.init();
		q.start();
	}
}
/*
    < ���� ��ȸ >
    1) Q.txt(����) �� �д´� 
	2) �ߺ��� �����ϰ� ������ ������ ����(start.txt) �����Ͽ� �����Ѵ�
	3) start.txt���� random�ϰ� �ܾ �̰�, �ð�(���Ӵ�ð�)�� �帣�� ����� 
	   ( ������ ��ġ��.. �̹� ���� ������ (end.txt) ��������� ���� )
	4) ���ھ ������ش�
	   ( �ɼ�: ���� ���ھ �ջ� )
*/
