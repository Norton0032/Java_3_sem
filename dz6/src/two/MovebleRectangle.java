package two;

import java.util.Scanner;

public class MovebleRectangle implements Moveble {
private MoveblePoint topleft;
private MoveblePoint downright;

public MovebleRectangle(int x1,int y1, int x2,int y2, int Speed1, int Speed2) {
    Scanner scan = new Scanner(System.in);
    while(true){
        if (pr(Speed1,Speed2)) break;
        else{
            System.out.println("Скорость 1 и 2 точки не равны, введите повторно: ");
            Speed1 = scan.nextInt();
            Speed2 = scan.nextInt();
        }
    }
    topleft = new MoveblePoint(x1,y1,Speed1,Speed1);
    downright = new MoveblePoint(x2,y2,Speed2,Speed2);
}
        public void MoveUp() {
            topleft.MoveUp();
            downright.MoveUp();
        }
        public void MoveDown() {
            topleft.MoveDown();
            downright.MoveDown();
        }
        public void MoveRight() {
            topleft.MoveRight();
            downright.MoveRight();
        }
        public void MoveLeft() {
            topleft.MoveLeft();
            downright.MoveLeft();
        }
        public boolean pr(int x, int y){
            if(x==y) return true;
            else return false;
    }
    @Override
    public String toString() {
        return "MovebleRectangle{" +
                "topleft=" + topleft +
                ", downright=" + downright +
                '}';
    }
}