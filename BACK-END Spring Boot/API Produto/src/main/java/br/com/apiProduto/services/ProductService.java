package br.com.apiProduto.services;

import br.com.apiProduto.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List <Product> findAll();       // -> Busca todos os produtos
    Product save(Product product);  // -> Salva um produto
    void deleteById(Long id);       // -> Deleta um produto pelo id

}