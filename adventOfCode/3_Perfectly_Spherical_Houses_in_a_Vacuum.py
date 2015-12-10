f = open("input_day3.txt", "r")
lines = f.read()

nav = []
for i in lines:
    nav.append(i)

#cleanup \n char
del nav[-1]
nav_even = nav[::2]
nav_odd = nav[1::2]

visited = ["0,0"]

currentX = 0
currentY = 0
for h in nav_even:
    if h is "^":
        currentY += 1
    elif h is "v":
        currentY -= 1
    elif h is "<":
        currentX -= 1
    elif h is ">":
        currentX += 1
    else:
        print "Error"
    visited.append(str(currentY) + "," + str(currentX))

currentX = 0
currentY = 0
for h in nav_odd:
    if h is "^":
        currentY += 1
    elif h is "v":
        currentY -= 1
    elif h is "<":
        currentX -= 1
    elif h is ">":
        currentX += 1
    else:
        print "Error"
    visited.append(str(currentY) + "," + str(currentX))

unique_visits = len(set(visited))

print "Unique visits: " + str(unique_visits)
