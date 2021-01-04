class E  //신문지1장을 50번 접었을 때의 두께? (단, 100장이 1cm) 
{
	void m1(){
		long r = 1L;
		for(int i=0; i<50; i++){
             r = r * 2;
		}
		System.out.println("장수1: " + r);
		System.out.println("두께1: " + r/(100*100*1000) + "km");
	}
	void m2(){
		double r = Math.pow(2,50); 
        System.out.println("장수2: " + r);
		System.out.println("두께2: " + r/(100*100*1000) + "km");
	}
	public static void main(String[] args) 
	{
		E e = new E();
        e.m1();
		e.m2();
	} 
}

