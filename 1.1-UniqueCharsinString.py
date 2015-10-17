"""
Problem: Find out if a string contains unique characters. Refrain from using additional data structures

Approach: Sort char array s, then compare s[i] with s[i+1]
"""

import Quicksort as sort

def ifUniqueLetters(s):
	s = sort.do_quicksort(s)

	isUnique = True
	for i in range(0, len(s)-1):
		if s[i] is s[i+1]:
			isUnique = False
	return isUnique

s = "quicksortexample"
print (ifUniqueLetters(s))
