import apcslib.*;
import java.awt.*;

public class CreateLogo
{
    // instance variables - replace the example below with your own    
        /**
     * Constructor for objects of class CreateLogo
     */
    
    public CreateLogo()
    {

    }
        
    public void displayLogo() {        
        CreateLogo create = new CreateLogo();
        
        create.setBackgroundColor();
        create.drawCircle();
        create.fillCircle();
        create.drawOutline();
        create.drawEyes();
        create.drawFeathers();
    }
    
    //sketchpad and marker
    public SketchPad poster = new SketchPad(800,800);
    public DrawingTool m = new DrawingTool(poster);
    //color getters
    public Color tan() {
        return new Color(218,165,32);
    }
    
    public Color white() {
         return new Color(255,255,255);
    }
    
    public Color darkBlue() {
        return new Color(1, 44, 97);
    }
    
    public Color darkGreen() {
        return new Color(0,79,47);
    }
    
    public void drawCircle() {
        //starting point
        m.move(0,0);

        //outer circle
        m.setColor(white());
        m.setWidth(15);
        m.drawCircle(350);
    }
    
    public void setBackgroundColor() {
        m.move(0,0);
        
        m.setColor(darkBlue());
        m.setWidth(600);
        m.drawCircle(300);

    }
    
    public void fillCircle() {
        m.move(0,0);
        
        m.setColor(darkGreen());
        m.setWidth(350);
        m.drawCircle(175);
    }
    
   
   public void drawOutline()
   {

           m.setColor(white());
           
           m.setWidth(10);
           
           m.up();
           m.move(0,200);
           m.down();
           
           m.turnRight(111.801);
           m.forward(134.629);
           m.turnLeft(21.8014);
           
           m.turnRight(63.4349);
           m.forward(55.9017);
           m.turnLeft(63.4349);
           
           m.turnRight(18.4349);
           m.forward(158.114);
           m.turnLeft(18.4349);
           
           m.turnRight(90);
           m.turnLeft(11.3099);
           m.forward(254.951);
           m.turnRight(11.3099);
           
           m.turnRight(90);
           m.turnRight(45);
           m.forward(70.7107);
           m.turnLeft(45);
           
           m.turnRight(14.0362);
           m.forward(206.155);
           m.turnLeft(14.0362);
           
           m.setDirection(180);
           m.forward(100);
           
           m.turnLeft(9.46232);
           m.forward(152.069);
           m.turnRight(9.46232);
           
           m.turnLeft(26.5651);
           m.forward(167.705);
           m.turnRight(26.5651);
           m.turnRight(90);
           
           m.turnRight(18.4349);
           m.forward(158.114);
           m.turnLeft(18.4349);
           
           m.turnLeft(116.565);
           m.forward(111.803);
           m.turnRight(116.565);
           
           m.turnRight(33.6901);
           m.forward(180.278);
           m.turnLeft(33.6901);
           
           m.turnLeft(56.3099);
           m.forward(180.278);
           m.turnRight(56.3099);
           
           m.turnRight(90);
           m.forward(150);
           m.turnLeft(90);
           
           m.turnLeft(50.5651);
           m.forward(180.278);
           
           m.turnRight(142.7651);
           
           m.turnRight(7.12502);
           m.forward(395.113);
           
        }
    
   public void drawEyes() {    
        m.setColor(white());
        m.setWidth(1);
        
        m.up();
        m.move(50, 100);
        m.down();
        m.setDirection(90);
        m.turnLeft(90);
              
        m.forward(100);
        m.setDirection(153.435);
        m.forward((double)111.803);
              
        //Thicc upper eye
        m.setWidth(5);
        m.setDirection((double)-14.0364);
        m.forward((double)206.155);
              
              
        //pupil fun stuff
        m.setWidth(2);
        m.up();
        m.move(-50, 100);
        m.down();
        m.setDirection(40);
        m.forward(30);
        
        m.up();
        m.move(-50, 100);
        m.down();
        m.setDirection(140);
        m.forward(55);
              
        m.up();
        m.move(-48,120);
        m.setWidth(10);
        m.down();
        m.drawCircle(3);
          
        
    }
    
    public void drawFeathers()
    {    
        
        m.up();    
        m.move(0,-30);
        m.setDirection(90);
       
        m.down();
        m.setColor(white());
        m.setWidth(5);
        m.turnLeft(90);
        m.forward(150);
        m.turnRight(180);
        m.turnLeft(18.4349488);
        m.forward(158.113883008);
        m.turnRight(18.4349488);
        m.turn(180);
        m.turnRight(18.4349488);
        m.forward(158.113883008);
        m.turnLeft(18.113883008);
        m.turnRight(180);
        m.turnRight(7.12501634);
        m.forward(304.1381265);
        m.turnLeft(7.12501634);
        m.turnRight(26.56);
        m.forward(111.8033);
        m.turnLeft(26.56);
        m.turnRight(90);
        m.forward(50);
        m.turnRight(90);
        m.turnRight(45);
        m.forward(70.71067811);
        m.turnLeft(45);
        m.turnLeft(11.3099324);
        m.forward(254.9509);
        m.turnRight(11.3099324);
        m.turnRight(90);
        m.turnRight(52);
        m.forward(60.71067811);}
    }