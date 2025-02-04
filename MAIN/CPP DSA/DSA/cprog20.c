#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<stdlib.h>

int main(){
	int a,b,r,option;
	do{
		
		printf("\nCalculator");
		printf("\n\n1. Addition : ");
		printf("\n2. Substraction");
		printf("\n3.Multiplication");
		printf("\n4.Division");
		printf("\n5.Power");
		printf("\n6.Modulus");	
		printf("\n7.Exit");	
		printf("\nEnter The Option : ");	
		scanf("%d",&option);

		if(option!=7){
			printf("Enter Two Numbers : ");
			scanf("%d %d",&a,&b);
			switch(option){
				case 1 :
					r=a+b;
					printf("\nAddition Is : %d",r);
					break;

				case 2 :
					r=a-b;
					printf("\nSubtration Is : %d",r);
					break;

				case 3 :
					r=a*b;
					printf("\nMultiplication Is : %d",r);
					break;

				case 4 :
					r=a/b;
					printf("\nDivison Is : %d",r);
					break;

				case 5 :
					r=pow(a,b);
					printf("\nPower Is : %d",r);
					break;

				case 6 :
					r=a%b;
					printf("\nModulus Is : %d",r);
					break;
			}
		}
		else{
			exit(0);
		}
	}while(option!=7);
	return 0;
}