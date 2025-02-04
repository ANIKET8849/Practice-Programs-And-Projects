#include<stdio.h>
#include<conio.h>
#include<string.h>

int main(){
	int len;
	char s[100];
	printf("Enter The String : ");
	gets(s);
	len=strlen(s);
	printf("The String Length Is :  %d",len);
}