// neon number : a numer whose square sum is the nuumber itself
#include <stdio.h>
main()
{
	int num1, square,sum=0;
	printf("enter the number=");
	scanf("\n%d",&num1);
	square=num1*num1;
	printf("\n square of number=%d\n", square);
	while(square!=0)
	{
	
	int digit= square%10;
	sum+=digit;
	square=square/10;
}
if (sum==num1)
{
	printf("%d  is a neon numer",num1);
}
else if
{
	printf("%d  is not a neon number",num1);

}
}
	


