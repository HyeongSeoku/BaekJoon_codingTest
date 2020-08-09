#include<stdio.h>

int main()
{
	int y_year;
	scanf("%d",&y_year);
	if(y_year%4==0 &&y_year%100!=0||y_year%4==0 &&y_year%400==0){
		printf("1");
	}else{
		printf("0");
	}
}
