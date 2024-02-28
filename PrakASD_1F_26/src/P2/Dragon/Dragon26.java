package P2.Dragon;

public class Dragon26 {
    int x;
    int y;
    int width;
    int height;

    Dragon26(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void keKiri() {
        --this.x;
        this.printPosition();
        this.detectCollision(this.x, this.y);
    }

    void keKanan() {
        ++this.x;
        this.printPosition();
        this.detectCollision(this.x, this.y);
    }

    void keAtas() {
        --this.y;
        this.printPosition();
        this.detectCollision(this.x, this.y);
    }

    void keBawah() {
        ++this.y;
        this.printPosition();
        this.detectCollision(this.x, this.y);
    }

    void printPosition() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void detectCollision(int x, int y) {
        if (x < 0 || y < 0 || x > this.width || y > this.height) {
            System.out.println("Game Over");
            System.exit(0);
        }

    }

}
