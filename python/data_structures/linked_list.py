class Node:
    def __init__(self, data, next):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None
        self.length = 0

    def is_empty(self):        
        return self.length == 0
        
    def insert(self, data):
        new_node = Node(data,None)        
        if self.head is None:
            self.head = new_node            
        else:        
            current_node = self.head                
            while(current_node.next is not None):
                current_node = current_node.next
            current_node.next = new_node
        print ("New node has been added: {}".format(new_node.data))
        self.length += 1
        return new_node

    def traversal(self):
        current_node = self.head
        index = 0
        while(current_node is not None):
            index += 1
            print("Item {}: {} \n".format(index,current_node.data))
            current_node = current_node.next

    def search(self, data):
        current_node = self.head        
        while(current_node is not None):
            if current_node.data == data:
                return True
            current_node = current_node.next
        return False

class TestLinkedList:
    def __init__(self):
        # call tests
        self.test_is_empty()
        self.test_insert()
        self.test_search()

    def test_is_empty(self):
        new_list = LinkedList()
        assert new_list.is_empty() == True, new_list
        new_list.insert(1)
        assert new_list.is_empty() == False, new_list
        print('Test list is empty: succesfull.')

    def test_insert(self):
        new_list = LinkedList()
        items = [1,2,3,4,5,6,7]
        for data in items:
            new_list.insert(data)
        assert len(items) == new_list.length
        assert  new_list.length == 7
        new_list.traversal()
        print('Test insert in list: succesfull.')

    def test_search(self):        
        new_list = LinkedList()
        items = [1,2,3,4,5,6,7]
        for data in items:
            new_list.insert(data)  
        assert new_list.search(3) == True
        assert new_list.search(31) == False
        print('Test search in list: succesfull.')
            
TestLinkedList()
# new_list = LinkedList()
# print(new_list.is_empty())
# new_list = LinkedList()
# items = [1,2,3,4,5,6,7]
# for data in items:
#     new_list.insert(data)
# print(new_list.is_empty())
# new_list.traversal()
# new_list.search(5)