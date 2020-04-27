import java.util.*;
class strongnumber
{
   public static void main(String[] args)
   {
    Scanner ip=new Scanner(System.in);
   	int a=ip.nextInt();
   	int a1=a;
   	int sum=0;
   	int l=1;
   	while(a>0)
   	{
       int b=a%10;
       if(b==0)
       {
       	  l=1;
       	  sum=sum+l;
       }
       else
       {
       	 for(int i=1;i<=b;i++)
       	  {
       	  	  l=l*i;
       	  }
       	  sum=sum+l;  
       }  
       	  l=1;
          a=a/10;
   	}
   	if(a1==sum) System.out.println("Strong Number");
   	else System.out.println("Not Strong Number");
   }
}