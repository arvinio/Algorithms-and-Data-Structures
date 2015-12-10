import re

f = open("input_day6.txt", "r")
lines = f.read().split("\n")

data = []
for i in lines:
    instr = i
    instr.split()
    data.append(instr)

#cleanup trailing char
del data[-1]

c = []
for i in data:
    """
    Examples:
    ('on', '204', '143', '876', '610')
    ('toggle', '567', '374', '925', '439')
    """
    search = re.search(r"(\w+) (\d+),(\d+) through (\d+),(\d+)", i)
    c.append(search.groups())

print (c[0])





#create 2d array of booleans
rows = 1000
columns = 1000
lights = [[0 for x in range(columns)] for x in range(rows)]

#start at lights[15][15]
currentX = 0
currentY = 0
lights[currentY][currentX] = 0



"""
for h in nav:
    if h is "^":
        currentY += 1
        lights[currentY][currentX] = 1
    if h is "v":
        currentY -= 1
        lights[currentY][currentX] = 1
    if h is "<":
        currentX -= 1
        lights[currentY][currentX] = 1
    if h is ">":
        currentX += 1
        lights[currentY][currentX] = 1

total_lights = 0

counter = 0
for i in range(rows):
    for j in range(columns):
        counter += 1
        if lights[i][j] is 1:
            total_lights += 1
print total_lights
print counter
"""
