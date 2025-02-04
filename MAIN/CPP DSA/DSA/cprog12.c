#include<stdio.h>
#include<conio.h>
int main(){
	int a[5],b[5],i,t=0;
	for(i=0; i<5; i++){
		printf("Enter The Number For First Array : ");
		scanf("%d",&a[i]);
	}
	for(i=0; i<5; i++){
		printf("Enter The Number For Second Array : ");
		scanf("%d",&b[i]);
	}
	for(i=0; i<5; i++){
		if(a[i]!=b[i]){
			t=1;
			break;
		}
	}
	if(t==0){
		printf("The Array Is Same ");
	}
	else{
		printf("The Arrays Are Not Same ");

	}
}