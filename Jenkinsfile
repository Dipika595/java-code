pipeline {
  agent any
  stages {
    stage("Build") {
       steps {
          // Just print a Hello, Pipeline to the console
          echo "Hello, Pipeline!"
          
          sh 'javac Leapyear.java'
        
          sh 'java Leapyear'
          
       }
   }
   
 } 
} 
