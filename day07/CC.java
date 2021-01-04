import java.util.*;

//주인공: Set with Generic
class CC 
{
	TreeSet<String> ts = new TreeSet<String>(); //Generic ( JDK5이상~ )

	void in(){
		ts.add("봄"); ts.add("여름"); ts.add("가을"); ts.add("봄"); ts.add("겨울");
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
