pipeline {
  stages {
    stage('Build') {
       steps {
          // Just print a Hello, Pipeline to the console
          echo "Hello, Pipeline!"
          // Compile a Java file. This requires JDKconfiguration from Jenkins
          javac Leapyear.java
          // Execute the compiled Java binary called HelloWorld. This requires JDK configuration from Jenkins
          java Leapyear
          // Executes the Apache Maven commands, clean then package. This requires Apache Maven configuration from Jenkins
          //mvn clean package ./HelloPackage
          // List the files in current directory path by executing a default shell command
          sh "ls -ltr"
       }
   }
   // And next stages if you want to define further...
 } // End of stages
} 
