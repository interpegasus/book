
class Node: 
    def __init__(self, next=None, prev=None, data=None): 
        self.next = next # reference to next node in DLL 
        self.prev = prev # reference to previous node in DLL 
        self.data = data 

class DoubleLinkedList:
    def __init__(self, head=None):
        self.head=head

    
    def insert_at_start(self, new_data): 
        new_node = Node(None, None, new_data) 
        new_node.next = self.head 
        if self.head is not None: 
            self.head.prev = new_node 
        self.head = new_node 

    def insert_at_end(self, new_data): 
        new_node = Node(None, None, new_data) 
        if self.head is None: 
            self.head = new_node 
        else:
            current_node = self.head
            while current_node.next is not None:
                current_node = current_node.next
            current_node.next = new_node
            new_node.prev = current_node


    def printList(self): 
        node = self.head
        print("\nTraversal in forward direction")
        while(node is not None): 
            print(" % d" %(node.data), )
            last = node 
            node = node.next
  
        print ("\nTraversal in reverse direction")
        while(last is not None): 
            print (" % d" %(last.data), )
            last = last.prev             
            
                          
# Start with empty list 
list_ds = DoubleLinkedList() 
  
# Insert 6. So the list becomes 6->None 
list_ds.insert_at_end(2) 
list_ds.insert_at_end(5) 
list_ds.insert_at_end(34) 
list_ds.insert_at_end(645)
list_ds.insert_at_end(6567)         

list_ds.printList()