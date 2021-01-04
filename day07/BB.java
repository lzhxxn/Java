import java.util.*;

//주인공: List with Generic
class BB 
{
	Vector<String> v = new Vector<String>(); //Generic ( JDK5이상~ ) 
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
			//Object obj = v.get(i);
			//String item = (String)obj; //강제형변환
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
