#include <stdio.h>
#define ROW 4
#define COLUMN 4

int main(void)
{
	int i, j;
	int count, min, max = 0;
	int square[ROW][COLUMN]= {1, };

	for(i = 0; i < ROW; i++){
		for(j = 0; j < COLUMN; j++){
			count = 1;
			square[i][j] = count ++;
		}
	}
	
	square[0][0] = 0;
	square[3][0] = 0;
	square[3][1] = 0;
	square[3][3] = 0;

	for(i = 0; i < ROW; i++){
		for(j = 0; j < COLUMN; j++){
			printf("%3d", square[i][j]);
		}
		printf("\n");
	}
	
	for(i = 1; i < ROW; i++){
		for(j = 0; j < COLUMN; j++){
			if(square[i][j] == 0){
				continue;
			}
			else{
				if(square[i][j-1] < square[i-1][j]){
					if(square[i-1][j-1] < square[i][j-1]){
						min = square[i-1][j-1];
					}
					
					else{
						min = square[i][j-1];
					}
				}
				else{
					if(square[i-1][j-1] < square[i-1][j]){
						min = square[i-1][j-1];
					}
					else{
						min = square[i-1][j];
					}		
				}

				square[i][j] = min + 1;
							
				if(max < square[i][j]){
					max = square[i][j];
				}
			}
		}
	}
	printf("가장 큰 정사각형의 넓이는 [%d]입니다.\n", max*max);
	
	return 0;
}

