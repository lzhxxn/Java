import java.util.*;

//���ΰ�: Map with Generic, Boxing
class DDD 
{
	Hashtable<Integer, String> h = new Hashtable<Integer, String>();//Generic ( JDK5�̻�~ )
	void in(){
		h.put(1, "��"); 
		h.put(2, "����");
		h.put(3, "����");
		h.put(5, "����"); 
		h.put(4, "�ܿ�");
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
