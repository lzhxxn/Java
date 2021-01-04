import java.io.*;
import java.util.*;

class Q {
    TreeSet<String> tempSet = new TreeSet<String>(); //중복 회비용 셋 
	Vector<String> filteredList = new Vector<String>(); //필터링된 문제리스트  
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
			 P.pln(Setting.ORIGINAL+"이란 파일을 못 찾음");
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
			P.pln(Setting.FILTERED+"에 문제 저장 완료!");
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

			//for(String q: filteredList) P.pln("정제된 문제: " + q);
			inputTeamNum();
		}catch(FileNotFoundException fe){
		}catch(IOException ie){
		}
	}
	void inputTeamNum(){
		P.p("#팀번호: ");
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
				P.pln("문제가 다 떨어졌어요 ㅠㅠ");
				//timer.recordScore(); //스코어는 저장하지 않겠음.. 왜냐면 중간에 멈췄기때문에.. 
				timer.saveFilteredList(); //문제가 떨어졌어도.. 맞춘문제는 filtered.txt에서 제거하여 저장
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
    < 퀴즈 대회 >
    1) Q.txt(원본) 를 읽는다 
	2) 중복을 제거하고 공백을 제거한 문제(start.txt) 정렬하여 저장한다
	3) start.txt에서 random하게 단어를 뽑고, 시간(게임당시간)을 흐르게 만든다 
	   ( 게임을 마치면.. 이미 맞춘 문제는 (end.txt) 백업용으로 저장 )
	4) 스코어를 출력해준다
	   ( 옵션: 팀별 스코어를 합산 )
*/
