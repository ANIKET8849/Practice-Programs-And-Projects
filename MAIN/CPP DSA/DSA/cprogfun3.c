#include<stdio.h>
#include<conio.h>

int getmax(int,int);
int main(){
	int a,b,result;
	printf("Enter Two Numbers : ");
	scanf("%d %d",&a,&b);
	result=getmax(a,b);
	printf("\nMaximum Is %d",result);
}
int getmax(int v1,int v2){
	if(v1>v2){
		return v1;
	}
	else{
		return v2;
	}
}