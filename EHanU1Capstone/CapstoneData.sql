-- Select * from game_store_test.sales_tax_rate;
SELECT * from game_store_test.sales_tax_rate;

-- also inserted into game_store_test.sales_tax_rate

INSERT INTO game_store_test.sales_tax_rate (state, rate)
Values 
('AL', .05),
('AK', .06),
('AZ', .04), 
('AR',  .06),
('CA', .06),
('CO', .04),
('CT',  .03), 
('DE', .05),
('FL', .06),
('GA', .07), 
('HI', .05), 
('ID', .03), 
('IL', .05), 
('IN', .05), 
('IA', .04), 
('KS', .06), 
('KY', .04),
('LA', .05), 
('ME', .03), 
('MD', .07), 
('MA', .05), 
('MI', .06), 
('MN', .06), 
('MS', .05), 
('MO', .05), 
('MT', .03),
('NE', .04),
('NV', .04), 
('NH', .06), 
('NJ', .05), 
('NM', .05), 
('NY', .06), 
('NC', .05), 
('ND', .05), 
('OH', .04), 
('OK', .04), 
('OR', .07), 
('PA', .06), 
('RI', .06), 
('SC', .06), 
('SD', .06), 
('TN', .05),
('TX', .03), 
('UT', .04), 
('VT', .07), 
('VA', .06), 
('WA', .05), 
('WV', .05), 
('WI', .03),
('WY', .04); 

-- Processing Fee
SELECT * FROM game_store.processing_fee; 

 INSERT INTO game_store_test.processing_fee (product_type, fee)
 Values
 ('Consoles', 14.99), 
 ('T-Shirts', 1.98), 
 ('Games', 1.49); 





