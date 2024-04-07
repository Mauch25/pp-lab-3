import geometry.*;
    public class Main {
        public static void main(String[] args) {

            Circle[] circles = new Circle[3];
            circles[0] = new Circle(new Point(0, 0), 2.0);
            circles[1] = new ColoredCircle(new Point(3, 4), 3.0, "red");
            circles[2] = new ColoredCircle(new Point(-2, -2), 1.5, "green");
    
           
            for (Circle circle : circles) {
                double area = circle.getArea();
                System.out.println("Pole powierzchni koła: " + area);
    
              
                if (circle instanceof ColoredCircle) {
                    String color = ((ColoredCircle) circle).getColor();
                    System.out.println("Kolor koła: " + color);
                }

            Point center = new Point(3.0, 4.0);
    
            
            ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "blue");

            
            System.out.println("Właściwości koła:");
            System.out.println("Centrum koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
            System.out.println("Promień koła: " + coloredCircle.getRadius());
            System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
            System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
            System.out.println("Kolor koła: " + coloredCircle.getColor());



            Rectangle rectangle = new Rectangle(5.0, 3.0);

            // Wyświetlanie właściwości prostokąta
            System.out.println("Właściwości prostokąta:");
            System.out.println("Długość: " + rectangle.getLength());
            System.out.println("Szerokość: " + rectangle.getWidth());
            System.out.println("Pole powierzchni: " + rectangle.calculateArea());
            System.out.println("Obwód: " + rectangle.calculatePerimeter());

        }
    } 
    } 