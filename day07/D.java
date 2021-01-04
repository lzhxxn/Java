import java.util.*;

//주인공: Map
class D 
{
	Hashtable h = new Hashtable();
	void in(){
		h.put(new Integer(1), "봄");
		h.put(new Integer(2), "여름");
		h.put(new Integer(3), "가을");
		//h.put(new Integer(2), "초여름"); //key중복 
		h.put(new Integer(5), "여름"); //value중복
		h.put(new Integer(4), "겨울");
	}
	void out(){
		Enumeration e = h.keys();
		while(e.hasMoreElements()){
			Object key_obj = e.nextElement();
			Integer key = (Integer)key_obj;
			System.out.println(
				"key: " + key+ ", value: "+ (String)h.get(key));
		}
	}
	public static void main(String[] args) 
	{
		D d = new D();
		d.in();
		d.out();
	}
}
