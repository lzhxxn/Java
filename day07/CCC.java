import java.util.*;

//주인공: Set with Generic, EnhancedLoop
class CCC 
{
	TreeSet<String> ts = new TreeSet<String>(); //Generic ( JDK5이상~ )

	void in(){
		ts.add("봄"); ts.add("여름"); ts.add("가을"); ts.add("봄"); ts.add("겨울");
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
