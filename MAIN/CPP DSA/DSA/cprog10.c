#include<stdio.h>
#include<conio.h>
#include<string.h>

int main(){
	char fname[50];
	char lname[50];
	char fullname[100];
	printf("\nEnter the First name : ");
	gets(fname);
	printf("\nEnter The Last Name : ");
	gets(lname);
	strcpy(fullname,fname);
	strcat(fullname," ");
	strcat(fullname,lname);
	printf("\n First Name Is : %s",fname);
	printf("\n Last Name Is : %s",lname);
	printf("\n Fullname Is : %s",fullname);
}
