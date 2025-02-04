#include<stdio.h>
#include<conio.h>

int main(){
	int n,b=1,s=1,r=1,n1,d;
	printf("Enter The nth Number :");
	scanf("%d",&n);
	n1=n;
		while(n>0){
			d=n%10;
			n=n/10;
			while(b<=d){
				s=b*s;
				b++;
			}
			r=r+s;
		
		}
			if(r==n1){
				printf(" %d The Number Is Strong number",r);
			}else{
				printf(" %d The Number Is Not Strong number",r);
			}
	

}