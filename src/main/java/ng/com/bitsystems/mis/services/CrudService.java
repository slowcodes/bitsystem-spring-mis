package ng.com.bitsystems.mis.services;

import java.util.Set;

public interface CrudService<T, ID>  {

        Set<T> findAll();

        T findByID(ID id);

        T add(T object);

        void delete(T object);

        void deleteById(ID id);

        void addCommand(T object);
}
