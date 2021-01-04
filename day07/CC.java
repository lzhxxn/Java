import java.util.*;

//���ΰ�: Set with Generic
class CC 
{
	TreeSet<String> ts = new TreeSet<String>(); //Generic ( JDK5�̻�~ )

	void in(){
		ts.add("��"); ts.add("����"); ts.add("����"); ts.add("��"); ts.add("�ܿ�");
	}
	void out(){
		Iterator<String> iter = ts.descendingIterator(); //ts.iterator();
		while(iter.hasNext()){
			//Object obj = iter.next();
			//String item = (String)obj;
			String item = iter.next();
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		CC c = new CC();
		c.in();
		c.out();
	}
}
