#include<stdio.h>
#include<conio.h>

int main(){
	int i,a,b=0;
	char list[100];
	printf("Enter The Items : ");
	gets(list);
	for(i=0; list[i]!='\0'; i++){
		if(list[i]==','){
			b++;
		}
	}
	printf("\nThe No Of Items Are : %d",b);
}