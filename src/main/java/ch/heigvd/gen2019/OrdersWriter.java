package ch.heigvd.gen2019;

public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");
        orders.getOrders().stream().forEach(o -> orderWriter(o, sb));

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

    public void orderWriter(Order order, StringBuffer sb){
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(order.getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");
        order.getProducts().stream().forEach(p -> p.productWriter(sb));

        if (order.getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
    }

}