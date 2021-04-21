package Lab3;

public class Rectangle implements Shape {

	private String fillColor;
	private int borderWidth;
	private int height;
	private int width;
	private HexColorValidator hcv;
	private static final String RECTANGLE = "Rectangle";

	public Rectangle(String fillColor, int borderWidth, int height, int width) throws Exception {
		this.hcv = new HexColorValidator();
		if (hcv.validate(fillColor)) {
			this.fillColor = fillColor;
		} else
			throw new Exception(RECTANGLE + " Invalid color");

		if (borderWidth > 0) {
			this.borderWidth = borderWidth;
		} else
			throw new Exception(RECTANGLE + " Invalid Border Width");

		if (height > 0) {
			this.height = height;
		} else
			throw new Exception(RECTANGLE + " Invalid Height");

		if (width > 0) {
			this.width = width;
		} else
			throw new Exception(RECTANGLE + " Invalid Width");
	}


     @Override
	public double getArea() {
		return width * height;
	}

	@Override
	public String getName() {
		return RECTANGLE;
	}

	@Override
	public String getHexFillColor() {
		return fillColor;
	}

	@Override
	public int getBorderWidth() {
		return borderWidth;
	}

	@Override
	public void draw() {
		int i, j;
		for (i = 1; i <= height; i++) {
			for (j = 1; j <= width; j++) {
				if (i == 1 || i == height || j == 1 || j == width)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
