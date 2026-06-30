# Spring Security – JSON Web Token (JWT) Authentication Service

## Project Objective

To construct an isolated microservice token issuance endpoint (`/authenticate`) that intercepts HTTP Basic Credentials (`Authorization: Basic <base64>`) submitted via secure client request headers, decodes the authentication payload programmatically, and returns a cryptographically signed JSON Web Token (JWT).

## Tech Stack & Implementation Layout

### 1. Project Build Dependencies (`pom.xml`)

Integrated the standard security libraries required for secure HMAC-SHA256 signing and JSON serialization:

* `io.jsonwebtoken:jjwt-api:0.11.5`
* `io.jsonwebtoken:jjwt-impl:0.11.5`
* `io.jsonwebtoken:jjwt-jackson:0.11.5`

### 2. Token Utility Service Layer (`src/main/java/com/cognizant/springlearn/security/JwtUtil.java`)

* Provisions a runtime cryptographically secure 256-bit signature key sequence (`SignatureAlgorithm.HS256`).
* Generates a token string packing structural identity settings including a 20-minute token expiration timestamp window (`exp`).

### 3. Authentication Endpoint REST Controller (`src/main/java/com/cognizant/springlearn/controller/AuthController.java`)

* Exposes the `/authenticate` gateway mapping path.
* Intercepts incoming `Authorization` metadata values using Spring's `@RequestHeader`.
* Manages runtime parsing, splits out the `Basic ` authorization type wrapper, strips out client values via standard Base64 string decoding sequences, and outputs the resulting token mapping.

## Verified System Output

### 1. Terminal Client Request & Output Response

Because Windows PowerShell treats standard `curl` commands as an alias for `Invoke-WebRequest`, the native system engine execution query requires calling `curl.exe` directly to support the standard credential parameter flag (`-u`).

**Execution Query Command:**

bash

curl.exe -s -u user:pwd http://localhost:<YOUR PORT NUMBER>/authenticate

The output will be in the JSON format
