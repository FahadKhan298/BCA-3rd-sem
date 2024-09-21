#include<stdio.h>
int main()
{
	int num,i,sum=0;// loop initilization should be done here
	printf("enter the number\n");
	scanf("%d",&num);
	
	

	for( i=1; i<=num; i++)
	{
		printf("%d\n",i);
		sum+=i;
		
	}
	printf("sum=%d\n",sum);
	return 0;
}
