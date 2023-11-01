package br.com.criandoapi.projeto.repository;

import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//Essa interface extend esse Repositório e traz alguns métodos que serão usados para acessar o banco
public interface IUsuario extends JpaRepository<Usuario, Integer> {
}
