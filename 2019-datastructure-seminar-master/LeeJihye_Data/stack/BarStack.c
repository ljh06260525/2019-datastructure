#include <stdio.h>
#include <stdlib.h>

void push(char c);
char pop();
char peek();

char stack[10000];
int arr[10000];
int top = 0;

int main(void) {
	int index = 0;
	int sum = 0;
	char bar[10000] = { 0, };

	int i, j;

	scanf("%s", bar); //()(((()())(())()))(())

	for (i = 0; bar[i] != '\0'; i++) {
		if (bar[i] == '(') {
			push('(');
			arr[++ index] = 1;
		}
		else if (bar[i] == ')') {
			if (peek() == '(' && bar[i - 1] == '(') {
				arr[index] = 0;
				index--;
				for (j = 1; j <= index; j++) {
					arr[j] ++;
				}
			}
			else {
				sum += arr[index];
				index--;
			}
		}
	}
	printf("%d\n", sum);
	return 0;
}

void push(char c) {
	top ++;
	stack[top] = c;
}

char pop() {
	int temp = stack[top];
	top--;
	return temp;
}

char peek() {
	return stack[top];
}
