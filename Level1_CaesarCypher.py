from string import ascii_lowercase as alc

def caesar_cypher(input, shift_length):
    output = ""
    for i in range(len(input)):
        ch = input[i]
        if ch == " " or ch == "." or ch == "(" or ch == ")" or ch == "'":
            output += ch
            continue
        chidx = ord(ch) - 97
        if chidx + shift_length > 25:
            output += alc[(chidx + shift_length) - 26]
        else:
            output += alc[(chidx + shift_length) % 26]

    return output


level1Test = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj."

def test_cypher_solver():
    print(caesar_cypher(level1Test, 2))

test_cypher_solver()

print(caesar_cypher("map", 2))
