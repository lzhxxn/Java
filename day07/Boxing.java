class Boxing 
{
	double d = 10.123;
    void m1(){
		Double dObj = d; //AutoBoxing

        double max = Double.MAX_VALUE; //���
		double min = Double.MIN_VALUE;
		System.out.println("max: " + max);
		System.out.println("min: " + min);

		int i = dObj.intValue(); //�޼ҵ�
		System.out.println("i: " + 10); 

        System.out.println("dObj-1: " + (dObj-1)); //����! 

		double r = dObj; //UnBoxing
        System.out.println("r: " + (r+1));
	}
	public static void main(String[] args) 
	{
		Boxing b = new Boxing();
		b.m1();
	}
}
