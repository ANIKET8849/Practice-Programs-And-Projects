#include<stdio.h>
#include<conio.h>

void calculate_area(int);

int main(){
	int v;
	printf("\nEnter The Radius : ");
	scanf("%d",&v);
	calculate_area(v);
}

void calculate_area(int r){
	float a;
	a=3.14*r*r;
	printf("\nThe Area of Radius Is : %f",a);
}