package br.org.edu.ifrn.LojaUsuario.repository;

import br.org.edu.ifrn.LojaUsuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}