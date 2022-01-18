# print("array : ", array)
# #i = 2 , j = 5 
# slicing1 = array[4-1:4]
# print("slicing : ", slicing1)
# slicing1.sort()
# print("sort : ", slicing1)
# print("k번째 수 = ", slicing1[1-1])
# print(array)
#3 = k

#선택정렬
def selection_sort(array):
        for i in range(len(array)-1):
                min_value = i
                for j in range(i + 1, len(array)):
                        if array[j] < array[min_value]:
                                min_value = j 
                tmp = array[i]
                array[i] = array[min_value]
                array[min_value] = tmp

        return array
                        
array = [1, 5, 2, 6, 3, 7, 4]

commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]

j = 0
k = 0
a = 0
k_list = [] #return 해줄 list 생성

for i in range(1, len(commands)+1):
        index_front = commands[i-1][0] - 1
        #command index 만큼 slicing 해주기
        slicing = array[index_front:commands[j][1]]
        j = j + 1

        selection_sort(slicing)
        print(slicing)

        k_value = slicing[commands[k][2] - 1]

        k = k + 1
        k_list.insert(a, k_value)
        a = a + 1
        
print(k_list)

#commands 에서 i, j, k 추출해내기
# for i in range(len(commands)):
#         print("i =", commands[i][0])

# for j in range(len(commands)):
#         print("j =", commands[j][1])

# for k in range(len(commands)):
#         print("k =",commands[k][2])

# for i in range(len(commands)):
#     for j in range(len(commands)):
#         print("commands[{}][{}] = [{}]".format(i, j, commands[i][j]))                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                