public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    };
    
    public int[] getXYPair() {
        int[] xy = new int[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    };
    
    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance;
    };
    
    public double distance(Point point) {
        int[] pointXY = point.getXYPair();
        double distance = Math.sqrt(Math.pow(pointXY[0] - this.x, 2) + 
        Math.pow(pointXY[1] - this.y, 2));
        
        return distance;
    };
    
    public double distance() {
        double distance = Math.sqrt(Math.pow(0 - this.x, 2) + Math.pow(0 - this.y, 2));
        return distance;
    };
    
}