1. HW + OS + JVM + App1, App2 .... 
   - CUP: �γ� 
   - RAM(�޸�): å��
   - HDD/SSD: å���� 
   - MainBoard: �� 
   - Card(Graphic, Sound, Ran, ..)
   - ��ü/�ֺ����

2. JVM
   (1) JDK = jdk + jre 
   (2) ȯ�溯�� 
       - JAVA_HOME => C:\Program Files\Java\jdk-15
	   - Path => %JAVA_HOME%\bin
	   - classpath => .
   (3) API(Application Programming Interface)
       - �������� 

3. ���� ��Ŀ���� 
    - �ۼ�(.java) -> ������(javac.exe) -> ����(java.exe)
	              ex) javac A.java     ex) java A
	- .java(for Human) -> .class(for JVM)

4. Ŭ���� ���� 
   (1) ��Ű�� ����
   (2) ����Ʈ ���� 
   (3) Ŭ���� ���� {
	   (4)������� 
	   (5) ������
	   (6) �޼ҵ� 
   }

   cf) ��Ű�� ������/���� 
     #> javac -d . XX.java
	 #> java aa.bb.XX

   ex) day02/A.java

5. �ּ�( Comment )
   (1) 1���� 
       //
   (2) �������� 
       /*
	   */
   (3) ����ȭ�ּ� 
       /**
	   */
	   #>javadoc -d ./doc *.java
      
	ex) day02/B.java

6. ���� ���� 
    ex) day02/C.java

7. ��ü ���� ��� 
   (1) Ŭ����(Class): ��ü�� ����� Ʋ
        ex) �ؾƲ 
   (2) ��ü(Object): Ŭ������ ���� ������ ������ or ��� �� 
        ex) �ؾ  
   (3) ������(Constructor): ��ü�� ������ �� �ϴ� ��(���)
        ex) �ؾƲ()
   (4) �޼ҵ�(Method): ��ü�� �� �� �ִ� ��(���)
        ex) ��θ����Ѵ�()
   (5) �Ӽ�(Attribute == �������): ��ü�� Ư��  
           ( ��������: �پ��� ��ü�� ����� ���ؼ� )
        ex) String �Ӳ�;

    ex) day02/D.java

8. Ŭ���� ���� 
   �ؾ.java 

   /*
      �ϻ��� � ������ ����ؼ�.. 
      Ŭ���� ���踦 �ϰ� ���(�޼ҵ�/�Ӽ�)�Ͻÿ�
   */
       
9. ����(Variable) 
   (1) ��ȿ���� 
	   1) �������(==����)
	      <1> Ŭ�����Ҽ�
		  <2> ��ü�Ҽ�
		  ex) day03/A.java

	   2) �������� 
	      <1> �����ʱ�ȭ
		  <2> �Ķ���� (�Ű�==�ƱԸ�Ʈ)
          ex) day03/B.java
	      
   (2) ����( static ����) 
       1) Ŭ��������(static) == ���� == Ŭ���� == ����
	   2) ��ü����(no static) == ���� == ��ü == �ν��Ͻ�
	      ex) day03/A.java

   (3) ����( final ���� )  
       1) ��� ( Constance )
	   2) ���� ( Variable )
	      ex) day03/C.java 

   (4) �޸� ������
       1) �⺻��(���õ����� == ������Ƽ��) 8���� 
	      <1> call by value 
		  <2> ����: �ҹ��ڷ� ���� 
		  <3> ����
		      byte(1) �� short(2) �� int(4) �� long(8) �� float(4) �� double(8)  
			             char(2) �� 
				  
			  boolean(1) 
          <4> ���� �� �ִ� ���� ���� 
		      1> byte: -2^7 ~ 2^7-1 (����Ǽ�: 2^8)
			  2> short: -2^15 ~ 2^15-1 (����Ǽ�: 2^16)
			  3> char: 0 ~ 2^16-1 (����Ǽ�: 2^16)
			  4> int: -2^31 ~ 2^31-1 (����Ǽ�: 2^32)
			  5> long: -2^63 ~ 2^63-1 (����Ǽ�: 2^64)
			  6> float
			  7> double
			  8> boolean: false | true 

			  ex) day03/D.java, E.java(��̷�)
		
		  <5> ����ȯ(Type Casting)
		      1> �ڵ�(�Ͻ���/Implicit) by JVM 
			     -> ������ ���� Type �� ū Type 

			  2> ����(�����/Explicit) by ? 
			     -> 

			  ex) day03/F.java 

		  <6> ���� ����ȯ 
              -> ������Ÿ��(byte, short, char, int)������ ������ ����� int 
			  ex) day03/G.java 

		  <7> �ʱⰪ 
		      -> ����(0, 0L), �Ǽ�(0.0f, 0.0), �Ҹ�(false)
			  ex) day03/H.java 
		 
		  <8> ��������: ������ ȿ���� 

	   2) ������(���۷���)
	      <1> call by reference 
		  <2> ����: �빮�ڷ� ���� 
		  <3> ����: �⺻��(8����)�� ������ ��� Ÿ��( ���Ѵ� )
		  <4> �ʱⰪ: null
		  <5> ����ȯ 
		       Object 
			     ��
			   Human 
			     ��
			   Superman 


	cf) �迭����
	     -> �迭�� �����ϴ� ���� 
	     

10. ���� ( ����: �θ޶� )
    � ���α׷��� ����ǰ� ���� ��..
	��� �� ���������� CPU������ � Ư�� �ڵ�κ��� �����ϰ� ���� ���̴� 
	�� �ڵ�κ��� '������'�̶��Ϥ�, �� �������� ������ '����'�� �Ѵ� 
	��, ���α׷��� �����帧(Line)�� ����� �Ѵ� 

	  JVM -> main() -> ... -> main() -> JVM

	ex) day04/A.java 


11. ��� 
   (1) ���ǹ� 
       1) if(boolean��){} ��
	   2) if(boolean��){} else{} �� 
	   3) if(boolean��){}.. else if(boolean��){}.. else{} ��
       4) switch(������){ case: ... default: } �� 
	       => ������+String(jdk7~), break, default��ġ, case�� ���� ����
       
	   ex) day04/B.java, C.java, D.java 

   (2) �ݺ��� 
       -> �ʱ��(��), ���ǽ�(��), ������(��)�� ��� ���߾�� '���ѷ���'�� ���� ��
	   1) while(boolean��){} //�Ż�
	   2) do{} while(boolean��); //���� 
	   3) for(�ʱ��;���ǽ�;������){} //�Ż�

       ex) day05/A.java 

12. ������ �̵� 
   (1) continue
       1) �ݺ����ȿ����� ��� ���� 
	   2) (���ǿ� ������) '�ǳʶڴ�'

	    cf) labeled continue �� 

	   ex) day06/A.java 

   (2) break
       1) �ݺ����̳� ����ġ�� �ȿ����� ��� ���� 
	   2) �ڱ⸦ �ѷ��� ù��° ���� '������'

	    cf) labeled break �� 

	   ex) day06/B.java, C.java 

   (3) return 
       1) ��𿡼��� ��� ���� 
	   2) ȣ���� �� or ������ '�ǵ�����'

	   ex) day06/D.java, E.java 

13. ������( Operator )
   (1) (�����͵���) �����ϰ� �ϴ� '��ȣ'
   (2) ���� 
       1) ��� ex) +, -, *, /, % 
           cf) ������ �������̵� 
		    -> ���� ������ �� �ϳ��̻��� String Ÿ���̸� +�� ���տ����� 
	   2) ���� ex) ++, --
	   3) ���� ex) =
	   4) ������� ex) +=, -=, *=, /=, %=
	   5) ��Ʈ ex) &, |, ^, ~, ����Ʈ(<<,>>,>>>)
	   6) �� ex) ==, !=, <, >, <=, >=
	   7) �� ex) &, &&, |, ||
	   8) ������ ex) &=, |=
	   9) ���� ex) A? B:C
	   10) instanceof ex) ��ü instanceof Ŭ���� 

	   ex) day06/F.java 

14. �迭(Array)  ( ����: ����� )
   ���� Ÿ���� ������ '�����'�ν� ������ �� ũ�Ⱑ �����Ǵ� '��ü'
   (1) ���� 
       type �迭����[]; //ex) String items[];
   (2) ���� 
       �迭���� = new type[ũ��]; //ex) items = new String[4];
   (3) �ʱ�ȭ 
       �迭����[�ε���] = ������; //ex) items[0] = "��";

   (4) ���� �� ���� 
       type �迭����[] = new type[ũ��]; //ex) String items[] = new String[4];

   (5) ���� �� ���� �� �ʱ�ȭ
       type �迭����[] = {������1, ������2, ...};
       //ex) String items[] = {"��", "����", "����", "�ܿ�"}; 

	   ex) day06/G.java 

   (6) �迭�� default �� 
       - byte, short, char, int: 0
	   - long: 0L
	   - float: 0.0f
	   - double: 0.0
	   - boolean: false
	   - ������: null

	   ex) day06/H.java

   (7) ����ȯ 
       ����ȯ�� ������ �����Ͷ�� ����ȯ�Ǿ����� �Է� �� 
	   //ex) int is[] = {b, s, c, i, (int)f};
       ex) day06/I.java

   (8) ������ 
       ������ �迭�� �����ͷ� ���� �迭 
       ex) day07/A.java 

   (9) N���� 
       (N-1)������ �迭�� �����ͷ� ���� �迭 
       ex) day07/A.java 
	   

15. �÷���(Collection)�迭 ( �����迭 == �ڷᱸ��(Data Structure) )	 
    ���� Ÿ���� '������'������ '�����'�ν� �� ũ�Ⱑ ���� �� �ִ� '��ü'

	(1) ����
	    1)        java.util.Collection 
		             |            | 
			 java.util.List    java.util.Set 
			        |               | 
			     .....            .....

	    2)        java.util.Map 
		               | 
				 java.util.Hashtable, ....  

			
	(2) Ư¡ 
		1) List
		    - �ߺ��� ���
			- ������ ����
		       ex) day07/B.java
			   
		2) Set ( ����: ���� ) 
		    - �ߺ��� ��� X
		    - ������ ���� X
			   ex) day07/C.java 

		3) Map ( ����: 1:1 �Լ� )
		    - �ѽ����� ����(key�� value)
		    - ������ ���� X
			- key�� �ߺ����X, value�� �ߺ����O
			   ex) day07/C.java


   cf) AutoBoxing: ( �⺻�� -> Wrapper class ) 
       
16. OOP ( Object Oriented Programming ) Ư�� 
   (1) ��Ӽ�( Inheritance )
       �θ��� '��� ��'�� �ڽĿ��� '��ӹ޴� ��'(=='����� �� �ִ� ��')
	     
	   - �ٸ� �����ڰ� �ϳ��� ���� ��쿡�� JVM�� �⺻������(default constructor)�� ����� �� 
	   - �ڽ� ��ü�� �����Ƿ��� ���� �θ�ü�� �����Ǿ�� �� 
	   - ��� �������� ù���ο��� super();�� �����Ǿ� ���� ( ��, �ٸ� super(..)�ִٸ� ���� )
	   - ��� ��ü�� Object �ڽ� (������ ���)
	   - �ڽ� �޼ҵ忡�� �θ� �޼ҵ��� ������ �ٲ� �� ���� ( Overriding )
	   - ����ȯ�� '��Ӱ���'������ ���� 
	      - �ڵ�
		  - ���� 
	    ex) day08/A.java 

   (2) ������( Polymorphism )
        ���� Ÿ�� ��ü�� '������ �޼ҵ尡 �ٸ� ���� �ϴ� ��' 
        ex) day08/B.java 

   (3) (�Ӽ�����)���м�( Information Hiding )
        �Ӽ���(������)�� �ܺ� ��ü�κ��� '����� ��'
        ex) day08/C.java 

   (4) (�޼ҵ���)ĸ��ȭ( Encapsulation )
        - �Ӽ�(������)�� �޼��带 �ϳ��� ���� �ܺο� ���߱⵵�ϰ� ���̰Ե� �ϴ� ��
        - �޼ҵ��� ����(����Ÿ��,�̸�,�Ķ����)�� �˸� �� ������ ���� ȣ���ؼ� ����� �� �ִ� �� 
		ex) day08/C.java, D.java 

17. (�޼ҵ�)�������̵�( Overriding ) 
   (1) '��Ӱ���'���� �θ��� �޼ҵ��� ��(����)�� �ڽĿ��� '�ٲٴ� ��'  
 
   (2) ���� 
       1) �޼ҵ� �̸��� ���ƾ� �� 
	   2) ��ȯŸ���� ��ġ�ؾ� �� 
	   3) �����ڴ� �Ұ�
	   4) �Ķ������ Ÿ�԰� ������ ������ ��� ��ġ 
	   5) �ڽĸ޼ҵ��� ���������ڰ� �θ�޼ҵ��� ���������ں��� ���ų� �о�� ��  

	   ex) day09/A.java 

18. �����ε�( Overloading ) 
    (1) ����: ������, ���ͳ�, å 
	    - ������(å:ȥ����): Ŭ�������� ���� �̸��� �޼ҵ带 ������ �����ϴ� �� 
		- �Ǽ�ȯ(å:������): �� Ŭ���������� ���� �̸��� �޼ҵ带 ������ �����ϴ� �� 
		- �ڿ���(��): 
		   - ��ġ ��Ḧ �غ��ؼ� ���ϴ� ���� 
		   - �޼ҵ�� �����ڸ� ���� �̸����� ���ݾ� 
		     �ٸ� ����̳� ������ �޾� ���� �� ���߿� ����� �� �ְ� �غ��صδ� ��
	    - ����(��): ���� Ŭ���������� ���� �̸� �޼ҵ带 ����ϴ� �� 
		- ����(��): �����ڳ� ���� ����� ���� �޼ҵ带 �Ķ���ͷ� ������ ����� �� 

		- ����(��): ( ȣ��� �� ���¿� ���εǼ� ȣ��ǵ��� )  
		       �Ķ������ ������ ������ ������ �ٸ� '���� �̸��� �޼ҵ峪 �����ڸ� ������ �����ϴ� ��' 
	(2) ���� 
	    1) ������ 
		2) �޼ҵ� 

    (3) Ư¡ 
	    1) ��ȯŸ�԰� ���� ���� 
		2) ��Ӱ����� �ٸ� Ŭ���������� �����ε� ���� 
		3) ����ȯ�� ������ �Ķ���Ͷ� �����ε����� ���� 
	    
       ex) day09/B.java 

19. this �� super
   (1) this 
       1) ����: �ڽ��� '��ü' �Ǵ� '������'�� �ǹ��ϴ� ���� 

	   2) ��뿹 
	      <1> ���������� �̸��� ���� ��������� �ش� �������� ������ �� 
		  <2> �ڽ��� �����ڸ� ȣ���� �� 
		  <3> �ڽ��� ��ü�� �ٸ� Ŭ�������� �ѱ� �� 

		   ex) day09/C.java 

   (2) super 
       1) ����: �θ��� '��ü' �Ǵ� '������'�� �ǹ��ϴ� ���� 

       2) ��뿹
	      <1> �θ��� �����ڸ� ȣ���� �� 
		  <2> �̸��� ���� �θ��� ����� �ڽĿ��� ������ �� 
		  <3> �������̵��Ǳ� ���� �θ�޼ҵ带 �ڽĿ��� ȣ���� ��

		    ex) day09/D.java 

20. ������( Modifier )
    Ŭ����, �������̽�, ����, ������, �޼ҵ� �տ� �پ �� ����� '����'�ϴ� ����� 
   (1) ����������( Access Modifier )
       1) ���� 
	     <1> public: ������ ����
		 <2> protected: ���� ����Ű �� or ��Ӱ����� �θ��ڿ� 
		 <3> default ( package == friendly ): ���� ����Ű �� 
		 <4> private: �ڽ��� Ŭ���� ��  

	   2) Ư¡ 
	     <1> Ŭ������ �������̽� ���� ���������ڴ� public �� default �� ���� 
		 <2> public Ŭ������ �����̸��� �̸��� ���ƾ� �� 

	   3) ���� 
	     - ���� ����: public > protected > default > private
		 - ���� ����: public < protected < default < private

         ex) day10/A.java


   (2) ����������( static )
        ������ Ŭ���� ����, �Ⱥ����� ��ü ���� 

       1) ����� �޼ҵ忡�� ���� �� ���� 
	   2) static �޼ҵ忡���� �ڿ����ٽ� �ڽ��� Ŭ������ ���� ���� 
	   3) �ڿ� ���ٽ� Ŭ���� �̸����� ���� 
	   4) static �ڿ��� �޸𸮿� 1�� �����Ǿ�, �ش� Ŭ������ ��� ��ü���� ������

	    ex) day10/B.java , C.java 

   (3) ����������( final ) 
       ������ ������ ���ϰ� �� 

       1) Ŭ����, ����, �޼ҵ� �տ� ���� �� ����
	   2) Ŭ������ ������ �ڽ��� '������', ������ ������ �ʱⰪ�� '���ٲٰ�', 
	      �޼ҵ忡 ������ '�������̵��� ���ϰ� ��'
	   3) ������������ ���� �� ����
	   
	     ex) day10/D.java 

   (4) �߻�������( abstract )
       ������ �߻�ȭ(��)�� �� 

	   1) Ŭ������ �޼ҵ� �տ����� ���� �� ���� 
	   2) �ϳ� �̻��� '�߻�޼ҵ�'�� ������ �־, �� Ŭ������ '�߻�Ŭ����'�� �Ǿ�� �� 
	   3) �߻�Ŭ������ ��ü�� �Ϻ��� �ڽ�Ŭ������ ����, �� ��ü�� '����ȯ'�Ͽ� ������

	    cf) �߻�Ŭ����: abstract �� ���� Ŭ���� 
		    �߻�޼ҵ�: abstract �� ���� �޼ҵ� 

	     ex) day10/E.java

    (5) ��Ÿ ������ 
	   synchronized ( ������ ), transient ( ���� ), native ( OS �ڿ� )

21. �ĺ���( Identifier )
    '���α׷��Ӱ� ���Ƿ�' �����ϴ� ��Ű��, Ŭ����, ����, �޼ҵ� '�̸�'
	(1) ��Ģ 
	    1) ���ڰ� �� �տ� ���� �� ����
		2) Ư������ _�� $�� ���� ( �� �տ� ���͵� �� )
		3) ������ ������ ����

       ex) day10/F.java 

	(2) ���� 
	    1) Ŭ������ �������̽� �̸��� ù���ڸ� �빮�ڷ� ���� 
		2) ����� ��ü ���ڸ� �빮��
		3) ��Ű��, ����, �޼ҵ� �̸��� ù���ڴ� �ҹ��ڷ� ���� 
		4) 2�� �̻��� �ܾ� ������ ���� �ܾ��� ù���ڸ� '�빮��'�� �ϰų� '_'�� ó�� 
		5) _�� $�� ������ 
		6) �ǹ��ִ� �ܾ�� ������ 

22. ��Ű��( Package )
    ����� ������ '���'�̳� '����'�� ���� Ŭ������ �������̽����� ���� 

	(1) ���� 
	    Ŭ���� �ֻ�ܿ� package ��� ���� ��� 
		 ( ex: package soo.aa.bb; )

    (2) ������ 
	    #> javac -d . XXX.java //�����(���� ���丮)
		#> javac -d ./classes XXX.java //�����(���� ���丮)
		#> javac -d ../ A.java //�����(���� ���丮)
		#> javac -d C:\SOO A.java //������ 

		ex) day11/A.java 
   
    (3) ���� 
	    #>java soo.aa.bb.A //��Ű�� �ֻ�� ���丮�� �̵� �� ���� 

    (4) ���� 
	    #>jar -cvf p.jar soo

		ex) day11/AUser.java 

    (5) classpath ( *** )
	    1) -classpath �� ( ��ȿ����: javac.exe, java.exe )
		   <1> ���丮
		      #>javac -classpath C:\SOO\Java\day11\classes AUser.java 
			  #>java -classpath .;C:\SOO\Java\day11\classes AUser

           <2> jar 
		      #>javac -classpath C:\SOO\Java\day11\jar\p.jar AUser.java 
			  #>java -classpath .;C:\SOO\Java\day11\jar\p.jar AUser

		2) set classpath �� ( ��ȿ����: cmd )
		   <1> ���丮 
		      #>set classpath=%classpath%;C:\SOO\Java\day11\classes
			  #>javac AUser.java
			  #>java AUser

           <2> jar 
		      #>set classpath=%classpath%;C:\SOO\Java\day11\jar\p.jar
			  #>javac AUser.java
			  #>java AUser

		3) ȯ�溯�� �� ( ��ȿ����: OS ) 
		   <1> ���丮
		        .;C:\SOO\Java\day11\classes
			  
           <2> jar
		        .;C:\SOO\Java\day11\jar\p.jar

			cf1) build path ( in elipse )
			cf2) javadoc -d ./doc *.java
		

23. �������̽�( interface ) 
   - JDK7����: '���'�� '�߻�޼ҵ�'�� ������ '������'
   - JDK8�̻�: '���'�� '�߻�޼ҵ�'�� 'static�޼ҵ�'�� 'default�޼ҵ�'�� ������ '������'

   (1) ���� 
       1) interface �տ��� abstract ���� �� 
	   2) ��������տ��� public static final ���� ��
	   3) �޼ҵ�տ��� public abstract ���� �� 
	   4) static �޼ҵ忡�� public ���� �� 
	   5) default �޼ҵ忡�� public ���� �� 

	    ex) day12/A.java, AChild.java, AUser.java 
		
   (2) Ư¡ 
       1) ��ü�� �Ϻ��� �ڽ� Ŭ������ ���� �� ��ü ���� �� ����ȯ�ؼ� ����
       2) interface �� static �޼ҵ�� �������̽� �̸����θ� ���� ���� 
       3) �ڽ�Ŭ������ ���鶧���� implements ��� 
	      ( ���߻�Ӱ��� : class BChild implements B1, B2, ... )
	      ex) day12/B.java 
       4) �������̽� ������ ����� extends ���  
	      ( ���߻�Ӱ��� : interface B3 extends B1, B2, ... )
	   5) �Ϲ����� �ڽ�Ŭ������ ���� 
	      class Superman extends Human implements B1, B2, ... 

24. �߻�Ŭ������ �������̽� ������ 
    (1) ������ 
	    - �߻�޼ҵ带 ���� �� ���� 
		- �Ϻ��� �ڽİ�ü�� �����ؼ� ����ȯ 

	(2) ������ 
	    - Ŭ�����̰� �������̽� �ٺ� Ư��
		- �߻�Ŭ������ �Ϲݸ޼ҵ�� �Ϲݸ�������� �����ڸ� ���� �� ����

25. ���� ó��
    (1) ����( Exception )
	    ���α׷��� ���������� ������� ���ϰ� �ϴ� '���� ��Ȳ'

		ex) ���ڰ� �ƴ� ������ ���ڸ� ���ڷ� �ٲٷ��� �� 
		    ä���ϳ��� ������ �������� ��� 
			�¶��� �����ϰ� �ִ� �� 
			   - ���Ӽ����� �ٿ�� ���
			   - �������̺��� ���� 
			   - ������ �ļ� ���� ���� ���� 

	(2) ����ó������ 
	    ���α׷� ����� �߻��� �� �ִ� '���߻�Ȳ'�� ���ܷ� '�̸� ���س���', 
		�ش��ϴ� ���ܰ� �߻����� ��� ������ ��ġ�� ���ؼ�, 
		���α׷��� '���������� �۵�'�ϵ��� �ϴ� �� 

    (3) ������ 
	                      Object 
						     | 
						  Throwable 
						  |       | 
				        Error   Exception 
						        |       | 
				    CompileException  RuntimeException 
					CheckedException

				
		ex) day13/A.java
			                 
    (4) Ư¡
	    1) throw �� ���ܸ� �߻���Ŵ 
		2) throws �� ���ܹ߻����ɼ��� ǥ���� �� ���� ( == ���ѱ� �� ���� )
		3) try catch �� ���� �� ���� ( == ���������� ���� ���� )
		4) '������'�� '�޼ҵ�'������ �߻��� �� ���� 
		5) ���� Exception ���ε� ó���� ����

    (5) ó�����( ***** ) 
	    1) ���� ��� �� 
            try{
				���ܹ߻�����(������ or �޼ҵ�)
		    }catch(����Ÿ�� ���ܰ�ü){
				ó�� ���� 
			}

		2) ���ѱ�� �� 
		    throws ����Ÿ�� 

	(6) try���ȿ� 2�� �̻��� ���� �߻�
	    1) ���ܵ��� ��Ӱ���O
           [��������O] �������ܺ��� ��� �� 
		   catch(MyException me)
		   catch(Exception e)

		2) ��Ӱ���X
		   [��������X] �ƹ����ܳ� ���� ����ָ� �� 
		   catch(MyException me)
		   catch(YourException ye)

		   ex) day13/B.java
	
    (7) 2�̻��� ���ܸ� ���ѱ� �� 
	    (ex: throws MyException, YourException, ... )
           ex) day13/C.java

	(8) finally��
	    1) �׻� ����Ǵ� �� 
		   ( ������.. return �� �������� �����ϰ� ���� �� )
		2) try���� ������..
		   catch���� �����ų�, finally���� �����ų�,  
		   �ƴϸ�.. �Ѵ� �����ų� �ؾ� �� 
		3) ��� ���̱� 
		   System.exit(-1); //����������
		   System.exit(0); //�������� 

	      ex) day13/D.java
	
26. ���� Ŭ���� ( Inner Class <-> Outter Class )
     Ŭ�������� Ŭ���� 

	 (1) ��ü ���� ��� 
	     1) ��Ŭ.��Ŭ ���� = new ��Ŭ().new ��Ŭ();
         2) ��Ŭ.��Ŭ ���� = new ��Ŭ.��Ŭ();
	       ex) day14/A.java 

	 (2) main ��ġ 
	     1) ��3Ŭ������ �ܺ�Ŭ������ ���� ���� �����ϰ� ��� ����  
		 2) static ����Ŭ���������� main�� ������ �� ���� 
		  ( ����: static ����Ŭ���������� static �ڿ�(���/�޼ҵ�)�� ������ ���� )  
		 3) static ����Ŭ���������� �ܺ�Ŭ������ static �ڿ��� ���� ����
           ex) day14/A.java

     (3) ���� ���� 
	     �ܺ�Ŭ������ �ڿ�(private ����)�� '�ڱ� ��'ó�� ����ϱ� ���ؼ�   
	      ex) day14/B.java 

27. ������ ( Thread ) 
    ���μ����� �����ϴ� '������ �帧'

    (1) Process �� Thread 
        1) Process : ���α׷� '���� ����'
	    2) Thread : Process �� �����ϴ� '�۾� ����'

    (2) ���� 
	    ������ '�淮 ���μ���'��� �Ҹ� 
		������ ���μ����� ���� Resource �� �����ϱ� ������

    (3) ������ 
	    1) java.lang.Thread ��ӹ� 
		2) java.lang.Runnable ��ӹ� 
	   
	    ex) day14/C.java

    (4) ���� 
	    �����尴ü.start();

    (5) ����: '�ǰ����'( Emploee )

	    ex) day14/D.java 

	(6) LifeCycle 
	    1) 5���� ���� 
		2) �� ���´� '�޼���'�� '�����췯'�� '�ð�'�� ���� �̵��� 
		3) �ѹ� ������ ��Ƴ��� ���� 

    (7) Priority 
	    1) Ready ������ ������ �߿��� 
		   �켱������ CPU�� ������ �� �ִ� �����带 �Ǻ��ϱ� ���� LEVEL�� 
		2) ���� 
		   1 ~ 10 
		3) ��� 
		   MAX_PRIORITY : 10 
		   MIN_PRIORITY : 1
		   NORM_PRIORITY : 5 
	       
		   ex) day14/E.java 

    (8) ����ȭ 
	    1) ���� : ȭ����� ������ 

		2) �ϳ� �̻��� �����尡 � ���� or ������ ���ÿ� �������� ��, 
		   �� ���꿡 ���� ���� ���Ἲ�� �����ϱ� ���ؼ� ���� ������ ���� 
		   lock�� �ɾ��ִ� �� 

		3) �� 
		   static int i = 0; 
		   i++; 

		   # CPU�� ���� �ܰ� # 
		   <1> ���� i���� ����           i==0    i==0
		   <2> i���� ����               i==0    i==0
		   <3> ������ i���� i�� ����      i==1    i==1

		4) ���
           1) synchronized void m(){
				 ����ȭ�� �ʿ��� ����;
			  }

		   2) synchronized(this){
				 ����ȭ�� �ʿ��� ����;
			  }

		    ex) day14/F.java 

28. IO ( Input Output )
   (1) ��Ʈ��( Stream ): '�������� �帧' 
       Data Source(�ٿ���) --> Data Destination (������)

   (2) ��Ʈ�� Ư¡ 
       1) FIFO ( First In First Out )
	   2) ������ 
	   3) �ܹ��⼺ 
	   4) ������ 

   (3) ǥ���Է� / ǥ����� 
       Ű����( System.in ) ---------> �����( System.out )

   (4) ���� 
       1) ���۴��� 
	      <1> ����Ʈ ��Ʈ�� ( 1 byte stream )
		      ex: XXXStream 

		  <2> ���� ��Ʈ�� ( 2 byte stream )
		      ex: XXXReader, XXXWriter 

	   2) Ư�� 
	      <1> �ٺ� ��Ʈ��(node stream) 
		      
		  <2> �ٸ� ��Ʈ��(bridge stream) 
		      InputStreamReader , OutputStreamWriter
		      
		  <3> ����(==����) ��Ʈ��(filter stream) 

		      ex) day15/A.java 

	   3) ����� 
	      <1> �Է� ��Ʈ�� 
		      ex: XXXInputStream, XXXReader 
		  
		  <2> ��� ��Ʈ�� 
		      ex: XXXOutputStream, XXXWriter 

		
   (5) �ֿ� ��Ʈ�� Ŭ���� 
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

	cf) java.io.File => '���丮'�� '����'�� �𵨸��� Ŭ���� 
	     ex) day15/D.java 

//////////////// ���̽��� �⺻�� ��ġ�� �ٽ� �ò�~~ ////////////////// 