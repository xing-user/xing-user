"""try:
    file = open("try_finally.txt","r")
    pass
finally:
    file.close()


file_path = "try_finally.txt"

with open(file_path,"a") as file:

    file.truncate(3)

"""
sent_message = "Hello, World!"
unsent_message = "nihao shijie"
with open("Sent_Message.txt","r+") as file:
    file.write(sent_message)
    file.seek(0)
    sent_message = file.read()
    print(sent_message)

    file.seek(0)
    file.truncate(len(unsent_message))
    file.write(unsent_message)
    unsent_message = file.read()
    print(unsent_message)