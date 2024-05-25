from datetime import datetime


orders = []  # Define the variable "orders" as an empty list
class Order:
    def __init__(self, status, total_amount, created_date, items):
        self.status = status
        self.total_amount = total_amount
        self.created_date = created_date
        self.items = items

class Criteria:
    def __init__(self, status, total_amount_range, created_date_range, included_products, excluded_products):
        self.status = status
        self.total_amount_range = total_amount_range
        self.created_date_range = created_date_range
        self.included_products = included_products
        self.excluded_products = excluded_products

def filtered(criteria, orders):
    filtered_orders = []
    for order in orders:
        if (
            order.status == criteria.status and
            criteria.total_amount_range[0] < order.total_amount < criteria.total_amount_range[1] and
            criteria.created_date_range[0] < order.created_date < criteria.created_date_range[1] and
            order.items.productId == criteria.included_products and
            order.items.productId not in criteria.excluded_products
        ):
            filtered_orders.append(order)
    return filtered_orders

# Example usage
orders = [
    Order("pending", 100, datetime(2022, 1, 1), {"productId": 1}),
    Order("completed", 200, datetime(2022, 2, 1), {"productId": 2}),
    Order("pending", 150, datetime(2022, 3, 1), {"productId": 3}),
]

criteria = Criteria(
    status="pending",
    total_amount_range=(100, 200),
    created_date_range=(datetime(2022, 1, 1), datetime(2022, 3, 1)),
    included_products={"productId": 1},
    excluded_products=[],
)

filtered_orders = filtered(criteria, orders)
print(filtered_orders)