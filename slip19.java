
import java.io.*;
import java.util.*;
class slip19
{
   public static void main(String args[])throws Exception
   {
   DataInputStream d=new DataInputStream(System.in);
  TreeSet t=new TreeSet();
   System.out.println("Enter n");
  int n=Integer.parseInt(d.readLine());
System.out.println("Enter the elements");
    for(int i=1;i<=n;i++)
   {
      int a=Integer.parseInt(d.readLine());
  t.add(new Integer(a));
   }
System.out.println("the elements in sorted order");
   System.out.println(t);
System.out.println("Enter element to search from collection");
int z=Integer.parseInt(d.readLine());
 int p=Collections.binarySearch(t,z);
System.out.println("the element is found at"+p);
   }

}
