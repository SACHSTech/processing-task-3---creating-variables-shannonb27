import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

   

  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(4, 156, 216);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
     //question block

     
     fill(206, 169, 0);
     stroke(206, 169, 0);
     rect(i + 300, i + 250, width/13, height/13);
          
     fill(112, 53, 0);
     stroke(112, 53, 0);
     rect(i + 290, i + 290, width/6, height/33);
          
     fill(255);
     textSize(53);
    text("?", i + 310, i + 285);
  }
  
  
  float i = random(100);
}