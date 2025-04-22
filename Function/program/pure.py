def circarea(r):
    Area = 3.14*r**2
    return Area
if __name__ == '__main__':
    r = float(input("Enter the radius of the circle: "))
    print("Area of the circle is:", circarea(r))
    print("Area of the circle is:", circarea(5))
    print("Area of the circle is:", circarea(10))
    print("Area of the circle is:", circarea(15))
    print("Area of the circle is:", circarea(20))