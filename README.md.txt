This is a simple maven project 

Here we have 5 modules

In this project the Client project takes input from client (customer) gives that input to A ,
A to B to C ,

C gives response back to B to A to ClientProject.

And finally we convert all that modules into a war file is that in TestWar module

Above Modules dependencies are as like follows

Client Project ->Depends on A

Project A      ->Depends on B	

Project B      ->Depends on C

Project C      ->Depends on B  

TestWar        ->Depends on C(may be all the modules indirectly)