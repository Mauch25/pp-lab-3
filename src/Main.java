import geometry.*;
    public class Main {
        public static void main(String[] args) {

            Point center = new Point(3.0, 4.0);
    
            
            ColoredCircle coloredCircle = new ColoredCircle(center, 5.0, "blue");

            
            System.out.println("Właściwości koła:");
            System.out.println("Centrum koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
            System.out.println("Promień koła: " + coloredCircle.getRadius());
            System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
            System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
            System.out.println("Kolor koła: " + coloredCircle.getColor());


        }
    }


