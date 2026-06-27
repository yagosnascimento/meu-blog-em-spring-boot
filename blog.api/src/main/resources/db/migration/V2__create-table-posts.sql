CREATE TABLE posts (
         id BIGINT NOT NULL AUTO_INCREMENT,
         titulo VARCHAR(200) NOT NULL,
         texto TEXT NOT NULL,
         usuario_id BIGINT NOT NULL,

         PRIMARY KEY (id),
         CONSTRAINT fk_posts_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);