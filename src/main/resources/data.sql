--admin - password1 =>12
--libuser1 - libuser1password
--
INSERT INTO security_user (id, username, password, first_name, last_name) VALUES
(1,  'admin', '$2y$12$V4DImPaFJN2CgfQjh1l6GO7TWO3EzWzqHVK30Y3ZW/i//Ukfg1WNa', 'Administrator', 'Adminstrator'),
(2,  'libuser1', '$2y$12$cXvXUnfpANnlIaalj6sTg.9rLzAdo/JlirYUKC3ogrV/n775sS0q6', 'Rane', 'Doe'),
(3,  'libuser2', '$2y$12$7I2JydMNsfDBedhRj9FFnOiy/C5GSRSdj2ISNdwtkQzK2DWXK.3Ti', 'Josh', 'Smith'),
(4,  'libuser3', '$2y$12$.67.satKf8nWESnFSbTGYeXpx7/3bZplU/RG278kX1l7ebZlWeqjK', 'James', 'Adams');

-- ROLES

INSERT INTO security_role (id, role_name, description) VALUES (1, 'ROLE_ADMIN', 'Administrator');
INSERT INTO security_role (id, role_name, description) VALUES (2, 'ROLE_MEMBER', 'Members');

INSERT INTO user_role(user_id, role_id) VALUES
 (1, 1), 
 (2, 2), 
 (3, 2);  
-- DATA
INSERT INTO employee (firstname, lastname, email) VALUES
  ('Lokesh', 'Gupta', 'abc@gmail.com'),
  ('Deja', 'Vu', 'xyz@email.com'),
  ('Caption', 'America', 'cap@marvel.com');