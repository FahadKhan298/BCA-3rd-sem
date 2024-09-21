#include<stdio.h>
#include<math.h>
 main()
{	char ch;
	int a,b;
	printf("enter the number=\n");
	scanf("%d %d",&a,&b);
	fflush(stdin);// used to clear the stdin stream/buffer
	printf("enter the character");
	scanf("%c=",&ch);
	switch (ch)
	{
		case'*':printf("mul=%d",a*b);
		         break;
		case'/':printf("div=%d",a/b);
		           break;
		case'+':printf("sum=%d",a+b);
		           break;
		case'%':printf("mod=%d",a%b);
		         break;
		case'^':printf("power=%d");
		         break;		            
		default:printf("no record found");
		           break;
		
			}
}
