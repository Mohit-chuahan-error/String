package max;

interface AAA{
void m1();


}
class AA implements AAA{
void m2()
{
System.out.println("hello world");
}
public static void main(String[] args)
{
AAA a=new AA();
a.m1();
}
@Override
public void m1() {
	// TODO Auto-generated method stub
System.out.println("jhsd");	
}
}

