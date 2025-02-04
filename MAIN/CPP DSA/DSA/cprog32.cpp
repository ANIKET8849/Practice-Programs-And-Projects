#include<iostream>
using namespace std;

int main(){
 int i,lastprime=3,cnt=0,n=5;
	while(n<=100){
		
		for(i=1; i<=n; i++){
			if(n%i==0){
				cnt++;
			}
		}
		if(cnt==2)
                 {
			if((n-lastprime)==2)
                                 {
				cout<<lastprime<<"  "<<n<<"\n";
				lastprime=n;
			           }
			else{
				lastprime=n;
			     }
		
		}
		cnt=0;
     	  	n=n+2;
	}
}