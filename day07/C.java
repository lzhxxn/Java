import java.util.*;

//���ΰ�: Set
class C 
{
	TreeSet ts = new TreeSet();

	void in(){
		ts.add("��"); ts.add("����"); ts.add("����"); ts.add("��"); ts.add("�ܿ�"); 
	}
	void out(){
		Iterator iter = ts.descendingIterator(); //ts.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			String item = (String)obj;
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		C c = new C();
		c.in();
		c.out();
	}
}
