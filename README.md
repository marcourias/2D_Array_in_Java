# 2D_Array_in_Java

In this program I apply the 2 dimensional Array in Java. In the code, 7 methods are created.
Basically, this program is designed to capture data from the user. The data contains, name, address, age and phone of several clients.
Once the data is captured a menu is displayed, showing 6 options to the user:
Show captured data, search for data of a client (using client's id), search for data of a client (using client's name),
capture data again (replacing the captured data), show the captured data ordering by age, and an option to end the program.


## Method 1. cls
This method is just created to clear the screen according to the program usage.

## Method 2. enterContinuar
Similarly, this method just exists to stop the program at certain points, making the results of other methods readeble to the user.

## Method 3. resultados
This method prints to screen the captured Array.
To printh the Array we use 2 for loops (one to iterate the rows, the other for columns)

## Method 4. buscarId
This method searches for a value in Id column.
First, extract the ID array with help from a for loop.
Then, with another for loop, and an if statement we compare each element of the Id array with the search term. (using .equals)
In case we find the element in the array, we assign the value of i to a variable idx (this is the number of the file where the value was found)

## Method 5. buscarNombre
Similarly to buscarId, this method searches for a value, but in other column: the name of client column.

## Method 6. captura
It lets input data into the array.
We use for loop to iterate over the array, and also the scanner to accept input through the keyboard.

## Method 7. Ordena
Orders the array according the age (column) of the clients.



