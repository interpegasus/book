class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


    def find(self, data):
        if self.data == data:
            return True
        elif data < self.data and self.left:
            return self.left.find(data)
        elif data > self.data and self.right:
            return self.right.find(data)
        return False            


    def insert(self, data):
        if data == self.data:
            return False
        if data < self.data:
            if self.left:
                self.left.insert(data)
            else:
                self.left = TreeNode(data)
                return True                 
        elif data > self.data:
            if self.right:
                self.right.insert(data)
            else:
                self.right = TreeNode(data)          
                return True             

    def preorder(self, data_list):        
        data_list.append(self.data)
        if self.left:
            self.left.preorder(data_list)
        if self.right:        
            self.right.preorder(data_list)
        return data_list

    def inorder(self, data_list):                
        if self.left:
            self.left.preorder(data_list)
        data_list.append(self.data)
        if self.right:        
            self.right.preorder(data_list)  
        return data_list

    def postorder(self, data_list):                
        if self.left:
            self.left.preorder(data_list)        
        if self.right:        
            self.right.preorder(data_list)
        data_list.append(self.data)      
        return data_list                              


class BinaryTree():
    def __init__():
        self.root = None
        self.size = 0


    def insert(self,data):
        if self.root:
            return self.root.insert(data)
        else:
            self.root = TreeNode(data)
            return True

    def find(self, data):
        if self.root:
            return self.root.find(data)
        else:
            False

	def remove(self, remove_data):
        # Case 1: Empty Tree?
        if self.root == None:
            return False

        # Case 2: Deleting root node
        if self.root.data == remove_data:
            # Case 2.1: Root node has no children
            if self.root.left is None and self.root.right is None:
                self.root = None
                return True
            # Case 2.2: Root node has left child
            elif self.root.left and self.root.right is None:
                self.root = self.root.left
                return True
            # Case 2.3: Root node has right child
            elif self.root.left is None and self.root.right:
                self.root = self.root.right
                return True
            # Case 2.4: Root node has two children
            else:
                moveTreeNode = self.root.right
                moveTreeNodeParent = None
                while moveTreeNode.left:
                    moveTreeNodeParent = moveTreeNode
                    moveTreeNode = moveTreeNode.left
                self.root.data = moveTreeNode.data
                if moveTreeNode.data < moveTreeNodeParent.data:
                    moveTreeNodeParent.left = None
                else:
                    moveTreeNodeParent.right = None
                return True		
        # Find node to remove
        parent = None
        node = self.root
        while node and node.data != remove_data:
            parent = node
            if remove_data < node.data:
                node = node.left
            elif remove_data > node.data:
                node = node.right
        # Case 3: TreeNode not found
        if node == None or node.data != remove_data:
            return False
        # Case 4: TreeNode has no children
        elif node.left is None and node.right is None:
            if remove_data < parent.data:
                parent.left = None
            else:
                parent.right = None
            return True
        # Case 5: TreeNode has left child only
        elif node.left and node.right is None:
            if remove_data < parent.data:
                parent.left = node.left
            else:
                parent.right = node.left
            return True
        # Case 6: TreeNode has right child only
        elif node.left is None and node.right:
            if remove_data < parent.data:
                parent.left = node.right
            else:
                parent.right = node.right
            return True
        # Case 7: TreeNode has left and right child
        else:
            moveTreeNodeParent = node
            moveTreeNode = node.right
            while moveTreeNode.left:
                moveTreeNodeParent = moveTreeNode
                moveTreeNode = moveTreeNode.left
            node.data = moveTreeNode.data
            if moveTreeNode.right:
                if moveTreeNode.data < moveTreeNodeParent.data:
                    moveTreeNodeParent.left = moveTreeNode.right
                else:
                    moveTreeNodeParent.right = moveTreeNode.right
            else:
                if moveTreeNode.data < moveTreeNodeParent.data:
                    moveTreeNodeParent.left = None
                else:
                    moveTreeNodeParent.right = None
            return True