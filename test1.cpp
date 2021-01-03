#include<cstdio>
void f(int x[][2]){
	printf("%d",x[1][1]);
}
int main(){
	int a[2][2]={0,1,2,3};
	f(a);
} 
