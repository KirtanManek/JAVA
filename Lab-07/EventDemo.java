/* 4. Create interface EventListener with performEvent() method.
      Create MouseListener interface which inherits EventListener along with
      mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods.
      Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods.
      WAP to create EventDemo class which implements MouseListener and KeyListener and
      demonstrate all the methods of the interfaces. */

package java_classes;

interface EventListener {
    //performEvent Method
    void performEvent();
}

interface MouseListener extends EventListener {
    //mouseClicked Method
    void mouseClicked();

    //mousePressed Method
    void mousePressed();

    //mouseReleased Method
    void mouseReleased();

    //mouseMoved Method
    void mouseMoved();

    //mouseDragged Method
    void mouseDragged();
}

interface KeyListener extends EventListener {
    //keyPressed Method
    void keyPressed();

    //keyReleased Method
    void keyReleased();
}

//Main Class
class EventDemo implements MouseListener, KeyListener {
    //performEvent Method
    public void performEvent() {
        System.out.println("Perform Event Method");
    }

    //mouseClicked Method
    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    //mousePressed Method
    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    //mouseReleased Method
    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    //mouseMoved Method
    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    //mouseDragged Method
    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }

    //keyPressed Method
    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    //keyReleased Method
    public void keyReleased() {
        System.out.println("Key Released");
    }

    //Main Method
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}