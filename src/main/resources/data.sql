INSERT INTO todos(title, description, completed) VALUES('Todo 1', 'Description 1', 0);
INSERT INTO todos(title, description, completed) VALUES('Todo 2', 'Description 2', 0);
INSERT INTO todos(title, description, completed) VALUES('Todo 3', 'Description 3', 0);


-- @OneToMany
INSERT INTO categories (name) VALUES ('Category 1');
INSERT INTO categories (name) VALUES ('Category 2');
INSERT INTO categories (name) VALUES ('Category 3');
--
INSERT INTO products (name, price, category_id) VALUES ('Product 1', 11, 1);
INSERT INTO products (name, price, category_id) VALUES ('Product 2', 12, 2);
INSERT INTO products (name, price, category_id) VALUES ('Product 3', 13, 3);