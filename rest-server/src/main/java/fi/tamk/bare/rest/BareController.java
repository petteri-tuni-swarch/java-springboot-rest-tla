package fi.tamk.bare.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * If bare connection is not ok service will fail to start
 */
@RestController
public class BareController {

    /* curl http://localhost:8471/sample-api/1.0/id/10 */
    @RequestMapping("sample-api/1.0/id/{id}")
    public ResponseEntity<?> findById(@PathVariable int id){
        String responseText = "Requested data for id: " +  id;

        return new ResponseEntity<>(responseText, HttpStatus.OK);

        //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }

    /* curl http://localhost:8471/sample-api/1.0/info */
    @RequestMapping("sample-api/1.0/info")
    public ResponseEntity<?> infoService(){
        return new ResponseEntity<>("Sample API service 1.0", HttpStatus.OK);
    }

    @PostMapping("sample-api/1.0/post")
    public ResponseEntity<?> postService (@RequestBody PostData data) {
        System.out.println("Posted: " + data.toString());
        return new ResponseEntity<>("Data posted ... thanks", HttpStatus.OK);
    }

}
