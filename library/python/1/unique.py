# unique

def unique(text):   
    return len(list(text)) == len(set(list(text)))

#
def uniqueon(text):
    dictionary = dict()
    for character in list(text):
        if character in dictionary:
            return False
        else:
            dictionary[character] = True
    # Return
    return True


#
def unique_onmem(text):
    for index, character in enumerate(text):
        for index2, character2 in enumerate(text):
            if (index == index2):
                next
            elif character == character2:
                return False
    #
    return True