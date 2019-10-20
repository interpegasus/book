class HashNode:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None

class HashTable:
    def __init__(self, n):
        self.size = n
        self.hash_table = [None] * self.size
        self.length = 0

    def is_empty(self):
        return self.length == 0
    
    def key_hashing_function(self, key):
        return hash(key) % self.size

    def insert(self,key,value):
        if key in [None, '']:
            return None
        new_hash_item = HashNode(key,value)
        index = self.key_hashing_function(key)
        current_bucket = self.hash_table[index]
        if current_bucket is None:
            current_bucket = new_hash_item
            self.hash_table[index] = current_bucket
            self.length += 1
            return
        else:
            while current_bucket is not None:
                if current_bucket.key == new_hash_item.key:
                    current_bucket.value = new_hash_item.value
                    return
                else:
                    prev_bucket = current_bucket
                    current_bucket = current_bucket.next
        prev_bucket.next = new_hash_item
        self.length += 1
        return

    def get(self, key):
        index = self.key_hashing_function(key)
        current_bucket = self.hash_table[index]
        if current_bucket is None:
            return None
        else:
            while(current_bucket is not None):
                if current_bucket.key == key:
                    return current_bucket.value
                else:
                    current_bucket = current_bucket.next
        return None

    def print_hash_table(self):
        for index, hash_node in enumerate(self.hash_table):
            print("***************************")
            print("\nINDEX {}\n".format(index))
            print("***************************")
            while hash_node is not None:
                print("Key: {} Value: {}. ".format(hash_node.key, hash_node.value))
                hash_node = hash_node.next      
                

class TestHashTable:
    def __init__(self):
        # call tests
        self.test_is_empty()
        self.test_insert()
        self.test_get()
        self.test_print()

    def test_is_empty(self):
        new_hash_table = HashTable(10)
        assert new_hash_table.is_empty() == True
        new_hash_table.insert('apples', 3)
        assert new_hash_table.is_empty() == False
        print('Test hash_table is empty: succesfull.')

    def test_insert(self):
        new_hash_table = HashTable(7)
        items = [['apples',3],['bananas',3],['pears',3],['mangos',3],['papayas',3]]
        for data in items:
          new_hash_table.insert(data[0],data[1])
        assert len(items) == new_hash_table.length
        assert  new_hash_table.length == 5     
        print('Test insert: succesfull.')

    def test_get(self):        
        new_hash_table = HashTable(7)
        items = [['apples',3],['bananas',5],['pears',7],['mangos',9],['papayas',31]]
        for data in items:
          new_hash_table.insert(data[0],data[1])         
        assert new_hash_table.get('apples') == 3
        assert new_hash_table.get('bananas') == 5
        assert new_hash_table.get('mangos') == 9
        assert new_hash_table.get('papayas') == 31
        print('Test get: succesfull.')

    def test_print(self):
        new_hash_table = HashTable(7)
        items = [['apples',3],['bananas',5],['pears',7],['mangos',9],['papayas',31]]
        for data in items:
          new_hash_table.insert(data[0],data[1]) 
        new_hash_table.print_hash_table()
        print('Test print hash_table: succesfull.')

TestHashTable()