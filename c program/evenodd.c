//  even and odd
#include<stdio.h>
main()
{
	int num;
	printf("enter the number=\n");
	scanf("%d",&num);
	
		int digit=num%10;
	
		if(digit%2==0)
		{
			printf("%d\n num is even",num);
		}
		else
		{
			printf("%d num is odd",num);
		}
		}
	

