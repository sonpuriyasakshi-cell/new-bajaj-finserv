package com.bfhl.api.model;

  import java.util.List;

  public class BfhlResponse {
      private List<String> numbers;
      private List<String> alphabets;
      private List<String> specialCharacters;
      private int sum;
      private String concatenatedString;

      public List<String> getNumbers() { return numbers; }
      public void setNumbers(List<String> numbers) { this.numbers = numbers; }

      public List<String> getAlphabets() { return alphabets; }
      public void setAlphabets(List<String> alphabets) { this.alphabets = alphabets; }

      public List<String> getSpecialCharacters() { return specialCharacters; }
      public void setSpecialCharacters(List<String> specialCharacters) { this.specialCharacters = specialCharacters; }

      public int getSum() { return sum; }
      public void setSum(int sum) { this.sum = sum; }

      public String getConcatenatedString() { return concatenatedString; }
      public void setConcatenatedString(String concatenatedString) { this.concatenatedString = concatenatedString; }
  }
