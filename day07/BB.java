import java.util.*;

//���ΰ�: List with Generic
class BB 
{
	Vector<String> v = new Vector<String>(); //Generic ( JDK5�̻�~ ) 
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
			//Object obj = v.get(i);
			//String item = (String)obj; //��������ȯ
            String item = v.get(i);
			System.out.println("item("+i+"): " + item);
		}
	}
	public static void main(String[] args) 
	{
		BB b = new BB();
		b.in();
		b.out();
	}
}
