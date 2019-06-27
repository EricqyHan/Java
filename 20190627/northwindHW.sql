Select * from northwind.products;
/*1.  What are the categories  of products in the database?
Select category from northwind.products;

select * from northwind.products where product_name like "%Dell%"; 
/*2. What products are made by dell? The Dell Inspiron Laptop is made by dell */
Select * from northwind.products where product_name like '%Dell%'; 

/* 3. List all the orders shipped to pennsylvania*/ 
Select * from northwind.orders where ship_state = 'Pennsylvania'; 

/* 4. List the first name and last name of all employees with last names that start with w */
Select * from northwind.employees where last_name like 'W%';

/*5. List all customers from zipcodes that start with 55 */
Select * from northwind.customers where postal_code like '55%';

/*6 List all customers from zipcodes that end with 0 */
Select * from northwind.customers where postal_code like '%0';

/*7. List the first name, last name, and email for all customers with a .org email address */
Select first_name, last_name, email  from northwind.customers where email like '%.org';

/* 8. List the first name, last name, and phone number for all customers from the 202 area code */ 
Select first_name, last_name, phone from northwind.customers where phone like '%202%';

/* 9. List the order id for each order placed by George Wilson */ 
Select * from northwind.orders;
Select * from northwind.order_details;
Select * from northwind.customers;
Select * from northwind.products;
Select * from northwind.customers where first_name = 'George' && last_name = 'Wilson'; 



/* 10. List all the products and quantities associated with order 4003 */ 
Select * from northwind.order_details;
Select * from northwind.products;

SELECT order_detail.product_id;

Select 










