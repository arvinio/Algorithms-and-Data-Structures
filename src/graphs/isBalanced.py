"""
Algorithm which checks if a tree is balanced.

A "balanced" tree is defined as one where the heights of the two    subtrees of any node never differ by more than one.
"""

is_balanced = True
h1 = None
h2 = None

def range_check(h):
    global h1, h2, is_balanced
    if h1 is None or h1 is h:
        h1 = h
    elif h2 is None or h2 is h:
        h2 = h
        if abs(h1-h2) > 1:
            is_balanced = False
    else:
        is_balanced = False
    #print ("h = " + str(h))
    #print ("h1 = " + str(h1) + ", h2 = " + str(h2))

def dfs(tree, counter):
    if is_balanced is False:
        pass
    counter += 1
    if tree.left is not None:
        dfs(tree.left, counter)
    else:
        range_check(counter)
    if tree.right is not None:
        dfs(tree.right, counter)
    else:
        range_check(counter)

class Tree(object):
    def __init__(self):
        self.data = None
        self.left = None
        self.right = None

#root
root = Tree()
tree_1 = Tree()
tree_2 = Tree()
tree_3 = Tree()


root.left = tree_1
root.right = tree_2
tree_1.left = Tree()
tree_2.right = Tree()
tree_2.left = tree_3

dfs(root, 0)
#prints True since balanced
print(is_balanced)

#add node to cause imbalance
tree_3.right = Tree()
dfs(root, 0)
#prints False
print(is_balanced)
