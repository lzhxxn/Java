import java.util.*;

//주인공: Map with Generic
class DD 
{
	Hashtable<Integer, String> h = new Hashtable<Integer, String>();//Generic ( JDK5이상~ )
	void in(){
		h.put(new Integer(1), "봄");
		h.put(new Integer(2), "여름");
		h.put(new Integer(3), "가을");
		//h.put(new Integer(2), "초여름"); //key중복 
		h.put(new Integer(5), "여름"); //value중복
		h.put(new Integer(4), "겨울");
	}
	void out(){
		Enumeration<Integer> e = h.keys();
		while(e.hasMoreElements()){
			//Object key_obj = e.nextElement();
			//Integer key = (Integer)key_obj;

			Integer key = e.nextElement(); 
			System.out.println(
				"key: " + key+ ", value: "+ h.get(key));
		}
	}
	public static void main(String[] args) 
	{
		DD d = new DD();
		d.in();
		d.out();
	}
}
