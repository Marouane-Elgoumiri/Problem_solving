orders = []  # Define the variable "orders" as an empty list

def filtered(criteria):
    for element in orders:
        status_match = element.status == criteria.status
        amount_match = criteria.totalAmount.min < element.totalAmount < criteria.totalAmount.max
        date_match = criteria.createdDate.from < element.createdDate < criteria.createdDate.until
        product_match = element.items.productId in criteria.includedProducts and element.items.productId not in criteria.excludedProducts
        
        if status_match and amount_match and date_match and product_match:
            return element