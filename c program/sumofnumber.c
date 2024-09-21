#include<stdio.h>
main()
{
	int num,digit, sum=0;
	printf("enter the number\n");
	scanf("%d",&num);
	while(num!=0)
	{
		digit=num%10;
		sum+=digit;
		num=num/10;
	}
	
	printf("sum=%d",sum);
}

