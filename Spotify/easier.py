def getBinary(num):
	binary = bin(int(num))
	reverseBinary(binary)

def reverseBinary(binary):
	reversedBinary = (str(binary)[:1:-1])
	getNewInt(int(reversedBinary))

def getNewInt(reversedBinary):
	newInt = int(str(reversedBinary), 2)
	print newInt

getBinary(input())

####    MORE CONDENSED VERSION    ####

def reversingBinary(num):
        reversedBinary = str((bin(int(num)))[:1:-1])
        newInt = int(str(reversedBinary), 2)
        print newInt                              
