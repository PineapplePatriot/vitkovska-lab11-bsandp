package ucu.edu.ua.taskthree;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ProxyImage("example.jpg");
        
        System.out.println("Image will be loaded only when display is called.");
        image.display();
    }
}
