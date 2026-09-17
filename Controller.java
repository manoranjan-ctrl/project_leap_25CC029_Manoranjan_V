package com.example.Company;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/emp")
public class Controller {
    Employee e;

    @GetMapping("{eid}")
    public Employee getDetails(String eid) {
        return e;
        //new Employee ("123","mothishya","CCE",9876543210l);
    }


    @PostMapping
    public String create(@RequestBody Employee e) {
        this.e = e;
        return " Created ";
    }
    @PutMapping
    public String update(@RequestBody Employee e){
        this.e=e;
        return "   Updated ";
    }
    @DeleteMapping("{eid}")
    public String delete(String eid){
        return "   deleted ";
    }


}
