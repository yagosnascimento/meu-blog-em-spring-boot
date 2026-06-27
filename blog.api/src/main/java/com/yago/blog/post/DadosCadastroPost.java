package com.yago.blog.post;

import com.yago.blog.usuario.Usuario;

public record DadosCadastroPost(String titulo, String texto, Usuario usuario) {
}