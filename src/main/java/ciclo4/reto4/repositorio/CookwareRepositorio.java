package ciclo4.reto4.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ciclo4.reto4.interfaces.InterfaceCookware;
import ciclo4.reto4.modelo.Cookware;

@Repository
public class CookwareRepositorio {
    @Autowired
    private InterfaceCookware repository;

    public List<Cookware> getAll() {
        return repository.findAll();
    }

    public Optional<Cookware> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Cookware create(Cookware clothe) {
        return repository.save(clothe);
    }

    public void update(Cookware clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cookware clothe) {
        repository.delete(clothe);
    }

    //reto 5
    public List<Cookware> getByPriceLessThanEqual(double price){
        return repository.findByPriceLessThanEqual(price);
    }
    
    public List<Cookware> getByDescriptionContains(String description){
        return repository.findByDescriptionContainingIgnoreCase(description);
    }
}
