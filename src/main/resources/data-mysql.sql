TRUNCATE TABLE USUARIO;
INSERT INTO USUARIO(id, nome, email, senha) VALUES(1, 'Administrador', 'admin@email.com', '$2a$10$sFKmbxbG4ryhwPNx/l3pgOJSt.fW1z6YcUnuE2X8APA/Z3NI/oSpq');

TRUNCATE TABLE PERFIL;
INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ADMIN');

TRUNCATE TABLE USUARIO_PERFIS;
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);

TRUNCATE TABLE TIPO;
INSERT INTO TIPO(id, descricao) VALUES(1,'Aceleração');
INSERT INTO TIPO(id, descricao) VALUES(2,'Contador Permanente');
INSERT INTO TIPO(id, descricao) VALUES(3,'Cor');
INSERT INTO TIPO(id, descricao) VALUES(4,'Corrente');
INSERT INTO TIPO(id, descricao) VALUES(5,'Date');
INSERT INTO TIPO(id, descricao) VALUES(6,'Encoder');
INSERT INTO TIPO(id, descricao) VALUES(7,'Entrada analogica RB12');
INSERT INTO TIPO(id, descricao) VALUES(8,'Força');
INSERT INTO TIPO(id, descricao) VALUES(9,'Giroscópio');
INSERT INTO TIPO(id, descricao) VALUES(10,'GPS');
INSERT INTO TIPO(id, descricao) VALUES(11,'kWh');
INSERT INTO TIPO(id, descricao) VALUES(12,'Luminosidade');
INSERT INTO TIPO(id, descricao) VALUES(13,'Magnetômetro');
INSERT INTO TIPO(id, descricao) VALUES(14,'Nível');
INSERT INTO TIPO(id, descricao) VALUES(15,'Peso');
INSERT INTO TIPO(id, descricao) VALUES(16,'Potência');
INSERT INTO TIPO(id, descricao) VALUES(17,'Pressão');
INSERT INTO TIPO(id, descricao) VALUES(18,'RFId');
INSERT INTO TIPO(id, descricao) VALUES(19,'RTC');
INSERT INTO TIPO(id, descricao) VALUES(20,'Sensor4a20mA');
INSERT INTO TIPO(id, descricao) VALUES(21,'Som');
INSERT INTO TIPO(id, descricao) VALUES(22,'Temperatura');
INSERT INTO TIPO(id, descricao) VALUES(23,'Tensão');
INSERT INTO TIPO(id, descricao) VALUES(24,'Umidade');
INSERT INTO TIPO(id, descricao) VALUES(25,'Velocidade');
INSERT INTO TIPO(id, descricao) VALUES(26,'Volume');
INSERT INTO TIPO(id, descricao) VALUES(27,'Sinal');

TRUNCATE TABLE SENSOR;
INSERT INTO SENSOR(id,descricao,nome,pontos_decimais,unidade,tipo_id) VALUES (1,'Nivel crítico','sensor boia', '1', '',27);