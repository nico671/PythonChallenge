# first needed to download the zip file from the website (change the end of the url from html to zip)

import zipfile, re
import os

current_directory = os.getcwd()
zip = zipfile.ZipFile(os.path.join(current_directory, "supportfiles/channel.zip"))

# found from the info file in the zip
init_num = "90052"


comments = []

while True:
    file_text = zip.read(init_num + ".txt").decode("utf-8")
    comments.append(zip.getinfo(init_num + ".txt").comment.decode("utf-8"))
    print(file_text)
    if file_text == "Collect the comments.":
        break
    new_num_location = re.search("[0-9]+$", file_text)
    new_num = file_text[new_num_location.start():new_num_location.end()]
    if new_num == None:
        break
    init_num = new_num

print("".join(comments))