package two;
import java.awt.*;

public class MyShape {
        private Shape shape;
        private Color color;
        public MyShape(java.awt.Shape shape, Color color) {
            super();
            this.shape = shape;
            this.color = color;
        }
        public java.awt.Shape getShape() {
            return shape;
        }
        public void setShape(java.awt.Shape shape) {
            this.shape = shape;
        }
        public Color getColor() {
            return color;
        }
        public void setColor(Color color) {
            this.color = color;
        }
}