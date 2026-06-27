package com.yago.blog.post;

import com.yago.blog.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "posts")
@Entity(name = "Post")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String texto;

    // Se você não botar isso, toda vez que você buscar um Post, o infeliz do Spring vai no banco e traz os dados do Usuário junto,
    // mesmo que você só quisesse ler o título do post.
    // O LAZY (preguiçoso) avisa: "Só traga os dados do usuário se eu pedir expressamente.
    // De resto, economize a memória da máquina".
    // @JoinColumn(name = "usuario_id"): Você está apontando o dedo pra coluna do banco de dados e dizendo:
    // "A chave que liga o post ao usuário tá guardada exatamente nessa coluna aqui".
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Post(DadosCadastroPost dados) {
        this.titulo = dados.titulo();
        this.texto = dados.texto();
        this.usuario = dados.usuario();
    }
}