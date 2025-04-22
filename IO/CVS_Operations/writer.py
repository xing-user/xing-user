import csv
"""import csv

data_to_write = [
    ["Title", "Author", "Year"],
    ["The Great Gatsby", "F. Scott Fitzgerald", "1925"],
    ["To Kill a Mockingbird", "Harper Lee", "1960"],
    ["1984", "George Orwell", "1949"],
]

# write to a Csv file

with open("books.csv","w",newline="") as file:
    csv_writer = csv.writer(file)
    csv_writer.writerows(data_to_write)"""
"""
下载此历史畅销图书数据的 CSV 文件！
在 “read” 模式下打开 Bestseller - Sheet1.csv 文件。
使用 CSV 阅读器浏览数据，并通过列查找销量最高的图书。sales in millions
使用 CSV 编写器创建一个名为 bestseller_info.csv 的新文件。
在新文件中，用于添加新的 CSV 数据。.writerow()
"""
# 销量最高的书籍
best_selling_book = None
# 销量
highest_sales = 0
# 读取 CSV 文件
with open("Bestseller - Sheet1.csv","r",encoding="utf-8") as file:
    # 创建 CSV 阅读器
    csv_reader = csv.reader(file)
    # 跳过标题行
    file_header = next(csv_reader)

    for row in csv_reader:
        current_sales = float(row[4])
        if current_sales > highest_sales:
            highest_sales = current_sales
            best_selling_book = row

# 创建一个名为 bestseller_info.csv 的新文件

out_file = "bestseller_info.csv"
# 添加新的 CSV 数据
with open(out_file,"w",newline="") as file:
    csv_writer = csv.writer(file)
    # 写入标题行
    csv_writer.writerow(file_header)
    # 写入最佳销售行
    csv_writer.writerow(best_selling_book)
#     打印已经写入文件
    print(f"Best selling book: {best_selling_book}")
