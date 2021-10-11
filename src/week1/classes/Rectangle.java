package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height) {
        this.width = Math.max(width, 1);
        this.height = Math.max(height, 1);
        this.color = "Blue";
    }

    public Rectangle(int width, int height, String color) {
        this.width = Math.max(width, 1);
        this.height = Math.max(height, 1);
        this.color = color;

        int letter = this.color.charAt(0);
        boolean isUpperCase = Character.isUpperCase(letter);

        if(!isUpperCase) {
            System.out.printf("First letter Should be Uppercase");
        }

        int colorLength = this.color.length();
        if(colorLength <= 2 || colorLength >= 20) {
            System.out.printf("The color must be 2 characters long and less than 20.");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.color.charAt(0));
            }
            System.out.println();
        }
    }
}