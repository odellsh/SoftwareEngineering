/* 
 * LAST QUESTION: Drawing a circle
 * 
 * Using simple trigonometry and some functions from the Math class, you can 
 * compute the coordinates of some large number (say, 360) of evenly spaced 
 * points around the radius of the circle in a loop:
 * for each value of theta:
 *  x = xPosition + radius * cos(theta)
 *  y = yPosition + radius * sin(theta)
 * You would then pass the resulting xCoords and yCoords arrays to 
 * canvas.drawShape(), along with the number of points and the line and fill 
 * colors.
 * 
 */


//@author Sydney O'Dell

public class MyCanvasAdapter implements MyCanvas
{
    private MyNewCanvas canvas;
    private int lineColor;
    private int fillColor;

    public MyCanvasAdapter(MyNewCanvas canvas) {
        this.canvas = canvas;
        lineColor = 0;
        fillColor = 0xFFFFFF;
    }

    public void clear() {
        canvas.clear();
    }

    public void setLineColor(int rgb) {
        lineColor = rgb;
    } 

    public void setFillColor(int rgb){
        fillColor = rgb;
    }

    public void drawSquare(int xPosition, int yPosition, int length) {
        // x and y give the top-left corner
        int[] xCoords = {xPosition, xPosition + length,
                xPosition + length, xPosition};
        int[] yCoords = {yPosition, yPosition,
                yPosition + length, yPosition + length};
        canvas.drawShape(xCoords, yCoords, 4, lineColor, fillColor);
    }

    public void drawRectangle(int xPosition, int yPosition, int topLength, int sideLength) {
        // x and y give the top-left corner
        // sideLength and topLength seem like they should be switched, but this
        // way the output matches MyOldCanvas, which is the point of the pattern
        int[] xCoords = {xPosition, xPosition + sideLength,
                xPosition + sideLength, xPosition};
        int[] yCoords = {yPosition, yPosition,
                yPosition + topLength, yPosition + topLength};
        canvas.drawShape(xCoords, yCoords, 4, lineColor, fillColor);
    }

    public void drawRightTriangle(int xPosition, int yPosition, int verticalLength,
            int horizontalLength) {
        // verticalLength and horizontalLength can be positive or negative
        int[] xCoord = {xPosition, xPosition, xPosition + verticalLength};
        int[] yCoord = {yPosition, yPosition - verticalLength, yPosition + horizontalLength};
        canvas.drawShape(xCoord, yCoord, 3, lineColor, fillColor);
    }

    public void drawTriangle (int[] xPosition, int[] yPosition) {
        // each array has 3 coordinate points for the 3 corners of the Triangle
        canvas.drawShape(xPosition, yPosition, 3, lineColor, fillColor);
    }

    public void drawLine (int xStart, int yStart, int xEnd, int yEnd) {
        int[] xCoords = {xStart, xEnd};
        int[] yCoords = {yStart, yEnd};
        canvas.drawShape(xCoords, yCoords, 1, lineColor, fillColor);
    }
}
