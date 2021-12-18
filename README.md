# encryption-decryption
This is a training project from JetBrains Academy (Hyperskill).  

There are two symmetric-key encryption algorithms:  
"shift" - Caesar cipher for english letters only. Another symbols won't encrypt.  
"unicode" - Caesar cipher, which encrypts all unicode symbols.

### Usage
**Command line arguments:**  
-alg - "unicode" or "shift" (shift by default)  
-mode - "enc" or "dec"  
-key  
-data - string for encryption/decryption  
-in - the full name of a file to read data  
-out - to write data

If there is no -out argument, the app will print data to the standard output.  
If there are both -data and -in arguments, the app will prefer -data over -in.