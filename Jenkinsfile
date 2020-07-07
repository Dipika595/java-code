pipeline {
  agent any
  stages {
    stage("Build") {
       steps {
         
          echo "Hello, Pipeline!"
          
         bat """ 
javac Leapyear.java
java Leapyear 
 """ 
          
          
       }
   }
   
 } 
} 
