file = open("input_day2.txt", "r")
lines = file.read()
areas = lines.splitlines()
splitareas = []
sortedareas = []
sum = 0

#has to be in global scope
ribbon_total = 0


for i in areas:
    i = i.split("x")
    splitareas.append(i)

for i in splitareas:
    i.sort(key=int)
    sortedareas.append(i)

for i in sortedareas:
    print i
    l = int(i[0])
    w = int(i[1])
    h = int(i[2])
    surface_area = w * l * 2 + w * h * 2 + l * h * 2

    #since list is sorted, l and w are shortest  sides
    extra = l * w

    sum = sum + surface_area + extra

    ribbon_standard = 2 * l + 2 * w
    ribbon_bow = l * w * h
    ribbon_total = ribbon_total + ribbon_bow + ribbon_standard

print "Sum: " + str(sum)
print "Ribbon: " + str(ribbon_total)
