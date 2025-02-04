#include<stdio.h>
#include<conio.h>
#include<string.h>
 
int main(){
	char a[50],b[50];
	printf("Enter The Characters For First Array : ");
	gets(a);
	printf("Enter The Characters For Second Array : ");
	gets(b);
		if(strlen(a)==strlen(b)){
		printf("\nThe Length Of The Arrays Are Same ");
		}else{
			printf("\nThe Length Of Arrays Are Not Same ");
		}
		if(strcmp(a,b)==0){
				printf("\nBoth Strings Are Same Character Wise :");
			}
			else{
				printf("\nBoth Strings Are Not Same Characterwise");
			}
}