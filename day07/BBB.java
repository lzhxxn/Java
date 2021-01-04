import java.util.*;

//주인공: List with Generic, EnhancedLoop
class BBB 
{
	Vector<String> v = new Vector<String>(); //Generic ( JDK5이상~ ) 
	void in(){
	    String str = "봄";
		v.add(str); 
		v.add("여름");
		v.add(str);
		v.add("겨울");
	}
	void out(){ //Enhanced Loop ( JDK5이상~ )
		for(String item: v) System.out.println("item: " + item);
	}
	public static void main(String[] args) 
	{
		BBB b = new BBB();
		b.in();
		b.out();
	}
}
