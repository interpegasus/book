class Node:
	def __init__(self, data, next):
		self.data = data
		self.next = next

class Stack:
	def __init__(self):
		self.head = None
	
	def push(self, data):
		self.head = Node(data, self.head)

	def pop(self):
		data = self.head.data
		self.head = self.head.next
		return data 


class StackArray:
	
	def __init__(self):
		self.data = []

	def push(self, item):
		self.data.append(item)

	def pop(self):
		return self.data.pop()

	def peek(self):
		return self.data[-1]        