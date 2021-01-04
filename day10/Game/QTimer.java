import java.io.*;

class QTimer extends Thread 
{
	int sec = Setting.TIME;
	int inter = Setting.INTERVAL;

    Q q; 
    QTimer(Q q){
		this.q = q;
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
				sec--;
				if(sec%inter == 0) P.pln("남은 초: " + sec);	
				if(sec == 0) break;
			}catch(InterruptedException ie){}
		}

        //P.pln("팀번호: " + q.teamNum +", 점수: " + q.score );
		recordScore();
		saveFilteredList();

        System.exit(-1);
	}
	void recordScore(){
		File dir = new File(Setting.dirScore);
        if(!dir.exists()){
			dir.mkdir();
		}

        FileWriter fw = null;
		PrintWriter pw = null;
        try{
			File teamScoreFile = new File(dir, q.teamNum+".txt");
			fw = new FileWriter(teamScoreFile, true);
			pw = new PrintWriter(fw, true);
			pw.print(q.score+"\n");
		}catch(IOException ie){
		}finally{
			try{
				if(pw != null) pw.close();
				if(fw != null) fw.close();
			}catch(IOException ie){}
		}
	}
	void saveFilteredList(){
		FileWriter fw = null;
		PrintWriter pw = null;
		try{
			fw = new FileWriter(Setting.FILTERED);
			pw = new PrintWriter(fw, true);

			for(String item: q.filteredList){
				pw.print(item+"\n");
			}
		}catch(IOException ie){
		}finally{
			try{
				if(pw != null) pw.close();
				if(fw != null) fw.close();
			}catch(IOException ie){}
		}
	}
}
