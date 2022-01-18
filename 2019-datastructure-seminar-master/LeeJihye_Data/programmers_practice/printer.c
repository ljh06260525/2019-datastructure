#include <stdio.h>
#define SIZE 5

int main(void)
{
	int loction, i, front, rear, j = 1;
	int priorities[100] = { 0 };
	int file[5] = { 7, 4, 6, 9, 2 };
	int max = 9;

	for (i = 0; i < sizeof(file)/sizeof(int); i++) {
		priorities[i] = file[i];
	}//중요도 배열에 문서의 중요도를 넣어줌

	for (i = 0; priorities[i] != '\0'; i++) {
		printf("[ %d ] ", priorities[i]);
	}//중요도 배열 확인차 출력
	printf("\n");

	front = priorities[0];
	rear = priorities[sizeof(priorities - 1)];
	printf("front = %d, rear = %d\n", front, rear);
	
	int temp = 0;

	for (i = 1; i < sizeof(priorities) / sizeof(int); i++) {
		if (front < file[i]){
			printf("i == %d\n", i);
			front == priorities[SIZE + (temp++)];
			//rear = front;
			priorities[SIZE + (temp++)] = rear;
			front = priorities[j++];
			i = j;
			printf("front = %d, rear = %d\n i = %d\n", front, rear, i);
		}
		else if (front > file[i]) {
			printf("front = %d\n", front);
		}
	}

	for (i = 0; i < 10; i++) {
		printf("[ %d ] ", priorities[i]);
	}//중요도 배열 확인차 출력
	printf("\n");

	/*for (i = 0; i < sizeof(priorities)/sizeof(int); i++) {
		if (front > priorities[i + 1]) {
			printf("큰 경우 : %d\n", front);
		}
		else if (front < priorities[i + 1]) {
			front == priorities[sizeof(priorities) + 1];
			rear = front;
			front = priorities[i - 1];
			printf("<작은경우> 멈춘 부분 : %d, 맨앞 : %d, 맨뒤 : %d, 딱 : %d\n", priorities[i + 1], front, rear, priorities[sizeof(priorities)]);

		}
	}*/
}

