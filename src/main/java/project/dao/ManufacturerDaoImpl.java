package project.dao;

import java.util.List;
import java.util.Optional;
import project.db.Storage;
import project.lib.Dao;
import project.models.Manufacturer;

@Dao
public class ManufacturerDaoImpl implements ManufacturerDao {
    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        Storage.addManufacturer(manufacturer);
        return manufacturer;
    }

    @Override
    public Optional<Manufacturer> get(Long id) {
        return Storage.manufacturers.stream()
                 .filter(m -> m.getId().equals(id))
                 .findFirst();
    }

    @Override
    public List<Manufacturer> getAll() {
        return Storage.manufacturers;
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return Storage.manufacturers.set(Storage.manufacturers.indexOf(manufacturer), manufacturer);
    }

    @Override
    public boolean delete(Long id) {
        return Storage.manufacturers.remove(get(id).get());
    }
}
