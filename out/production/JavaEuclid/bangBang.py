n = int(input())
arr = []
killer = n - 1
for index in range(n) :
    arr.append(0)
    # print(index)
num = n
while num != 1:
    ne = (killer + 1) % n
    
    while arr[ne] == 1:
        ne = (ne + 1) % n
    killer = ne
    dead = (killer + 1)%n

    while arr[dead] == 1:
        dead = (dead + 1) % n

    arr[dead] = 1
    
    
    num = num -1
    # print("killer",killer,"dead",dead)
print((killer )%n+ 1)
