import java.util.*;

//���ΰ�: List
class B 
{
	Vector v = new Vector();
	void in(){
	    String str = "��";
		v.add(str); //�ڵ�����ȯ
		v.add("����");
		v.add(str);
		v.add("�ܿ�");
		//v.add("����");
	}
	void out(){
		for(int i=0; i<v.size(); i++){
			Object obj = v.get(i);
			String item = (String)obj; //��������ȯ
			System.out.println("item("+i+"): " + item);
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.in();
		b.out();
	}
}
