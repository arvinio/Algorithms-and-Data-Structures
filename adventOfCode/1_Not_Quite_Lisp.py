file = open("input_day1.txt", "r")
lines = file.read()
floor = 0
position = 1
used = False

for i in lines:
    if i == '(':
        floor += 1
    elif i == ')':
        floor -= 1
    else:
        print "you failed"
    if floor is -1 and used is not True:
            print "Position: " + str(position)
            used = True
    position += 1
print floor

file.close()
