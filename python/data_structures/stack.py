class Node():
    def __init__(self,data, next, prev):
        self.data = data
        self.next = next

class Stack():
    def __init__(self):
        self.head = None        
        self.length = 0
    
    def is_empty(self):
        return self.length == 0

    def pop(self):
        if self.is_empty():
            return None
        else:
            head_value = self.head.data
            self.head = self.head.next
            self.length -= 1
            return head_value

    def push(self,data):
        new_head = Node(data, None, None)        
        if self.is_empty():
            self.head = new_head
        else:
            new_head.next = self.head
            self.head = new_head
        self.length += 1
        return   

    def print_stack(self):
        current_node = self.head
        while(current_node is not None):
            print("{}\n".format(current_node.data))
            current_node = current_node.next


class TestStack:
    def __init__(self):
        # call tests
        self.test_is_empty()
        self.test_push()
        self.test_pop()
        self.test_print()

    def test_is_empty(self):
        new_stack = Stack()        
        assert new_stack.is_empty() == True
        new_stack.push(1)
        assert new_stack.is_empty() == False
        print('Test stack is empty: succesfull.')

    def test_push(self):
        new_stack = Stack() 
        items = [1,2,3,4,5,6,7]
        for data in items:
          new_stack.push(data)
        assert len(items) == new_stack.length
        assert  new_stack.length == 7        
        print('Test insert in stack: succesfull.')

    def test_pop(self):        
        new_stack = Stack() 
        items = [1,2,3,4,5,6,7]
        for data in items:
          new_stack.push(data)  
        removed = new_stack.pop()
        assert removed == 7
        removed = new_stack.pop()
        assert removed == 6
        assert new_stack.length == 5
        print('Test remove in stack: succesfull.')

    def test_print(self):
        new_stack = Stack() 
        items = [1,2,3,4,5,6,7]
        for data in items:
          new_stack.push(data)  
        new_stack.print_stack()    
        print('Test print stack: succesfull.')

TestStack()