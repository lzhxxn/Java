import java.util.*;

//주인공: Map with Generic, Boxing
class DDD 
{
	Hashtable<Integer, String> h = new Hashtable<Integer, String>();//Generic ( JDK5이상~ )
	void in(){
		h.put(1, "봄"); 
		h.put(2, "여름");
		h.put(3, "가을");
		h.put(5, "여름"); 
		h.put(4, "겨울");
	}
	void out(){
		Set<Integer> keys = h.keySet();
		for(int key: keys) System.out.println("key: " + key+ ", value: "+ h.get(key));
	}
	public static void main(String[] args) 
	{
		DDD d = new DDD();
		d.in();
		d.out();
	}
}
