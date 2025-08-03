<!-- WebContent/productForm.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Enter Product Details</title>
</head>
<body>
    <h2>Product Entry Form</h2>
    <form action="productDetails4.jsp" method="post">
        Product ID: <input type="text" name="productId" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Price: <input type="text" name="price" required><br><br>
        Quantity: <input type="text" name="quantity" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
