#include<stdio.h>
#include <iostream>
#include<string>
using namespace std;
class list;
class node
{
	int prn;
	string name;
	node *next;
	public:
	node(int x,string nm)
	{
		prn=x;
		next=NULL;
		name=nm;
	}
	friend class list;
};
class list
{
	node *start;
	public:
	list()
	{
		start=NULL;
	}
	void create();
	void display();
	void insertAtEnd();
	void concatList(list &q1);
};
void list::create()
{
	int no;
	string nam;
	if(start==NULL)
	{
		cout<<"Enter PRN number: ";
		cin>>no;
		cout<<"Enter name: ";
		cin>>nam;
		start=new node(no,nam);
		cout<<"\n====== List Created =====";
	}
	else
	{
		cout<<"\nList is already created.";
	}
}
void list::display()
{
	node *t;
	t=start;
	if(start==NULL)
		cout<<"\nList is Empty";
	else
	{ 
		cout<<"\n====== List: ======\n";
		while(t!=NULL)
		{
			cout<<t->prn<<" "<<t->name<<" \n";
			t=t->next;
		}
	}
}
void list::insertAtEnd()
{
	int no;
	string nam;
	node *temp;
	if(start==NULL)
	{
		create();
	}
	else
	{
		cout<<"\nEnter PRN number: ";
		cin>>no;
		cout<<"\nEnter name: ";
		cin>>nam;
		temp=new node(no,nam);
		temp=start;
		while(temp->next!=NULL)
		temp=temp->next;
		node *p=new node(no,nam);
		temp->next=p;
		cout<<"Inserted "<<temp->name<<" at the end.";
	}
}
void list::concatList(list &q1)
{
	node *t,*p;
	t=q1.start;
	if(t==NULL)
	{
		cout<<"\nList 2 is empty";
		return;
	}
	p=start; //first list
	while(p->next!=NULL)
	{
		p=p->next;
	}
	p->next=t;
	q1.start=NULL; //second list is set to null
	cout<<"\nAfter concatenationlist";
	display();
}
int main() 
{
	list *l;
	int choice,selectList;
	list l1,l2;
	l=&l1;
	X:cout<<"\nSelect List\n1.List 1\n2.List 2\nEnter choice: ";
	cin>>selectList;
	if(selectList==1)
	{
		l=&l1;
	}
	else if(selectList==2)
	{
		l=&l2;
	}
	else
	{
		cout<<"\nWrong list Number.";
		goto X;
	}
	do
	{
		cout<<"\n1. Create\n2. Add Secretary \n3. ReSelect List";
		cout<<"\n4. Concatenate List \n0. Exit\nEnter your choice: \t";
		cin>>choice;
		switch(choice)
		{
			case 1: l->create();
					break;
			case 2: l->insertAtEnd();
					break;
			case 3:
					goto X;
					break;
			case 4:
					l1.concatList(l2);
					break;
			deafult:
				cout<<"Wrong choice";
		}
	}while(choice!=0);
	return 0;
}

