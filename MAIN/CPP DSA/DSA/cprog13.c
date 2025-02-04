#include<stdio.h>
#include<conio.h>
 
int main(){
	char a[50],b[50];
	int i,j,t=0;
	printf("Enter The Characters For First Array : ");
	gets(a);
	printf("Enter The Characters For Second Array : ");
	gets(b);
	for(i=0; a[i]!=0; i++){
		
	}
	for(j=0; b[j]!=0; j++){
		
	}
	if(i==j){
		printf("\nThe Length Of The Arrays Are Same ");
		for(i=0; a[i]!='\0'; i++){
			if(a[i]!=b[i]){
				t=1;
				break;
			}
                   }
			if(t==0){
				printf("\nBoth Strings Are Same Character Wise :");
			}
			else{
				printf("\nBoth Strings Are Not Same Characterwise");
			}
		
	}
	else{
		printf("\nThe Length Of Arrays Are Not Same ");
	}
	
}