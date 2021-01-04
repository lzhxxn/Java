1. HW + OS + JVM + App1, App2 .... 
   - CUP: 두뇌 
   - RAM(메모리): 책상
   - HDD/SSD: 책꽂이 
   - MainBoard: 방 
   - Card(Graphic, Sound, Ran, ..)
   - 본체/주변기기

2. JVM
   (1) JDK = jdk + jre 
   (2) 환경변수 
       - JAVA_HOME => C:\Program Files\Java\jdk-15
	   - Path => %JAVA_HOME%\bin
	   - classpath => .
   (3) API(Application Programming Interface)
       - 참조문서 

3. 실행 메커니즘 
    - 작성(.java) -> 컴파일(javac.exe) -> 실행(java.exe)
	              ex) javac A.java     ex) java A
	- .java(for Human) -> .class(for JVM)

4. 클래스 구조 
   (1) 패키지 선언
   (2) 임포트 구문 
   (3) 클래스 선언 {
	   (4)멤버변수 
	   (5) 생성자
	   (6) 메소드 
   }

   cf) 패키지 컴파일/실행 
     #> javac -d . XX.java
	 #> java aa.bb.XX

   ex) day02/A.java

5. 주석( Comment )
   (1) 1라인 
       //
   (2) 여러라인 
       /*
	   */
   (3) 문서화주석 
       /**
	   */
	   #>javadoc -d ./doc *.java
      
	ex) day02/B.java

6. 실행 순서 
    ex) day02/C.java

7. 객체 지향 용어 
   (1) 클래스(Class): 객체를 만드는 틀
        ex) 붕어빵틀 
   (2) 객체(Object): 클래스를 통해 생성된 구현물 or 모든 것 
        ex) 붕어빵  
   (3) 생성자(Constructor): 객체가 생성될 때 하는 일(기능)
        ex) 붕어빵틀()
   (4) 메소드(Method): 객체가 할 수 있는 일(기능)
        ex) 배부르게한다()
   (5) 속성(Attribute == 멤버변수): 객체의 특성  
           ( 존재이유: 다양한 객체를 만들기 위해서 )
        ex) String 앙꼬;

    ex) day02/D.java

8. 클래스 설계 
   붕어빵.java 

   /*
      일상의 어떤 현상을 상상해서.. 
      클래스 설계를 하고 출력(메소드/속성)하시오
   */
       
9. 변수(Variable) 
   (1) 유효범위 
	   1) 멤버변수(==전역)
	      <1> 클래스소속
		  <2> 객체소속
		  ex) day03/A.java

	   2) 지역변수 
	      <1> 선언초기화
		  <2> 파라미터 (매개==아규먼트)
          ex) day03/B.java
	      
   (2) 소유( static 여부) 
       1) 클래스소유(static) == 정적 == 클래스 == 공유
	   2) 객체소유(no static) == 동적 == 객체 == 인스턴스
	      ex) day03/A.java

   (3) 변경( final 여부 )  
       1) 상수 ( Constance )
	   2) 변수 ( Variable )
	      ex) day03/C.java 

   (4) 메모리 저장방식
       1) 기본형(원시데이터 == 프리미티브) 8가지 
	      <1> call by value 
		  <2> 형태: 소문자로 시작 
		  <3> 종류
		      byte(1) ▶ short(2) ▶ int(4) ▶ long(8) ▶ float(4) ▶ double(8)  
			             char(2) ▶ 
				  
			  boolean(1) 
          <4> 담을 수 있는 값의 범위 
		      1> byte: -2^7 ~ 2^7-1 (경우의수: 2^8)
			  2> short: -2^15 ~ 2^15-1 (경우의수: 2^16)
			  3> char: 0 ~ 2^16-1 (경우의수: 2^16)
			  4> int: -2^31 ~ 2^31-1 (경우의수: 2^32)
			  5> long: -2^63 ~ 2^63-1 (경우의수: 2^64)
			  6> float
			  7> double
			  8> boolean: false | true 

			  ex) day03/D.java, E.java(재미로)
		
		  <5> 형변환(Type Casting)
		      1> 자동(암시적/Implicit) by JVM 
			     -> 범위가 작은 Type ▶ 큰 Type 

			  2> 강제(명시적/Explicit) by ? 
			     -> 

			  ex) day03/F.java 

		  <6> 예외 형변환 
              -> 정수형타입(byte, short, char, int)끼리의 연산의 결과는 int 
			  ex) day03/G.java 

		  <7> 초기값 
		      -> 정수(0, 0L), 실수(0.0f, 0.0), 불린(false)
			  ex) day03/H.java 
		 
		  <8> 존재이유: 실행의 효율성 

	   2) 참조형(레퍼런스)
	      <1> call by reference 
		  <2> 형태: 대문자로 시작 
		  <3> 종류: 기본형(8가지)를 제외한 모든 타입( 무한대 )
		  <4> 초기값: null
		  <5> 형변환 
		       Object 
			     ▲
			   Human 
			     ▲
			   Superman 


	cf) 배열변수
	     -> 배열을 저장하는 변수 
	     

10. 제어 ( 비유: 부메랑 )
    어떤 프로그램이 실행되고 있을 때..
	어느 한 시점에서의 CPU연산은 어떤 특정 코드부분을 실행하고 있을 것이다 
	그 코드부분을 '제어점'이라하ㅗ, 그 제어점을 집합을 '제어'라 한다 
	즉, 프로그램의 실행흐름(Line)을 제어라 한다 

	  JVM -> main() -> ... -> main() -> JVM

	ex) day04/A.java 


11. 제어문 
   (1) 조건문 
       1) if(boolean형){} 문
	   2) if(boolean형){} else{} 문 
	   3) if(boolean형){}.. else if(boolean형){}.. else{} 문
       4) switch(정수형){ case: ... default: } 문 
	       => 정수형+String(jdk7~), break, default위치, case블럭 생략 가능
       
	   ex) day04/B.java, C.java, D.java 

   (2) 반복문 
       -> 초기식(밖), 조건식(안), 증감식(안)를 모두 갖추어야 '유한루프'가 돌게 됨
	   1) while(boolean형){} //신사
	   2) do{} while(boolean형); //조폭 
	   3) for(초기식;조건식;증감식){} //신사

       ex) day05/A.java 

12. 제어의 이동 
   (1) continue
       1) 반복블럭안에서만 사용 가능 
	   2) (조건에 맞으면) '건너뛴다'

	    cf) labeled continue 문 

	   ex) day06/A.java 

   (2) break
       1) 반복블럭이나 스위치블럭 안에서만 사용 가능 
	   2) 자기를 둘러싼 첫번째 블럭을 '나간다'

	    cf) labeled break 문 

	   ex) day06/B.java, C.java 

   (3) return 
       1) 어디에서나 사용 가능 
	   2) 호출한 곳 or 놈으로 '되돌린다'

	   ex) day06/D.java, E.java 

13. 연산자( Operator )
   (1) (데이터들을) 연산하게 하는 '기호'
   (2) 종류 
       1) 산술 ex) +, -, *, /, % 
           cf) 연산자 오버라이딩 
		    -> 양쪽 데이터 중 하나이상이 String 타입이면 +는 결합연산자 
	   2) 증감 ex) ++, --
	   3) 대입 ex) =
	   4) 산술대입 ex) +=, -=, *=, /=, %=
	   5) 비트 ex) &, |, ^, ~, 시프트(<<,>>,>>>)
	   6) 비교 ex) ==, !=, <, >, <=, >=
	   7) 논리 ex) &, &&, |, ||
	   8) 논리대입 ex) &=, |=
	   9) 조건 ex) A? B:C
	   10) instanceof ex) 객체 instanceof 클래스 

	   ex) day06/F.java 

14. 배열(Array)  ( 비유: 냉장고 )
   같은 타입의 데이터 '저장소'로써 생성될 때 크기가 고정되는 '객체'
   (1) 선언 
       type 배열변수[]; //ex) String items[];
   (2) 생성 
       배열변수 = new type[크기]; //ex) items = new String[4];
   (3) 초기화 
       배열변수[인덱스] = 데이터; //ex) items[0] = "봄";

   (4) 선언 및 생성 
       type 배열변수[] = new type[크기]; //ex) String items[] = new String[4];

   (5) 선언 및 생성 및 초기화
       type 배열변수[] = {데이터1, 데이터2, ...};
       //ex) String items[] = {"봄", "여름", "가을", "겨울"}; 

	   ex) day06/G.java 

   (6) 배열의 default 값 
       - byte, short, char, int: 0
	   - long: 0L
	   - float: 0.0f
	   - double: 0.0
	   - boolean: false
	   - 참조형: null

	   ex) day06/H.java

   (7) 형변환 
       형변환이 가능한 데이터라면 형변환되어져서 입력 됨 
	   //ex) int is[] = {b, s, c, i, (int)f};
       ex) day06/I.java

   (8) 이차원 
       일차원 배열을 데이터로 갖는 배열 
       ex) day07/A.java 

   (9) N차원 
       (N-1)차원을 배열을 데이터로 갖는 배열 
       ex) day07/A.java 
	   

15. 컬렉션(Collection)계열 ( 가변배열 == 자료구조(Data Structure) )	 
    같은 타입의 '참조형'데이터 '저장소'로써 그 크기가 변할 수 있는 '객체'

	(1) 종류
	    1)        java.util.Collection 
		             |            | 
			 java.util.List    java.util.Set 
			        |               | 
			     .....            .....

	    2)        java.util.Map 
		               | 
				 java.util.Hashtable, ....  

			
	(2) 특징 
		1) List
		    - 중복을 허용
			- 순서를 보존
		       ex) day07/B.java
			   
		2) Set ( 비유: 집합 ) 
		    - 중복을 허용 X
		    - 순서를 보존 X
			   ex) day07/C.java 

		3) Map ( 비유: 1:1 함수 )
		    - 한쌍으로 저장(key와 value)
		    - 순서를 보존 X
			- key는 중복허용X, value는 중복허용O
			   ex) day07/C.java


   cf) AutoBoxing: ( 기본형 -> Wrapper class ) 
       
16. OOP ( Object Oriented Programming ) 특성 
   (1) 상속성( Inheritance )
       부모의 '모든 것'을 자식에서 '상속받는 것'(=='사용할 수 있는 것')
	     
	   - 다른 생성자가 하나도 없을 경우에만 JVM이 기본생성자(default constructor)를 만들어 줌 
	   - 자식 객체가 생성되려면 먼저 부모객체가 생성되어야 함 
	   - 모든 생성자의 첫라인에는 super();가 생략되어 있음 ( 단, 다른 super(..)있다면 예외 )
	   - 모든 객체는 Object 자식 (묵시적 상속)
	   - 자식 메소드에서 부모 메소드의 내용을 바꿀 수 있음 ( Overriding )
	   - 형변환은 '상속관계'에서만 가능 
	      - 자동
		  - 강제 
	    ex) day08/A.java 

   (2) 다형성( Polymorphism )
        같은 타입 객체의 '동일한 메소드가 다른 일을 하는 것' 
        ex) day08/B.java 

   (3) (속성값의)은닉성( Information Hiding )
        속성값(데이터)을 외부 객체로부터 '숨기는 것'
        ex) day08/C.java 

   (4) (메소드의)캡슐화( Encapsulation )
        - 속성(데이터)과 메서드를 하나로 묶어 외부에 감추기도하고 보이게도 하는 것
        - 메소드의 형태(리턴타입,이름,파라미터)만 알면 그 내용을 몰라도 호출해서 사용할 수 있는 것 
		ex) day08/C.java, D.java 

17. (메소드)오버라이딩( Overriding ) 
   (1) '상속관계'에서 부모의 메소드의 일(내용)을 자식에서 '바꾸는 것'  
 
   (2) 조건 
       1) 메소드 이름이 같아야 함 
	   2) 반환타입이 일치해야 함 
	   3) 생성자는 불가
	   4) 파라미터의 타입과 순서와 갯수가 모두 일치 
	   5) 자식메소드의 접근제한자가 부모메소드의 접근제한자보다 같거나 넓어야 함  

	   ex) day09/A.java 

18. 오버로딩( Overloading ) 
    (1) 정의: 스스로, 인터넷, 책 
	    - 이지훈(책:혼공자): 클래스내의 같은 이름의 메소드를 여러개 선언하는 것 
		- 권성환(책:자정석): 한 클래스내에서 같은 이름의 메소드를 여러개 정의하는 것 
		- 박영후(스): 
		   - 김치 재료를 준비해서 정하는 행위 
		   - 메소드와 생성자를 같은 이름으로 조금씩 
		     다른 기능이나 변수를 받아 만든 뒤 나중에 사용할 수 있게 준비해두는 것
	    - 연주(인): 같은 클래스내에서 같은 이름 메소드를 사용하는 것 
		- 동오(스): 생성자나 같은 기능을 가진 메소드를 파라미터로 여러개 만드는 것 

		- 형수(스): ( 호출시 그 형태에 매핑되서 호출되도록 )  
		       파라미터의 종류나 순서나 갯수가 다른 '같은 이름의 메소드나 생성자를 여러개 정의하는 것' 
	(2) 종류 
	    1) 생성자 
		2) 메소드 

    (3) 특징 
	    1) 반환타입과 관계 없음 
		2) 상속관계라면 다른 클래스에서도 오버로딩 가능 
		3) 형변환이 가능한 파라미터라도 오버로딩으로 인정 
	    
       ex) day09/B.java 

19. this 와 super
   (1) this 
       1) 정의: 자신의 '객체' 또는 '생성자'를 의미하는 대명사 

	   2) 사용예 
	      <1> 지역변수와 이름이 같은 멤버변수를 해당 지역에서 접근할 때 
		  <2> 자신의 생성자를 호출할 때 
		  <3> 자신의 객체를 다른 클래스에게 넘길 때 

		   ex) day09/C.java 

   (2) super 
       1) 정의: 부모의 '객체' 또는 '생성자'를 의미하는 대명사 

       2) 사용예
	      <1> 부모의 생성자를 호출할 때 
		  <2> 이름이 같은 부모의 멤버를 자식에서 접근할 때 
		  <3> 오버라이딩되기 전의 부모메소드를 자식에서 호출할 때

		    ex) day09/D.java 

20. 제한자( Modifier )
    클래스, 인터페이스, 변수, 생성자, 메소드 앞에 붙어서 그 기능을 '제한'하는 예약어 
   (1) 접근제한자( Access Modifier )
       1) 종류 
	     <1> public: 제한이 없음
		 <2> protected: 같은 패지키 안 or 상속관계의 부모자원 
		 <3> default ( package == friendly ): 같은 패지키 안 
		 <4> private: 자신의 클래스 안  

	   2) 특징 
	     <1> 클래스나 인터페이스 앞의 접근제한자는 public 과 default 만 가능 
		 <2> public 클래스는 파일이름과 이름이 같아야 함 

	   3) 범위 
	     - 넓은 순위: public > protected > default > private
		 - 강력 순위: public < protected < default < private

         ex) day10/A.java


   (2) 소유제한자( static )
        붙으면 클래스 소유, 안붙으면 객체 소유 

       1) 멤버와 메소드에만 붙을 수 있음 
	   2) static 메소드에서는 자원접근시 자신의 클래스를 생략 가능 
	   3) 자원 접근시 클래스 이름으로 접근 
	   4) static 자원은 메모리에 1개 생성되어, 해당 클래스의 모든 객체에게 공유됨

	    ex) day10/B.java , C.java 

   (3) 수정제한자( final ) 
       붙으면 수정을 못하게 함 

       1) 클래스, 변수, 메소드 앞에 붙을 수 있음
	   2) 클래스에 붙으면 자식을 '못낳고', 변수에 붙으면 초기값을 '못바꾸고', 
	      메소드에 붙으면 '오버라이딩을 못하게 함'
	   3) 지역변수에도 붙을 수 있음
	   
	     ex) day10/D.java 

   (4) 추상제한자( abstract )
       붙으면 추상화(化)가 됨 

	   1) 클래스와 메소드 앞에서만 붙을 수 있음 
	   2) 하나 이상의 '추상메소드'만 가지고 있어도, 그 클래스는 '추상클래스'가 되어야 함 
	   3) 추상클래스의 객체는 완벽한 자식클래스를 만들어서, 그 객체를 '형변환'하여 생성함

	    cf) 추상클래스: abstract 가 붙은 클래스 
		    추상메소드: abstract 가 붙은 메소드 

	     ex) day10/E.java

    (5) 기타 제한자 
	   synchronized ( 쓰레드 ), transient ( 보안 ), native ( OS 자원 )

21. 식별자( Identifier )
    '프로그래머가 임의로' 설정하는 패키지, 클래스, 변수, 메소드 '이름'
	(1) 규칙 
	    1) 숫자가 맨 앞에 나올 수 없음
		2) 특수문자 _와 $만 가능 ( 맨 앞에 나와도 됨 )
		3) 길이의 제약은 없음

       ex) day10/F.java 

	(2) 관례 
	    1) 클래스와 인터페이스 이름은 첫문자를 대문자로 시작 
		2) 상수는 전체 문자를 대문자
		3) 패키지, 변수, 메소드 이름의 첫문자는 소문자로 시작 
		4) 2개 이상의 단어 조합은 다음 단어의 첫문자를 '대문자'로 하거나 '_'로 처리 
		5) _와 $는 자제함 
		6) 의미있는 단어로 생성함 

22. 패키지( Package )
    비슷한 종류의 '기능'이나 '업무'를 가진 클래스와 인터페이스들의 묶음 

	(1) 형태 
	    클래스 최상단에 package 라는 예약어를 사용 
		 ( ex: package soo.aa.bb; )

    (2) 컴파일 
	    #> javac -d . XXX.java //상대경로(현재 디렉토리)
		#> javac -d ./classes XXX.java //상대경로(하위 디렉토리)
		#> javac -d ../ A.java //상대경로(상위 디렉토리)
		#> javac -d C:\SOO A.java //절대경로 

		ex) day11/A.java 
   
    (3) 실행 
	    #>java soo.aa.bb.A //패키지 최상단 디렉토리로 이동 후 실행 

    (4) 압축 
	    #>jar -cvf p.jar soo

		ex) day11/AUser.java 

    (5) classpath ( *** )
	    1) -classpath 법 ( 유효범위: javac.exe, java.exe )
		   <1> 디렉토리
		      #>javac -classpath C:\SOO\Java\day11\classes AUser.java 
			  #>java -classpath .;C:\SOO\Java\day11\classes AUser

           <2> jar 
		      #>javac -classpath C:\SOO\Java\day11\jar\p.jar AUser.java 
			  #>java -classpath .;C:\SOO\Java\day11\jar\p.jar AUser

		2) set classpath 법 ( 유효범위: cmd )
		   <1> 디렉토리 
		      #>set classpath=%classpath%;C:\SOO\Java\day11\classes
			  #>javac AUser.java
			  #>java AUser

           <2> jar 
		      #>set classpath=%classpath%;C:\SOO\Java\day11\jar\p.jar
			  #>javac AUser.java
			  #>java AUser

		3) 환경변수 법 ( 유효범위: OS ) 
		   <1> 디렉토리
		        .;C:\SOO\Java\day11\classes
			  
           <2> jar
		        .;C:\SOO\Java\day11\jar\p.jar

			cf1) build path ( in elipse )
			cf2) javadoc -d ./doc *.java
		

23. 인터페이스( interface ) 
   - JDK7이하: '상수'와 '추상메소드'로 구성된 '껍데기'
   - JDK8이상: '상수'와 '추상메소드'와 'static메소드'와 'default메소드'로 구성된 '껍데기'

   (1) 생략 
       1) interface 앞에는 abstract 생략 됨 
	   2) 멤버변수앞에는 public static final 생략 됨
	   3) 메소드앞에는 public abstract 생략 됨 
	   4) static 메소드에는 public 생략 됨 
	   5) default 메소드에는 public 생략 됨 

	    ex) day12/A.java, AChild.java, AUser.java 
		
   (2) 특징 
       1) 객체는 완벽한 자식 클래스를 만들어서 그 객체 생성 후 형변환해서 만듬
       2) interface 의 static 메소드는 인터페이스 이름으로만 접근 가능 
       3) 자식클래스를 만들때에는 implements 사용 
	      ( 다중상속가능 : class BChild implements B1, B2, ... )
	      ex) day12/B.java 
       4) 인터페이스 끼리의 상속은 extends 사용  
	      ( 다중상속가능 : interface B3 extends B1, B2, ... )
	   5) 일반적인 자식클래스의 형태 
	      class Superman extends Human implements B1, B2, ... 

24. 추상클래스와 인터페이스 차이점 
    (1) 공통점 
	    - 추상메소드를 가질 수 있음 
		- 완벽한 자식객체를 생성해서 형변환 

	(2) 차이점 
	    - 클래스이고 인터페이스 근본 특성
		- 추상클래스는 일반메소드와 일반멤버변수와 생성자를 가질 수 있음

25. 예외 처리
    (1) 예외( Exception )
	    프로그램이 정상적으로 진행되지 못하게 하는 '돌발 상황'

		ex) 숫자가 아닌 형태의 문자를 숫자로 바꾸려할 때 
		    채팅하나가 상대방이 나가버린 경우 
			온라인 게임하고 있는 데 
			   - 게임서버가 다운된 경우
			   - 전원케이블이 빠짐 
			   - 번개가 쳐서 집안 전기 끊김 

	(2) 예외처리목적 
	    프로그램 진행시 발생할 수 있는 '돌발상황'을 예외로 '미리 정해놓고', 
		해당하는 예외가 발생했을 경우 적절한 조치를 취해서, 
		프로그램이 '정상적으로 작동'하도록 하는 것 

    (3) 계층도 
	                      Object 
						     | 
						  Throwable 
						  |       | 
				        Error   Exception 
						        |       | 
				    CompileException  RuntimeException 
					CheckedException

				
		ex) day13/A.java
			                 
    (4) 특징
	    1) throw 로 예외를 발생시킴 
		2) throws 로 예외발생가능성을 표식할 수 있음 ( == 떠넘길 수 있음 )
		3) try catch 로 잡을 수 있음 ( == 적극적으로 때려 잡음 )
		4) '생성자'나 '메소드'에서만 발생할 수 있음 
		5) 상위 Exception 으로도 처리가 가능

    (5) 처리방법( ***** ) 
	    1) 때려 잡는 법 
            try{
				예외발생구문(생성자 or 메소드)
		    }catch(예외타입 예외객체){
				처리 로직 
			}

		2) 떠넘기는 법 
		    throws 예외타입 

	(6) try절안에 2개 이상의 예외 발생
	    1) 예외들이 상속관계O
           [순서존재O] 하위예외부터 잡아 줌 
		   catch(MyException me)
		   catch(Exception e)

		2) 상속관계X
		   [순서존재X] 아무예외나 먼저 잡아주면 됨 
		   catch(MyException me)
		   catch(YourException ye)

		   ex) day13/B.java
	
    (7) 2이상의 예외를 떠넘길 때 
	    (ex: throws MyException, YourException, ... )
           ex) day13/C.java

	(8) finally절
	    1) 항상 수행되는 절 
		   ( 심지어.. return 을 만나더라도 수행하고 리턴 됨 )
		2) try절이 나오면..
		   catch절이 나오거나, finally절이 나오거나,  
		   아니면.. 둘다 나오거나 해야 함 
		3) 얘는 못이김 
		   System.exit(-1); //비정상종료
		   System.exit(0); //정상종료 

	      ex) day13/D.java
	
26. 내부 클래스 ( Inner Class <-> Outter Class )
     클래스안의 클래스 

	 (1) 객체 생성 방법 
	     1) 외클.내클 변수 = new 외클().new 내클();
         2) 외클.내클 변수 = new 외클.내클();
	       ex) day14/A.java 

	 (2) main 위치 
	     1) 제3클래스나 외부클래스에 있을 때는 동일하게 사용 가능  
		 2) static 내부클래스에서만 main을 정의할 수 있음 
		  ( 이유: static 내부클래스에서만 static 자원(멤버/메소드)을 정의할 있음 )  
		 3) static 내부클래스에서는 외부클래스의 static 자원만 접근 가능
           ex) day14/A.java

     (3) 쓰는 이유 
	     외부클래스의 자원(private 포함)을 '자기 것'처럼 사용하기 위해서   
	      ex) day14/B.java 

27. 쓰레드 ( Thread ) 
    프로세스를 구성하는 '제어의 흐름'

    (1) Process 와 Thread 
        1) Process : 프로그램 '실행 단위'
	    2) Thread : Process 를 구성하는 '작업 단위'

    (2) 장점 
	    쓰레드 '경량 프로세스'라고 불림 
		이유는 프로세스의 공통 Resource 를 공유하기 때문임

    (3) 생성법 
	    1) java.lang.Thread 상속법 
		2) java.lang.Runnable 상속법 
	   
	    ex) day14/C.java

    (4) 시작 
	    쓰레드객체.start();

    (5) 비유: '피고용인'( Emploee )

	    ex) day14/D.java 

	(6) LifeCycle 
	    1) 5가지 상태 
		2) 각 상태는 '메세드'나 '스케쥴러'나 '시간'에 의해 이동함 
		3) 한번 죽으면 살아나지 못함 

    (7) Priority 
	    1) Ready 상태의 쓰레드 중에서 
		   우선적으로 CPU를 점율할 수 있는 쓰레드를 판별하기 위한 LEVEL값 
		2) 범위 
		   1 ~ 10 
		3) 상수 
		   MAX_PRIORITY : 10 
		   MIN_PRIORITY : 1
		   NORM_PRIORITY : 5 
	       
		   ex) day14/E.java 

    (8) 동기화 
	    1) 비유 : 화장실의 문꼬리 

		2) 하나 이상의 쓰레드가 어떤 연산 or 로직에 동시에 접근했을 때, 
		   그 연산에 대한 값의 무결성을 보장하기 위해서 수행 영역에 대한 
		   lock을 걸어주는 것 

		3) 예 
		   static int i = 0; 
		   i++; 

		   # CPU의 연산 단계 # 
		   <1> 현재 i값을 읽음           i==0    i==0
		   <2> i값을 증가               i==0    i==0
		   <3> 증가된 i값을 i에 저장      i==1    i==1

		4) 방법
           1) synchronized void m(){
				 동기화가 필요한 로직;
			  }

		   2) synchronized(this){
				 동기화가 필요한 로직;
			  }

		    ex) day14/F.java 

28. IO ( Input Output )
   (1) 스트림( Stream ): '데이터의 흐름' 
       Data Source(근원지) --> Data Destination (목적지)

   (2) 스트림 특징 
       1) FIFO ( First In First Out )
	   2) 지연성 
	   3) 단방향성 
	   4) 유연성 

   (3) 표준입력 / 표준출력 
       키보드( System.in ) ---------> 모니터( System.out )

   (4) 구분 
       1) 전송단위 
	      <1> 바이트 스트림 ( 1 byte stream )
		      ex: XXXStream 

		  <2> 문자 스트림 ( 2 byte stream )
		      ex: XXXReader, XXXWriter 

	   2) 특성 
	      <1> 근본 스트림(node stream) 
		      
		  <2> 다리 스트림(bridge stream) 
		      InputStreamReader , OutputStreamWriter
		      
		  <3> 목적(==응용) 스트림(filter stream) 

		      ex) day15/A.java 

	   3) 입출력 
	      <1> 입력 스트림 
		      ex: XXXInputStream, XXXReader 
		  
		  <2> 출력 스트림 
		      ex: XXXOutputStream, XXXWriter 

		
   (5) 주요 스트림 클래스 
       1) InputStream / OutputStream 
	   2) Reader / Writer 
	   3) FileInputStream / FileOutputStream 
	   4) FileReader / FileWriter 
	   5) InputStreamReader / OutputStreamWriter 
	   6) BufferedInputStream / BufferedOutputStream 
	   7) BufferedReader / PrintWriter 
	   8) DataInputStream / DataOutputStream 
	   9) ByteArrayInputStream / ByteArrayOutputStream 
	   10) CharArrayReader  / CharArrayWriter 
	   11) ObjectInputStream / ObjectOutputStream 

	     ex) day15/C.java 

	cf) java.io.File => '디렉토리'와 '파일'을 모델링한 클래스 
	     ex) day15/D.java 

//////////////// 파이썬의 기본을 마치고 다시 올께~~ ////////////////// 