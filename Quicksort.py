def do_quicksort(s):
	if type(s) is str:
		s = list(s)
	res = quicksort(s, 0, (len(s)-1))
	res = ''.join(res)

	return res

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
