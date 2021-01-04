import java.util.*;

//주인공: Map with Generic, Boxing
class DD2 
{
	Hashtable<Integer, String> h = new Hashtable<Integer, String>();//Generic ( JDK5이상~ )
	void in(){
		h.put(1, "봄"); //AutoBoxing: int -> Integer 
		h.put(2, "여름");
		h.put(3, "가을");
		//h.put(2, "초여름"); //key중복 
		h.put(5, "여름"); //value중복
		h.put(4, "겨울");
	}
	void out(){
		Enumeration<Integer> e = h.keys();
		while(e.hasMoreElements()){
			//Object key_obj = e.nextElement();
			//Integer key = (Integer)key_obj;

			int key = e.nextElement(); //UnBoxing: Integer -> int 
			System.out.println(
				"key: " + key+ ", value: "+ h.get(key));
		}
	}
	public static void main(String[] args) 
	{
		DD2 d = new DD2();
		d.in();
		d.out();
	}
}
