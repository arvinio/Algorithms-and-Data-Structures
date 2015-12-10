from hashlib import md5

secret = "bgvyzdsv"

for i in range(0,100000000):
    m = md5((secret + str(i)).encode())
    res = m.hexdigest()
    if res[:6] == '000000':
        print i
        print res
