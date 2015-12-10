f = open("input_day5.txt", "r")
lines = f.read().split("\n")

words = [word for word in lines]
del words[-1]

def part1():
    forbidden = ["ab", "cd", "pq", "xy"]

    req1 = False
    req2 = False
    req3 = False

    nice_words = 0
    for word in words:
        if (word.count("a") + word.count("e") + word.count("i") + word.count("o") + word.count("u") >= 3):
            req1 = True
        for i in range(0, len(word) - 1):
            if word[i] == word[i + 1]:
                req2 = True
        if not any(comb in word for comb in forbidden):
            req3 = True
        if (req1 and req2 and req3) == True:
            nice_words += 1
            print word
        req1 = False
        req2 = False
        req3 = False

    print "Nice words: " + str(nice_words)

def part2():

    new_req1 = False
    new_req2 = False

    nicer_words = 0
    for word in words:
        for i in range(0, len(word) - 2):
            if word[i] == word[i + 2]:
                new_req1 = True

        for i in range(0, len(word) - 1):
            if word.count(word[i] + word[i+1]) > 1:
                new_req2 = True

        if (new_req1 and new_req2) == True:
            nicer_words += 1
            print word
        new_req1 = False
        new_req2 = False

    print "Nicer words: " + str(nicer_words)
part2()
