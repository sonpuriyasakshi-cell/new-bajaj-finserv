package com.bfhl.api.service;

import com.bfhl.api.model.BfhlRequest;
import com.bfhl.api.model.BfhlResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public BfhlResponse processData(BfhlRequest request) {
              List<String> data = request.getData();

        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialChars = new ArrayList<>();
        int sum = 0;
        StringBuilder concat = new StringBuilder();

        for (String item : data) {
            if (item.matches("-?[0-9]+")) {
                numbers.add(item);
                sum += Integer.parseInt(item);
                concat.append(item);
            } else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item);
                concat.append(item);
            } else {
                specialChars.add(item);
                concat.append(item);
            }
        }

        BfhlResponse response = new BfhlResponse();
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);
        response.setSpecialCharacters(specialChars);
        response.setSum(sum);
        response.setConcatenatedString(concat.toString());
        return response;
    }
}
