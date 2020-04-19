package fi.tamk.bare.rest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * If bare connection is not ok service will fail to start
 */
@RestController
public class BareController {

    private Integer nrTips = 22;

    /* curl http://localhost:8471/tips-api/1.0/tips/10 */
    @RequestMapping("tips-api/1.0/tips/{id}")
    public ResponseEntity<?> findById(@PathVariable int id){
        Integer curTip = id%nrTips;
        String responseText = "Fetch text from file for the tip nr " +  curTip;

        return new ResponseEntity<>(responseText, HttpStatus.OK);

        //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }

    /* curl http://localhost:8471/tips-api/1.0/info */
    @RequestMapping("tips-api/1.0/info")
    public ResponseEntity<?> infoService(){
        return new ResponseEntity<>("Tip of the day API service 1.0", HttpStatus.OK);
    }
}
