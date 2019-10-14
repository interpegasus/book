class Node:
    def __init__(self, data):
        self.item = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.start_node = None


    def traverse_list(self):
        if self.start_node is None:
            print("List has no element")
            return
        else:
            print("Traversing single linked list")
            n = self.start_node
            while n is not None:
                print(n.item)
                n = n.next

    def insert_at_start(self, data):
        new_node = Node(data)
        new_node.next = self.start_node
        self.start_node= new_node                


    def insert_at_end(self, data):
        new_node = Node(data)
        if self.start_node is None:
            self.start_node = new_node
            return
        n = self.start_node
        while n.next is not None:
            n= n.next
        n.next = new_node


    def insert_after_node_x(self,x, data):
        n = self.start_node        
        while n is not None:
            if n.item == x:
                break
            n = n.next
        if n is None:
            print("item not in the list")
        else:
            new_node = Node(data)
            new_node.next = n.next
            n.next = new_node     

    def insert_before_node_x(self, x, data):
        if self.start_node is None:
            print("List has no element")
            return

        if x == self.start_node.item:
            new_node = Node(data)
            new_node.next = self.start_node
            self.start_node = new_node
            return

        n = self.start_node
        print(n.next)
        while n.next is not None:
            if n.next.item == x:
                break
            n = n.next
        if n.next is None:
            print("item not in the list")
        else:
            new_node = Node(data)
            new_node.next = n.next
            n.next = new_node            


single_linked_list = LinkedList()
single_linked_list.insert_at_end(9)
single_linked_list.insert_at_end(2)
single_linked_list.insert_at_end(3)
single_linked_list.insert_at_end(5)
single_linked_list.insert_at_end(6)
single_linked_list.insert_at_end(3)
single_linked_list.insert_at_start(1)
single_linked_list.traverse_list()