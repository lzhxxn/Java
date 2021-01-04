class D 
{
	boolean flag = true;
	void m1(){
		String str = "10";
		try{
			System.out.println("#1");
			int i = Integer.parseInt(str);
			//if(flag) return;
			if(flag) System.exit(-1);
			System.out.println("#2");
		}catch(NumberFormatException ne){
			System.out.println("#3");
		}finally{
			System.out.println("#4");
		}

		System.out.println("#5"); //수행안됨. 위의 return때문에 
	}
	public static void main(String[] args) 
	{
		D d= new D();
		d.m1();
		System.out.println("#6");
	}
}
