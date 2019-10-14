class Node(object):
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack(object):    
    def __init__(self):  
        self.top = None

    def isEmpty(self):
        return self.top == None                

    def peek(self):
        return self.top.data        

    def push(self, data):
        new_data = Node(data)
        if self.top is None:
           self.top = new_data
        else:
           new_data.next = self.top
           self.top = new_data        

    def pop(self):
        if self.top:
           data = self.top.data
           self.top = self.top.next
           return data
        else:
           return None           