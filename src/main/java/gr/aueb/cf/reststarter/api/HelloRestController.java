package gr.aueb.cf.reststarter.api;

import gr.aueb.cf.reststarter.dto.HelloReadOnlyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public ResponseEntity<HelloReadOnlyDTO> hello() {
        HelloReadOnlyDTO helloReadOnlyDTO = new HelloReadOnlyDTO("Hello From Coding!");
//        return new ResponseEntity<>(helloReadOnlyDTO, HttpStatus.OK);
        return ResponseEntity.ok(helloReadOnlyDTO);
    }
}
