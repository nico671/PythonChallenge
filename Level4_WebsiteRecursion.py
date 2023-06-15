import requests
import re
def solve_prob(curr_num):
    
    init_url = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + str(curr_num)
    response = requests.get(init_url)
    url_text = response.text
    if url_text == "Yes. Divide by two and keep going.":
        new_num = int(curr_num) / 2
        print(new_num)
        solve_prob(new_num)
        return
    if url_text == "peak.html":
        print("Solved! : " + url_text)
        return 
    print(url_text)
    new_num_location = re.search("[0-9]+$", url_text)
    new_num = url_text[new_num_location.start():new_num_location.end()]
    print(new_num)
    solve_prob(new_num)


print(solve_prob(12345))