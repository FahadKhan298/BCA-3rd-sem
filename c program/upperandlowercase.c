#include <stdio.h>
main()
{
	char ch;
	printf("enter the character=\n");
	scanf("%c",&ch);
	if(ch>='A' && ch<='Z')
	{
		printf("Uppercase=%c ",ch);
	}
	else
	{
		printf("Lowercase=%c",ch);
	}
}
