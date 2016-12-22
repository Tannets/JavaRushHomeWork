package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int rectangle;
    private int rec;

    public Rectangle(int top, int left, int widht, int heidht) {
        this.rectangle = top + left + widht + heidht;
    }

    public Rectangle(int top, int left) {
        this.rectangle = top + left;
    }

    public Rectangle(int top, int left, int widht) {
        this.rectangle = top + left + widht;
    }

    public Rectangle() {
        this.rectangle = rec;
    }
    //напишите тут ваш код

}
