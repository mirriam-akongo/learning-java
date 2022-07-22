package com.mosh.bigo.objectoriented;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        textBox1.setText("Hey you");
        System.out.println(textBox1.text);

        TextBox textBox2 = new TextBox();
        textBox2.setText("This is box2");
        System.out.println(textBox2.text.toUpperCase());
    }
}
