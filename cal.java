

class Calculator {
    final double PI = 3.14;
    double area, circum, vol, saos, peri; 
    java.util.Scanner sc=new java.util.Scanner(System.in); 
    
public void areaOfTriangle() {
         System.out.println("Enter Base: ");
        int b = sc.nextInt();
        System.out.println("Enter Height: ");
         int h = sc.nextInt();
        area =  ( b * h) / 2 ;
        System.out.println("Area of Triangle is " +area);
    }

    public void perimeterOfRectangle() {
        System.out.println("Enter Length: ");
        int l = sc.nextInt();
        System.out.println("Enter Width: ");
         int w = sc.nextInt();
        peri = (l+w)*2;
        System.out.println("Area of Rectangle is " +peri);
    }

     public void areaOfEquilateralTriangle() {
        System.out.println("Enter Side: ");
        int s = sc.nextInt();
        area = ( 1.73 * s * s)/4 ;;
        System.out.println(" Area Of Square" +area);
    }
    
   public void areaOfRightAngleTriangle() {
         System.out.println("Enter Base: ");
        int b = sc.nextInt();
        System.out.println("Enter Height: ");
         int h = sc.nextInt();
        area =  ( b * h) / 2 ;
        System.out.println("Area of Triangle is " +area);
    }

   public void areaOfSquare() {
        System.out.println("Enter Side: ");
        int s = sc.nextInt();
        area = s*s  ;
        System.out.println(" Area Of Square" +area);
    }

     public void surfaceAreaOfSphere() {
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();
        saos =4*PI * r * r ;
        System.out.println("Surface Area Of Sphere " +saos);
    }

     public void volumeOfSphere() {
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();
        vol =(4/3)*PI * r * r * r ;
        System.out.println("Volume of Sphere is " +vol);
    }

    public void areaOfRectangle() {
        System.out.println("Enter Length: ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth: ");
         int b = sc.nextInt();
        area = l * b ;
        System.out.println("Area of Rectangle is " +area);
    }

    public void areaOfCircle() {
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();
        area = PI * r * r;
        System.out.println("Area of circle is " +area);
    }

    public void circumOfCircle() {
        System.out.println("Enter Radius: ");
        int r = sc.nextInt();
        circum = 2 * PI * r;
        System.out.println("Circumference of circle is " +circum);
    }
}
class MyJava{
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while(true){ 
        System.out.println("1. Area of circle ");
        System.out.println("2. Circumference of circle  ");
        System.out.println("3. Area of rectangle ");
        System.out.println("4. Volume of Sphere ");
        System.out.println("5. Surface Area of Sphere ");
        System.out.println("6. Area of Square ");
        System.out.println("7. Area of Right Angled Triangle");
        System.out.println("8. Area of Equilateral Triangle");
        System.out.println("9. Perimeter Of Rectangle");
        System.out.println("10. Area Of Triangle");
        System.out.println("0. Exit ");
        System.out.println("Enter any choice:  ");

        int ch=sc.nextInt();
        if (ch==1){
            obj.areaOfCircle();
        }
         else if(ch==2){
            obj.circumOfCircle();
        }
        else if(ch==3){
            obj.areaOfRectangle();
        }
        else if(ch==4){
            obj.volumeOfSphere();
        }
        else if(ch==5){
            obj.surfaceAreaOfSphere();
        }
        else if(ch==6){
            obj.areaOfSquare();
        }
        else if(ch==7){
            obj.areaOfRightAngleTriangle();;
        }
        else if(ch==8){
            obj.areaOfEquilateralTriangle();;
        }
        else if(ch==9){
            obj.perimeterOfRectangle();
        }
        else if(ch==10){
            obj.areaOfTriangle();
        }
           else if(ch==0){
            System.exit(0);
        }

    }
}

}