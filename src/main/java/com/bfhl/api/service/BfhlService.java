package com.bfhl.api.service;

import com.bfhl.api.model.BfhlRequest;
import com.bfhl.api.model.BfhlResponse;

public interface BfhlService {
    BfhlResponse processData(BfhlRequest request);
    }
