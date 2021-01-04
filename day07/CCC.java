import java.util.*;

//���ΰ�: Set with Generic, EnhancedLoop
class CCC 
{
	TreeSet<String> ts = new TreeSet<String>(); //Generic ( JDK5�̻�~ )

	void in(){
		ts.add("��"); ts.add("����"); ts.add("����"); ts.add("��"); ts.add("�ܿ�");
	}
	void out(){ //Enhanced Loop
		for(String item: ts) System.out.println("item: "+item);
	}
	public static void main(String[] args) 
	{
		CCC c = new CCC();
		c.in();
		c.out();
	}
}
