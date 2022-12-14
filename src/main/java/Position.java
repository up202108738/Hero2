public class Position {

    private int x;
    private int y;

    public Position() {
        x = 10; y = 10;
    }

    public Position(int x, int y){
        this.x=x;
        this.y=y;

    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Position p = (Position) o;
        return x == p.getX() && y == p.getY();
    }



}
