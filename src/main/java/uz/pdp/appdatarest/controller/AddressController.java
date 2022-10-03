package uz.pdp.appdatarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appdatarest.entity.Address;
import uz.pdp.appdatarest.service.AddressService;

import java.util.List;

//@RestController
//@RequestMapping("/api/address")
public class AddressController {

//    @Autowired
//    AddressService addressService;
//
//    @GetMapping
//    public ResponseEntity<?> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
//        List<Address> addressList = addressService.getAll(page, size);
//        return ResponseEntity.ok(addressList);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getById(@PathVariable Integer id) {
//        Address address = addressService.getById(id);
//        return ResponseEntity.status(address != null ? 200 : 409).body(address);
//    }
//
//    @PostMapping
//    public ResponseEntity<?> add(@RequestBody Address address) {
//        Address savedAddress = addressService.add(address);
//        return ResponseEntity.status(201).body(savedAddress);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> edit(@PathVariable Integer id, @RequestBody Address address) {
//        Address edited = addressService.edit(id, address);
//        return ResponseEntity.status(edited != null ? 202 : 409).body(edited);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable Integer id) {
//        boolean deleted = addressService.delete(id);
//        if (deleted) return ResponseEntity.noContent().build();
//        return ResponseEntity.notFound().build();
//    }
}
