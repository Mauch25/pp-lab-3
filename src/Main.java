import geometry.*;
    public class Main {
        public static void main(String[] args) {

            Point center = new Point(3.0, 4.0);
    
            
            Circle circle = new Circle(center, 5.0);
    
            
            System.out.println("Właściwości koła:");
            System.out.println("Centrum koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
            System.out.println("Promień koła: " + circle.getRadius());
            System.out.println("Obwód koła: " + circle.calculatePerimeter());
            System.out.println("Pole powierzchni koła: " + circle.getArea());
        }
    }


