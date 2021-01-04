class D 
{
	void m1(){
        for(int j=0; j<4; j++){
			for(int i=0; i<4; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
    void m2(){
	}
	void m3(){
	}
	void m4(){
	}
	void m5(){
	}
	public static void main(String[] args) 
	{
		D d = new D();
		d.m1();
	}
}
/* ¹Ì¼Ç 

*
* *
* * *
* * * *

      *
    * *
  * * *
* * * *

* * * *
* * *
* *
*

* * * *
  * * *
    * *
      *

*/

