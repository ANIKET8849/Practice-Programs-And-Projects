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
	void insertAtMiddle();
	void deleteAtMiddle();
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
void list::insertAtMiddle()
{
	node *temp;
	int prevno,no,flag=0;
	string name;
	cout<<"Enter the PRN number of after which u want to add member : ";
	cin>>prevno;
	temp=start;
	while(temp!=NULL)
	{
		if(temp->prn==prevno)
		{
			flag=1;
			break;
		}
		temp=temp->next;
	}
	if(flag==1)
	{
		node *p;
		cout<<"Enter Prn Number : ";
		cin>>no;
		cout<<"Enter Member Name : ";
		cin>>name;
		p=new node(no,name);
		p->next=temp->next;
		temp->next=p;
	}
	else
	{
		cout<<"\n"<<prevno<<" is not in list";
	}
}
void list::deleteAtMiddle()
{
	int no,flag=0;
	node *temp,*prev;
	if(start==NULL)
	cout<<"\nList/Club is empty;";
	else	
	{
		cout<<"\nEnter PRN no. of member to be deleted: ";
		cin>>no;
		temp=start->next; //t=start if we have to delete precident also.. start->next is first member
		while(temp->next!=NULL)
		{
			if(temp->prn==no)
			{
				flag=1;
				break;
			}
			prev=temp;
			temp=temp->next;
		}
		if(flag==1)
		{
			prev->next=temp->next;
			temp->next=NULL;
			delete temp;
			cout<<"\nMember with prn no: "<<no<<" is deleted.";
		}
		else
		{
			cout<<"\nMember not found in List./president or secretary cannot be deleted.";	
		}
	}
}
int main() 
{
	list *l;
	int choice;
	list l1;
	l=&l1;
	do
	{
		cout<<"\n1. Create\n2. Add Secretary \n3. Display list";
		cout<<"\n4. Delete Secretary \n0. Exit\nEnter your choice: \t";
		cin>>choice;
		switch(choice)
		{
			case 1: l->create();
					break;
			case 2: l->insertAtMiddle();
					break;
			case 3: l->display();
					break;
			case 4: l->deleteAtMiddle();
					break;
			deafult:
				cout<<"Wrong choice";
		}
	}while(choice!=0);
	return 0;
}

