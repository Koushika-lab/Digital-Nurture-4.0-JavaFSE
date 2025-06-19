class Product:
    def __init__(self, productId, productName, category):
        self.productId = productId
        self.productName = productName
        self.category = category

    def __repr__(self):
        return f"{self.productName} ({self.category})"
products = [
    Product(101, "Laptop", "Electronics"),
    Product(102, "Chair", "Furniture"),
    Product(103, "Camera", "Electronics"),
    Product(104, "Shoes", "Fashion"),
    Product(105, "Smartphone", "Electronics")
]
#Linear Search-Time Complexity-O(n)
def linear_search(products, target_name):
    for product in products:
        if product.productName.lower() == target_name.lower():
            return product
    return None
#binary search if only for sorted values-Time Complexity-O(nlogn)
def binary_search(products, target_name):
    products.sort(key=lambda x: x.productName.lower())
    print("Sorted products list-",end='')
    print(products)  
    low,high=0,len(products)-1
    while low <= high:
        mid = (low + high) // 2
        mid_name = products[mid].productName.lower()
        if mid_name == target_name.lower():
            return products[mid]
        elif mid_name < target_name.lower():
            low = mid + 1
        else:
            high = mid - 1
    return None
# Checking with an example
print("Actual products list-",products)
print("Linear Search:", linear_search(products, "Shoes"))
print("Binary Search:", binary_search(products, "Shoes"))
