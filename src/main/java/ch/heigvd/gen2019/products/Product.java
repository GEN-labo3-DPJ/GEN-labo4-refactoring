package ch.heigvd.gen2019.products;

public class Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private static final String[] sizes=new String[]{"XS","S", "M", "L","XL","XXL"};
    private static final String[] colors=new String[]{"blue","red","yellow"};
    private String code;
    private int color;
    private int size;
    private double price;
    private String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getSizeFor() {
        if(getSize()>sizes.length || getSize()<1)
        {
            return "Invalid Size";
        }
        else
        {
            return sizes[getSize()-1];
        }
    }

    public String getColorFor() {
        if(getColor()>colors.length || getColor()<1)
        {
            return "no color";
        }
        else
        {
            return colors[getColor()-1];
        }
    }

    public void productWriter(StringBuffer sb){
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColorFor());
        sb.append("\", ");

        if (getSize() != SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSizeFor());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }
}