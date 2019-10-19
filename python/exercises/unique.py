def unique(str):
    my_hash = {}
    for n in range(len(str)):
        key = str[n]
        if key in my_hash:
            return False
        else:
            my_hash[str[n]] = True                    
    return True


