class Node:
    def __init__(self, data, next=None, prev=None):
        self.data = data
        self.next = next
        self.prev = prev


class Queue:
    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0

    def enqueue(self, data):
        new_node = Node(data, None, self.head)
        if not self.head:
            self.head = new_node
        else:
            self.tail.next = new_node
            new_node.prev = self.tail
        self.tail = new_node
        self.length += 1
    
    def dequeue(self):
        data = self.head.data
        self.head = self.head.next
        self.length -= 1
        return data