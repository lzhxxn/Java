import java.util.*;

//���ΰ�: Map
class D 
{
	Hashtable h = new Hashtable();
	void in(){
		h.put(new Integer(1), "��");
		h.put(new Integer(2), "����");
		h.put(new Integer(3), "����");
		//h.put(new Integer(2), "�ʿ���"); //key�ߺ� 
		h.put(new Integer(5), "����"); //value�ߺ�
		h.put(new Integer(4), "�ܿ�");
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
