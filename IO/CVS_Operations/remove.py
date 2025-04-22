import csv
data = [
  ['Item', 'Quantity'],
  ['Blender', 2],
  ['Posters', 30],
  ['Shoes', 2]
]

# 以READ模式打开文件
try:
    with open("packing_list.csv", "r") as file:
        csv_reader = csv.reader(file)
        for row in csv_reader:
            print(row)
except FileNotFoundError:
    print("File not found, creating a new one.")
# 以WRITE模式打开文件
with open("packing_list.csv", "w", newline="") as file:
    csv_writer = csv.writer(file)
    # 写入数据
    csv_writer.writerows(data)
    print(f"Data written to packing_list.csv:{data}")