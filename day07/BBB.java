import java.util.*;

//���ΰ�: List with Generic, EnhancedLoop
class BBB 
{
	Vector<String> v = new Vector<String>(); //Generic ( JDK5�̻�~ ) 
	void in(){
	    String str = "��";
		v.add(str); 
		v.add("����");
		v.add(str);
		v.add("�ܿ�");
	}
	void out(){ //Enhanced Loop ( JDK5�̻�~ )
		for(String item: v) System.out.println("item: " + item);
	}
	public static void main(String[] args) 
	{
		BBB b = new BBB();
		b.in();
		b.out();
	}
}
