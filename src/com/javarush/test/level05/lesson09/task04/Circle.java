package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int circle;
    private String circleColor;

    public Circle(int centerX, int centerY, int radius) {
        this.circle = centerX + centerY + radius;
    }
    public Circle(int centerX, int centerY, int radius, int widht) {
        this.circle = centerX + centerY + radius + widht;
    }
    public Circle(int centerX, int centerY, int radius, int widht, String color) {
        this.circleColor = centerX + centerY + radius + widht + color;
    }


}
