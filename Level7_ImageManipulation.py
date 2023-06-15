from PIL import Image
import re
im = Image.open("oxygen.png")

pixel_row = [im.getpixel((x, im.height / 2)) for x in range(im.width)]

simplified_color_row = pixel_row[::7]

ords = [r for r, g, b, a in simplified_color_row if r == g == b]

final_nums = re.findall("\d+", "".join(map(chr, ords)))

print("".join(map(chr, map(int, final_nums))))