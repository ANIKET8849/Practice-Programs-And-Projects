#include<iostream>
#include<string.h>
#define size 10
using namespace std;
class jobqueue
{
	private:
		struct queue
		{
			int que[size];
			int front,rear;
		}Q;
	
	public:
		jobqueue();
		int push(int);
		int pop();
		void display();
		int isfull();
		int isempty();
};
jobqueue::jobqueue()
{
	Q.rear=-1;
	Q.front=-1;
}
int jobqueue::isfull()
{
	if(Q.rear>=size-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
int jobqueue::isempty()
{
	if(Q.front==-1||Q.front>Q.rear)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
int jobqueue::push(int p)
{
	if(Q.front==-1)
	{
		Q.front++;
	}
	Q.que[++Q.rear]=p;
	return Q.rear;
}
int jobqueue::pop()
{
	int ele;
	ele=Q.que[Q.front];
	Q.front++;
	cout<<"Deleted job is : "<<ele;
	return Q.front;
}
void jobqueue::display()
{
	cout<<"Job queue is : ";
	for(int i=Q.front;i<=Q.rear;i++)
	{
		cout<<Q.que[i]<<"  ";
	}
}
int main()
{
	jobqueue obj;
	int ch,data;
	char c;
	do
	{
		cout<<"***JOB SCHEDULING***";
		cout<<"\n1. Add job";
		cout<<"\n2. Delete Job";
		cout<<"\n3. Display Job";
		cout<<"\nEnter your choice : ";
		cin>>ch;
		switch(ch)
		{
			case 1: 
				if(obj.isfull())
				{
					cout<<"\nQueue is full";
				}
				else
				{
					cout<<"Enter job number : ";
					cin>>data;
					obj.push(data);
				}
				break;
			case 2:
				if(obj.isempty())
				{
					cout<<"\nQueue is empty";
				}
				else
				{
					obj.pop();
				}
				break;
			case 3:
				if(obj.isempty())
				{
					cout<<"Queue is empty";
				}
				else
				{
					obj.display();
				}
				break;
			default:
				cout<<"Wrong choice";
				break;
		}
		cout<<"Do you want to continue : (y/n)";
		cin>>c;
	}while(c=='y'||c=='Y');
	return 0;
}
