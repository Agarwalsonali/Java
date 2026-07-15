// q-1(A)
class Mythread extends Thread
{
	public void run(){
		for(int i=0;i<1000;i++)
			System.out.println("From the mythread class.");
	}
}
class test_thread
{
	public static void main(String ar[]){
		Mythread t1=new Mythread();
		t1.start();
		for(int i=0;i<1000;i++)
			System.out.println("From the main class");
	}
}
