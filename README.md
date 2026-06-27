# meu-blog-em-spring-boot

Queria aprender mais sobre Spring Boot e Angular, por isso, fiz este blog utilizando as tecnologias mencionadas.



# Classes

2 Entidades: Usuario.java e Post.java (O espelho do banco de dados).

2 Repositories: UsuarioRepository.java e PostRepository.java (São interfaces vazias que o Spring usa para fazer os SELECT e INSERT sozinhos).

4 DTOs (Mínimo): DadosCadastroUsuario, DadosCadastroPost, DadosDetalhamentoUsuario, DadosDetalhamentoPost (Os "seguranças" que filtram o que entra e sai da internet).

2 Controllers: UsuarioController.java e PostController.java (As rotas da API).

