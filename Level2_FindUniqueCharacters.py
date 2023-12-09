def findUniqueCharacters(text):
    output = ""
    uniqueCharacters = dict()
    for character in text:
        if character not in uniqueCharacters:
            uniqueCharacters[character] = 1
        else:
            uniqueCharacters[character] += 1
    
    for character in uniqueCharacters:
        if uniqueCharacters[character] == 1:
            output += character

    return output

with open('level2input.txt', 'r') as file:
    input = file.read()
print(findUniqueCharacters(input))
