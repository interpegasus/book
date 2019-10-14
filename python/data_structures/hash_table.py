class HashTable:
    def __init__(self):
        self.hash_table = [[] for _ in range(256)]
        print (self.hash_table)

    def hashing_func(self, key):
        return key % len(self.hash_table)
    
    def insert(self, hash_table, key, value):
        hash_key = self.hashing_func(key)
        hash_table[hash_key].append(value)
    

