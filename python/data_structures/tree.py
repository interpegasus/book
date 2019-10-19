class BinaryTree:

    def __init__(self, data, left, right):
        self.data = data
        self.left = left
        self.right = right 

    def traverse_binary_tree(self, node, callback):
        if node is None:
            return
        self.traverse_binary_tree(node.leftChild, callback)
        callback(node.value)
        self.traverse_binary_tree(node.rightChild, callback)    