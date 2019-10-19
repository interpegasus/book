class HashEntry:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
    

class HashTable:
    def __init__(self, size):
        self.size = size
        self.hash_table = [None] * self.size
        print(self.hash_table)

    def hashing_function(self, key):
        print(hash(key) % self.size)
        return hash(key) % self.size     
        

    def rehash(self, entry, key, value):
        while entry and entry.key != key:
            prev, entry = entry, entry.next
        if entry:
            entry.value = value
        else:
            prev.next = HashEntry(key, value)

    def insert(self, key, value):
        slot = self.hashing_function(key)
        entry = self.hash_table[slot]
        if not entry:
            self.hash_table[slot] = HashEntry(key, value)
        else:
            self.rehash(entry, key, value)
    
    def get(self, key):
        hash = self.hashing_function(key)
        if not self.hash_table[hash]: raise KeyError
        else:
            entry = self.hash_table[hash]
            while entry and entry.key != key: entry = entry.next
            return entry.value