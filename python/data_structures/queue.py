class Node:
  def __init__(self, data, next, prev):
    self.data = data
    self.next = next
    self.prev = prev

class Queue:
  def __init__(self):
    self.head = None
    self.tail = None
    self.length = 0

  def is_empty(self):
    return self.length == 0

  def add(self, data):
    new_node = Node(data, None, None)
    if self.is_empty():
      self.head = new_node
      self.tail = new_node
    else:      
      new_node.prev = self.tail
      self.tail.next = new_node
      self.tail = new_node
    self.length += 1
    print("{} has been queued".format(new_node.data))
    return new_node.data

  def remove(self):
    if self.is_empty():
      return
    removed_node = self.head
    self.head = self.head.next
    self.length -= 1
    print("{} has been dequeued".format(removed_node.data))
    return removed_node.data

  def print_queue(self):
    current_node = self.head
    while(current_node is not None):
      print("Current Node: {}\n".format(current_node.data))
      current_node = current_node.next
  
class TestQueue:
    def __init__(self):
        # call tests
        self.test_is_empty()
        self.test_add()
        self.test_remove()
        self.test_print()

    def test_is_empty(self):
        new_queue = Queue()        
        assert new_queue.is_empty() == True
        new_queue.add(1)
        assert new_queue.is_empty() == False
        print('Test queue is empty: succesfull.')

    def test_add(self):
        new_queue = Queue() 
        items = [1,2,3,4,5,6,7]
        for data in items:
          new_queue.add(data)
        assert len(items) == new_queue.length
        assert  new_queue.length == 7        
        print('Test insert in queue: succesfull.')

    def test_remove(self):        
        new_queue = Queue() 
        items = [1,2,3,4,5,6,7]
        for data in items:
          new_queue.add(data)  
        removed = new_queue.remove()
        assert removed == 1
        removed = new_queue.remove()
        assert removed == 2
        assert new_queue.length == 5
        print('Test remove in queue: succesfull.')

    def test_print(self):
        new_queue = Queue() 
        items = [1,2,3,4,5,6,7]
        for data in items:
          new_queue.add(data)  
        new_queue.print_queue()    
        print('Test print queue: succesfull.')

TestQueue()