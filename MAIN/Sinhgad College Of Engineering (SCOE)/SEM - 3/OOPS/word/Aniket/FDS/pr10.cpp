#include<iostream>
#define MAX 50
using namespace std;
int s[MAX];
int top=-1;
void push(char ele)
{
	s[++top]=ele;
}
char pop()
{
	return(s[top--]);
}
int pr(char ele)
{
	switch(ele)
	{
		case '#' : return 0;
		case '(' : return 1;
		case '+' : 
		case '-' : return 2;
		case '*' :
		case '/' : return 3;
	}
}
int main()
{
	char postfx[50],infx[50],ch,ele;
	int i=0,k=0;
	cout<<"Enter Infix Expression : ";
	cin>>infx;
	push('#');
	while((ch=infx[i++])!='\0')
	{
		if(ch=='(')
		{
			push(ch);
		}
		else if(isalnum(ch))
		{
			postfx[k++]=ch;
		}
		else if(ch==')')
		{
			while(s[top]!='(')
			{
				postfx[k++]=pop();
			}
			ele=pop();
		}
		else
		{
			while(pr(s[top])>=pr(ch))
			{
				postfx[k++]=pop();
			}
			push(ch);
		}
	}
	while(s[top]!='#')
	{
		postfx[k++]=pop();
	}
	postfx[k]='\0';
	
	cout<<"\nPostfix expression is : "<<postfx;
	return 0;
}
