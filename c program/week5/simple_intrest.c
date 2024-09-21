#include<stdio.h>
#include<math.h>
main()
{
	double simple_intrest,compound_intrest;
	int rate,time,principle;
	printf("Enter the principle=\n");
	scanf("%d",&principle);
	printf("Enter the time(in years)=\n");
	scanf("%d",&time);
	printf("Enter the rate(in%)=\n");
	scanf("%d",&rate);
	simple_intrest=(principle*rate*time)*0.01;
	printf("Simple intrest=%f",simple_intrest);
	compound_intrest=p*(pow((1+rate*0.01),time)-1);
	printf("compound intrest=%f",compound_intrest);
}
