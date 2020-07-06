pipeline {
  agent any
  stages {
    stage("Build") {
       steps {
         
          echo "Hello, Pipeline!"
          
         git 'https://github.com/Dipika595/java-code.git'
          sh 'javac Leapyear.java'
        
          sh 'java Leapyear'
          
       }
   }
   
 } 
} 
