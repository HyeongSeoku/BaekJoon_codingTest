#include<stdio.h>

int main()
{
    int cross_cnt= 1, pre_cross_cnt = 0;
    int X ;         // 입력받을 값

    scanf("%d",&X);
    
    while(true)
    {
        if(X<=pre_cross_cnt+cross_cnt)
        {
            if(cross_cnt % 2 == 0)
                //대각선이 짝수일 경우
            {
                printf("%d / %d",X-pre_cross_cnt,cross_cnt-(X-pre_cross_cnt-1));
                break;
            }
            else
                //대각선이 홀수일 경우
            {
                printf("%d / %d",cross_cnt-(X-pre_cross_cnt-1),X-pre_cross_cnt);
                break;
            }
            
        }

        else
        {
            pre_cross_cnt+=cross_cnt;
            cross_cnt++;
        }
    }
}