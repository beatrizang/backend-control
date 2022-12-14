
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (1,"Garcia","Beatriz","1996-03-30");
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (2,"Garcia","Juan","1962-01-20");
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (3,"Angelicola","Marisa","1973-05-20");
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (4,"Garcia","Beatriz","1996-03-30");
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (5,"Garcia","Alberto","2002-06-09");
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (6,"Decima","Alcira","1935-11-25");
INSERT INTO Personas (id_persona,apellido,nombre,fecha_nac) VALUES (7,"Angelicola","Alicia","1970-04-08");


INSERT INTO `usuarios` (username,password,enabled) VALUES ('beatriz','$2a$10$EfSWriHTLFlllKTEG5p3jOKELBnRYaDiWxfKUV.kpNCCOaPlQGmB6',1);
INSERT INTO `usuarios` (username,password,enabled) VALUES ('admin','$2a$10$JCv6PeVAU5PcqGIGbrRsv.rMmqPLU.NIYBfYa3U9SmGPi/rIJgnFm',1);

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id,rol_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id,rol_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id,rol_id) VALUES (2,1);

INSERT INTO Controles (id_control,id_persona,fecha,peso,grasa,imc,musculo,calorias,edad_metabolica,visceral) VALUES (1,1,"2022-03-14",72.7,26.7,40.8,25.4,1428,40,6);
INSERT INTO Controles (id_control,id_persona,fecha,peso,grasa,imc,musculo,calorias,edad_metabolica,visceral) VALUES (2,1,"2022-03-16",73.3,26.9,40.4,25.8,1437,41,6);



