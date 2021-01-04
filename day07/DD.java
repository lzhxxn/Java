import java.util.*;

//���ΰ�: Map with Generic
class DD 
{
	Hashtable<Integer, String> h = new Hashtable<Integer, String>();//Generic ( JDK5�̻�~ )
	void in(){
		h.put(new Integer(1), "��");
		h.put(new Integer(2), "����");
		h.put(new Integer(3), "����");
		//h.put(new Integer(2), "�ʿ���"); //key�ߺ� 
		h.put(new Integer(5), "����"); //value�ߺ�
		h.put(new Integer(4), "�ܿ�");
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
