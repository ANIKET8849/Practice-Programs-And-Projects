#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<stdlib.h>

void add(int,int);
void sub(int,int);
void mul(int,int);
void divion(int,int);
void powr(int,int);
void mod(int,int);
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
					add(a,b);
					break;

				case 2 :
					sub(a,b);
					break;

				case 3 :
					mul(a,b);
					break;

				case 4 :
					divion(a,b);
					break;

				case 5 :
					powr(a,b);
					break;

				case 6 :
					mod(a,b);
					break;
			}
		}
		else{
			exit(0);
		}
	}while(option!=7);
	return 0;
}
void add(int x,int y){
	int r;
	r=x+y;
	printf("\nAddition Is : %d",r);
}
void sub(int x,int y){
	int r;
	r=x-y;
	printf("\nSubtration Is : %d",r);
}
void mul(int x,int y){
	int r;
	r=x*y;
	printf("\nMultiplication Is : %d",r);
}
void divion(int x,int y){
	int r;
	r=x/y;
	printf("\nDivison Is : %d",r);
}
void powr(int x,int y){
	int r;
	r=pow(x,y);
	printf("\nPower Is : %d",r);
}
void mod(int x,int y){
	int r;
	r=x%y;
	printf("\nModulus Is : %d",r);
}