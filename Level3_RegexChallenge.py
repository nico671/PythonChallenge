import re

def find_matches(text):
    matches = re.findall("[a-z][A-Z]{3}[a-z][A-Z]{3}[a-z]",text)
    centerLetter = list(map(lambda x: x[4], matches))
    return centerLetter


with open('supportfiles/level3input.txt', 'r') as file:
    input = file.read()
print(find_matches(input))