import datetime


def filter_and_sort_products(category, subcategory, min_price, max_price, min_stock, 
                             start_date, end_date, min_rating, max_weight, min_length, max_length, sort_by, top_n):
    
    filtered_products = []
    
    for product in products:
        restock_date = datetime.strptime(product['last_restocked_date'], '%Y-%m-%d')
        discounted_price = product['price'] * (1 - product['discount_percentage']/100)
        
        if (product['category'] == category and
            product['subcategory'] == subcategory and
            min_price <= discounted_price <= max_price and
            product['stock_quantity'] >= min_stock and
            start_date <= restock_date <= end_date and
            product['average_rating'] >= min_rating and
            product['weight_kg'] <= max_weight and
            min_length <= product['dimensions']['length_cm'] <= max_length):
                
                filtered_products.append(product)
    
    # Sort the filtered products
    sorted_products = sorted(filtered_products, key=lambda x: x[sort_by], reverse=True)
    
    # Return top N results
    return sorted_products[:top_n]

# Example usage
category = "Electronics"
subcategory = "Computer Peripherals"
min_price = 40
max_price = 200
min_stock = 30
start_date = datetime(2024, 7, 1)
end_date = datetime(2024, 7, 31)
min_rating = 4.0
max_weight = 1.0
min_length = 0  
max_length = 50 

sort_by = "average_rating"
top_n = 2

result = filter_and_sort_products(category, subcategory, min_price, max_price, min_stock, 
                                  start_date, end_date, min_rating, max_weight, 
                                  min_length, max_length, sort_by, top_n)

print(f"Top {top_n} {category} - {subcategory} products sorted by {sort_by}:")
for product in result:
    discounted_price = product['price'] * (1 - product['discount_percentage']/100)
    print(f"Name: {product['name']}, Brand: {product['brand']}, Discounted Price: ${discounted_price:.2f}, "
          f"Rating: {product['average_rating']}, Weight: {product['weight_kg']} kg, "
          f"Length: {product['dimensions']['length_cm']} cm")
