#include<iostream>
#include<string.h>
#define MAX 50
using namespace std;
struct stack
{
	int data[MAX];
	int top;
};
void init(stack *stk)
{
	stk->top=-1;
}
int isfull(stack stk)
{
	return stk.top==MAX-1;
}
int isempty(stack stk)
{
	return stk.top==-1;
}
int push(stack *stk,char ele[MAX])
{
	int i=0;
	for(int i=0;ele[i]!='\0';i++)
	{
		stk->top+=1;
		stk->data[stk->top]=ele[i];
	}
}
int pop(stack *stk)
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
	cout<<"\nReverse string is : "<<rev;
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
	if(isempty(stk))
	{
		cout<<"\nStack is empty";
	}
	else
	{
		cout<<"\nOriginal string : "<<data;
		pop(&stk);
	}
	return 0;
}
