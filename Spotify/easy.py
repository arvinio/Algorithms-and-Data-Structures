def reverseBinary(num):
        reversedBinary = str((bin(num))[:1:-1])
        newInt = int(str(reversedBinary), 2)
        print newInt
reverseBinary(input())
