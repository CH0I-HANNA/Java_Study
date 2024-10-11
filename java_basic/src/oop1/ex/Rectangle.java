package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;
    int area;
    int perimeter;
    boolean square = false;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }
}

//--------추상화---------
//문제 : 직사각형의 넓이(Area), 둘레(Perimeter), 정사각형 여부(square)를 구하는 프로그램
//속성(데이터) : int width, int height, boolean square,
//기능(메서드) : void area(), void perimeter(), void isSquare()
