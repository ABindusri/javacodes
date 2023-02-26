class Example 
{
synchronized void show()
{
try
{
for(int i=1;i<=5;i++)
{
Thread.sleep(1000);
System.out.println(Thread.currentThread().getName()+":"+i);
}
}catch(Exception e){}
}
}
class T extends Thread
{
Example e;
T(Example e)
{
this.e = e;
}
public void run()
{
e.show();
}
}
class Tsync1
{
public static void main(String args[])
{
Example ex = new Example();
T t1 = new T(ex);
T t2 = new T(ex);
T t3 = new T(ex);
t1.start();
t2.start();
t3.start();
}
}

