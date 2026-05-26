# Acropolis Campus Hiring — BFHL API

## POST /bfhl

Accepts a JSON body with a `data` array, returns categorized numbers, alphabets, special characters, sum, and concatenated string.

## Run Locally

```bash
mvn clean package
java -jar target/acropolis-bfhl.jar
```

Then test: `curl -X POST http://localhost:8080/bfhl -H "Content-Type: application/json" -d '{"data": ["a","1","334","4","R","$"]}'`

## Run Tests

```bash
mvn test
```

## Deploy on Render

1. Push to GitHub
2. Go to render.com → New → Web Service → Connect repo
3. Auto-detects Dockerfile → Deploy
4. Submit URL: `https://your-app.onrender.com/bfhl`
