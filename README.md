# Retail Counter RESTFul Web Services

This is REST API creating using Spring Framework and Jackson (for JSON to Java Object mapping). Application contains following REST URI to consume services.  

1. GET http://localhost:8080/restapi/product/categories  
   Returns all products category  

2. GET http://localhost:8080/restapi/product/all  
   Returns all products available with id, name, unit price and category details  
   
3. GET http://localhost:8080/restapi/product/<Product Category>  
	a. http://localhost:8080/restapi/product/CATEGORY_A  
	b. http://localhost:8080/restapi/product/CATEGORY_B  
	c. http://localhost:8080/restapi/product/CATEGORY_C  
	Returns all products for provided category with id, name, unit, price and category details  
	
4. PUT http://localhost:8080/restapi/order  
   Places order in system, accepts product id and quantity to buy and returns invoice with invoice number, all purchased product with total product price ( unit price, sales tax and total) along with gross total  
   
5. GET http://localhost:8080/restapi/order/<invoice number>  
   Return invoice for provided invoice number  
   
6. GET http://localhost:8080/restapi/order/all  
   Returns all invoices within system  
   
 
## Run Project   
clean and build project  
  mvn clean install  
  
Run application   
  mvn jetty:run  