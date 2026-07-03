package eu.frezilla.money.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/total")
public class TotalController {

    private TotalRecord currentTotalRecord;

    public TotalController() {
        currentTotalRecord = new TotalRecord(0);
    }

    @GetMapping
    public ResponseEntity<TotalRecord> getTotal() {
        return ResponseEntity.ok(currentTotalRecord);
    }

    @PutMapping(value = "/update", consumes = "application/json")
    public ResponseEntity<TotalRecord> updateTotal(@RequestBody TotalRecord total) {
        currentTotalRecord = total;
        return ResponseEntity.ok(currentTotalRecord);
    }
}
