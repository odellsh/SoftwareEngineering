
/**
 * The Client Class uses the legacy MyCanvas class.
 * 
 * @author Sydney O'Dell 
 * @version 0.1
 */
public class Client
{

    static public void main(String[] args) {
        MyNewCanvas newCanvas = new MyNewCanvas();
        MyCanvasAdapter canvas = new MyCanvasAdapter(newCanvas);

        canvas.clear();
        canvas.setLineColor(37);
        //canvas.drawSquare(20, 40, 50);
        //canvas.drawRectangle(15, 35, 18, 36);
        canvas.setFillColor(99);

        canvas.drawTriangle(new int[] {10, 20, 30}, new int[] {0, 40, 0});
        canvas.drawLine(50, 70, 10, 49);
        canvas.drawRightTriangle(88, 52, 20, -10);
    }
}
