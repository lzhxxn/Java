class A 
{
	int is[] = {1}; //��.��.��
	//int iss[][] = new int[2][2];//��.��
	int[][] iss = {is, {20,30,40}, {500, 600}}; //��.��.��
	int[][][] isss = {iss, {{7000,8000},{9000}} }; //��.��.��

	void out1(){ //iss�� ����Ͻÿ�
		/*
		System.out.println("iss[0][0]: " + iss[0][0]);
		System.out.println("iss[1][0]: " + iss[1][0]);
		System.out.println("iss[1][1]: " + iss[1][1]);
		System.out.println("iss[1][2]: " + iss[1][2]);
		System.out.println("iss[2][0]: " + iss[2][0]);
		System.out.println("iss[2][1]: " + iss[2][1]);*/
		for(int i=0; i<iss.length; i++){
			for(int j=0; j<iss[i].length; j++){
				System.out.println("iss["+i+"]["+j+"]: " + iss[i][j]);
			}
		}
	}
	void out2(){ //isss����Ͻÿ�
		//System.out.println("isss[0][0][0]: " + isss[0][0][0]);
		for(int i=0; i<isss.length; i++){
			for(int j=0; j<isss[i].length; j++){
				for(int k=0; k<isss[i][j].length; k++)
					System.out.println("isss["+i+"]["+j+"]["+k+"]: " + isss[i][j][k]);
			}
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
        //a.out1();
		a.out2();
	}
}