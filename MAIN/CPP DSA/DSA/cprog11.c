#include<stdio.h>
#include<conio.h>
#include<string.h>

int main(){
	char fname[50];
	char lname[50];
	char fullname[100];
	int i,j;
	printf("\nEnter the First name : ");
	gets(fname);
	printf("\nEnter The Last Name : ");
	gets(lname);
	for(i=0; fname[i]!=0; i++){
		fullname[i]=fname[i];
	}
	fullname[i]=' ';
	i++;
	for(j=0; lname[j]!=0; j++, i++){
		fullname[i]=lname[j];
	}
	fullname[i]='\0';
	printf("\n First Name Is : %s",fname);
	printf("\n Last Name Is : %s",lname);
	printf("\n Fullname Is : %s",fullname);
}
