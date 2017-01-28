# Stopwatch tasks by Nitith Chayakul
This is the results after ran the task on ASUS TP301UJ

|Task                                         |         Time|
|:--------------------------------------------|------------:|
|Append 50,000 chars to String                | 0.755086 sec|
|Append 100,000 chars to String               | 2.416397 sec|
|Append 100,000 chars to StringBuilder        | 0.002534 sec|
|Sum array of 1 billion double primitives     | 1.428403 sec|
|Sum array of 1 billion Double object         | 5.015529 sec|
|Sum array of 1 billion BigDecimal            | 9.867771 sec|

## Explanation of Results
  
### Appending
Append StringBuilder is faster than append String because append StringBuilder does not require to create entirely new String object like String.  

### Summing
Double primitive is faster than 'Double' and 'BigDecimal' because double primitive is primitives variable which is faster than object like 'Double' and 'BigDecimal' and since 'BigDecimal' require more memory than double primitive and 'Double', it is the slowest. 
  