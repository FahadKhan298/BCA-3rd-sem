#include<stdio.h>
int main()
{
	int  num ,rev=0;
	printf ("enter the number");
	scanf("%d",&num);
	while(num!=0)
		{
		 int digit=num%10;
		rev=rev*10+digit;
		num/=10;
		
	}
		
	printf("numer=%d\n",rev);
	return 0;
}
