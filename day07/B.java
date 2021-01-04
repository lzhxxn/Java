import java.util.*;

//주인공: List
class B 
{
	Vector v = new Vector();
	void in(){
	    String str = "봄";
		v.add(str); //자동형변환
		v.add("여름");
		v.add(str);
		v.add("겨울");
		//v.add("가을");
	}
	void out(){
		for(int i=0; i<v.size(); i++){
			Object obj = v.get(i);
			String item = (String)obj; //강제형변환
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
