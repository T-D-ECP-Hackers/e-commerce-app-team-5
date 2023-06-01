import React from "react";
import { order } from "../../model/orderType";
import { fetchOrders } from "../../api/fetchOrders";
import Order from "./Order";

function Orders(props: {
  orders: order[];
  setOrders: (value: ((prevState: order[]) => order[]) | order[]) => void;
}) {
  fetchOrders(props.setOrders);
  return (
    <div className="orders-container">
      {/*TODO - Task 10: mapping of orders into order components*/}
      {props.orders.map((order) => (
        <Order
          id={order.id}
          dateTimeOfOrder={order.dateTimeOfOrder}
          totalCost={order.totalCost}
          completed={order.completed}
          orderedProducts={order.orderedProducts}
          setOrders={props.setOrders}
        />
      ))}
    </div>
  );
}

export default Orders;
