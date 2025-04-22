
# 1) Triangle
# 2) Rectangle
# 3) Square
# 4) Circle
# 5) Quit
def mune():
    print("=======================")
    print("Area Calculator 📐")
    print("=======================")
    print("1) Triangle")
    print("2) Rectangle")
    print("3) Square")
    print("4) Circle")
    print("5) Quit")

def triangle_area(base, height):
    return 0.5 * base * height
def rectangle_area(length, width):
    return length * width
def square_area(side):
    return side ** 2
def circle_area(radius):
    return 3.14 * radius ** 2
def get_float(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Invalid input. Please enter a number.")
def get_choice():
    while True:
        try:
            choice = int(input("which shape: "))
            if 1 <= choice <= 5:
                return choice
            else:
                print("Invalid choice. Please enter a number between 1 and 5.")
        except ValueError:
            print("Invalid input. Please enter a number.")
def main():
    mune()
    while True:
        choice = get_choice()
        if choice == 1:
            base = get_float("Enter the base of the triangle: ")
            height = get_float("Enter the height of the triangle: ")
            area = triangle_area(base, height)
            print(f"The area of the triangle is: {area}")
        elif choice == 2:
            length = get_float("Enter the length of the rectangle: ")
            width = get_float("Enter the width of the rectangle: ")
            area = rectangle_area(length, width)
            print(f"The area of the rectangle is: {area}")
        elif choice == 3:
            side = get_float("Enter the side length of the square: ")
            area = square_area(side)
            print(f"The area of the square is: {area}")
        elif choice == 4:
            radius = get_float("Enter the radius of the circle: ")
            area = circle_area(radius)
            print(f"The area of the circle is: {area}")
        elif choice == 5:
            print("Goodbye!")
            break
        else:
            print("Invalid choice. Please try again.")
if __name__ == "__main__":
    main()