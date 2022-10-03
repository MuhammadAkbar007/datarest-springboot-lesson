package uz.pdp.appdatarest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

//@Service
public class AddressService {

//    @Autowired
//    AddressRepository addressRepository;
//
//    public List<Address> getAll(int page, int size) {
//        Pageable pageable = PageRequest.of(page, size);
//        Page<Address> addressPage = addressRepository.findAll(pageable);
//        return addressPage.getContent();
//    }
//
//    public Address getById(Integer id) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        return optionalAddress.orElse(null);
//    }
//
//    public Address add(Address address) {
//        return addressRepository.save(address);
//    }
//
//    public Address edit(Integer id, Address address) {
//        Optional<Address> optionalAddress = addressRepository.findById(id);
//        if (!optionalAddress.isPresent()) return null;
//        Address address1 = optionalAddress.get();
//        address1.setStreet(address.getStreet());
//        address1.setCity(address.getCity());
//        return addressRepository.save(address1);
//    }
//
//    public boolean delete(Integer id) {
//        try {
//            addressRepository.deleteById(id);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
