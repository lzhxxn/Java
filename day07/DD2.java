import java.util.*;

//���ΰ�: Map with Generic, Boxing
class DD2 
{
	Hashtable<Integer, String> h = new Hashtable<Integer, String>();//Generic ( JDK5�̻�~ )
	void in(){
		h.put(1, "��"); //AutoBoxing: int -> Integer 
		h.put(2, "����");
		h.put(3, "����");
		//h.put(2, "�ʿ���"); //key�ߺ� 
		h.put(5, "����"); //value�ߺ�
		h.put(4, "�ܿ�");
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
