class C {
	void m1(String lunch, int price){
		bb:
		switch(lunch){
			case "«��":
				System.out.println("�� «���� ����");
			    break;
			case "������":
				System.out.println("�� �������� ����");
			    switch (price){
					case 10000: System.out.println("1����");  break;
					case 15000: System.out.println("1.5����"); break bb;
					default: System.out.println("1������ 1.5������ �ƴ�"); 
			    }
				System.out.println("1: ù��° ����ġ �� ��");
				break;
			default: 
				System.out.println("�� «�͵� �������� �Ⱦ�");
		}
		System.out.println("2: �ι�° ����ġ �� ��");
	}
	public static void main(String[] args) {
		C c = new C();
		c.m1("������", 15000);
	}
}
