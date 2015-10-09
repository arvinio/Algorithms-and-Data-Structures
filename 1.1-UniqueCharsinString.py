"""
Problem: Find out if a string contains unique characters. Refrain from using additional data structures

Approach: Sort char array s, then compare s[i] with s[i+1]
"""

#params point out array index
def quicksort(s, lo, hi):
	if lo < hi:
		pivot = partition(s, lo, hi)
		quicksort(s, lo, (pivot - 1))
		quicksort(s, (pivot + 1), hi)
	return s

def partition(a, lo, hi):
	leftwall = lo
	pivot = a[lo]

	for i in range(lo + 1, hi + 1):
		if a[i] < pivot:
			leftwall = leftwall + 1
			swap(a, leftwall, i)

	swap(a, lo, leftwall)
	return leftwall

def swap(s, a, b):
	temp = s[a]
	s[a] = s[b]
	s[b] = temp

def do_quicksort(s):
	if type(s) is str:
		s = list(s)
	res = quicksort(s, 0, (len(s)-1))
	res = ''.join(res)

	return res

def ifUniqueLetters(s):
	s = do_quicksort(s)

	isUnique = True
	for i in range(0, len(s)-1):
		if s[i] is s[i+1]:
			isUnique = False
	return isUnique

s = "quicksortexample"
print (ifUniqueLetters(s))
