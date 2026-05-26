package com.bfhl.api.controller;
import com.bfhl.api.model.BfhlRequest;
import com.bfhl.api.model.BfhlResponse;
import com.bfhl.api.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @Autowired
        private BfhlService bfhlService;

            @PostMapping
                public ResponseEntity<BfhlResponse> processData(@RequestBody BfhlRequest request) {
                        BfhlResponse response = bfhlService.processData(request);
                                return ResponseEntity.ok(response);
                                    }

                                        @GetMapping
                                            public ResponseEntity<String> getOperationCode() {
                                                    return ResponseEntity.ok("{\"operation_code\": 1}");
                                                        }
                                                        }
