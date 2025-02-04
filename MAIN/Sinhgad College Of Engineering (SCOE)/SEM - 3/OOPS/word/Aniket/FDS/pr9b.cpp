#include<iostream>
#include<string.h>
#define MAX 50
using namespace std;
struct stack
{
	char data[MAX];
	int top;
};
void init(stack *stk)
{	
	int i;
    for(i=0;i<MAX;i++)
    {
        stk->data[i]='\0';
        stk->top=-1;
    }
}
int isfull(stack stk)
{
	return stk.top==MAX-1;
}
int isempty(stack stk)
{
	return stk.top==-1;
}
int push(stack *stk,char data[MAX])
{
	for(int i=0;data[i]!='\0';i++)
	{
		stk->top+=1;
		stk->data[stk->top]=data[i];
	}
}
void palin(stack *stk)
{
	char rev[MAX];
	int i=0;
	while(!isempty(*stk))
	{
		rev[i]=stk->data[stk->top];
		stk->top-=1;
		i++;
	}
	rev[i]='\0';
	cout<<"\n Original string is : "<<stk->data;
    cout<<"\n reverse string is : ";
    cout<<rev;
	if(strcmp(rev,stk->data))
	{
		cout<<"String is not palindrome";
	}
	else
	{
		cout<<"String is palindrome";
	}
}
int main()
{
	stack stk;
	char data[MAX];
	cout<<"Enter String : ";
	cin>>data;
	init(&stk);
	if(isfull(stk))
	{
		cout<<"\nStack is full";
	}
	else
	{
		push(&stk,data);
	}
	palin(&stk);
	return 0;
}
