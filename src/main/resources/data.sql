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

--

INSERT INTO users(name, username, email, password) VALUES('user', 'user', 'user@gmail.com', '$2a$10$ZJ95pqs8zJVEaXMiyXR49unS/21S.BoDd/yfNXXtkWeJ627r5eLWm'); -- password = 123456
INSERT INTO users(name, username, email, password) VALUES('admin', 'admin', 'admin@gmail.com', '$2a$10$ZJ95pqs8zJVEaXMiyXR49unS/21S.BoDd/yfNXXtkWeJ627r5eLWm');

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);