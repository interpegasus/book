class Node:
    def __init__(self, data):
        self.item = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.first_node = None


    def remove_dups_sorted_list(self):
        current_node = self.first_node
        while(current_node.next is not None):
            if current_node.item == current_node.next.item:
                current_node.next = current_node.next.next
            current_node =  current_node.next

    def remove_dups_unsorted_list(self):        
        prev_node = None
        current_node =  self.first_node
        my_hash = {}        
        while(current_node is not None):
            if str(current_node.item) in my_hash:
                prev_node.next = current_node.next.next                
            else:
                my_hash[str(current_node.item)] = True
                prev_node = current_node            
            current_node = current_node.next            

