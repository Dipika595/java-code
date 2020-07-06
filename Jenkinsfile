pipeline {
  agent any
  stages {
    stage("Build") {
       steps {
          // Just print a Hello, Pipeline to the console
          echo "Hello, Pipeline!"
          
         git 'https://github.com/Dipika595/java-code.git'
          sh 'javac Leapyear.java'
        
          sh 'java Leapyear'
          
       }
   }
   
 } 
} 
