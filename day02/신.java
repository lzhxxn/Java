class 신 {
	public static void main(String[] args) { //지역(파), X, 변수, 참조
		아줌마 주인 = new 아줌마(); //지역(선초), X, 변수, 참조
		System.out.print("나이가 " + 주인.나이+"세인 아줌마가 ");
        주인.굽는다(); 
		System.out.print("첫번째 붕어빵의 앙꼬는 " + 주인.빵1.앙꼬+ "이고, ");
        System.out.println("두번째 붕어빵의 앙꼬는 " + 주인.빵2.앙꼬+ "이다.");
		System.out.println();

		손님 손 = new 손님();
		붕어빵 빵 = 손.구매한다(주인.빵2);
		System.out.println(
			손.이름+"가 붕어빵(앙꼬:"+빵.앙꼬+")을 구매하고, " //이름:멤버, 객소, 변수, 참조
			+손.돈+"원이 남았어요");
        System.out.print("붕어빵은 "+손.이름+"를 ");
		빵.배부르게하다();  
	}
}
