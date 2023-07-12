print(text)

for i in range(len(text)):
    char = text[i]
    
    if char == "\\":
        print("here")
        curr = text[i:i+3]
        i += 3
        print(curr)
        # print(ord(curr), end="")
    elif char == "\n":
        # print()
        pass
    else:
        # print(char, end="")
        pass
    
