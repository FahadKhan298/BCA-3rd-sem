# include<stdio.h>
main()
{
	char ch;
	printf("enter character of week\n");
	scanf("%c",&ch);
	switch (ch)
	{
		case 's': printf("sunday");
		 break;
		 	case 'm': printf("monday");
		 break;
		 	case 'a': printf("tuesday");
		 break;
		 	case 'w': printf("wednday");
		 break;
		 	case 't': printf("thrusday");
		 break;
		 	case 'f': printf("friday");
		 break;
		  default: printf("invalid input");
		  break;
	}
}
