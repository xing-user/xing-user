from foodchoose.resturant import Restaurant

bobs_burgers = Restaurant()

bobs_burgers.name = 'Bob\'s Burgers'
bobs_burgers.category = 'Ameriacan restaurant'
bobs_burgers.rating = 4.7
bobs_burgers.delivery = True
print(vars(bobs_burgers))