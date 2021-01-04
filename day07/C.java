import java.util.*;

//주인공: Set
class C 
{
	TreeSet ts = new TreeSet();

	void in(){
		ts.add("봄"); ts.add("여름"); ts.add("가을"); ts.add("봄"); ts.add("겨울"); 
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
