# Administration Manual #

## Sofware needed ##

* Java JRE 1.8 
	* To view your current version of java, run the following command in your command promt: java -version
* Java JDK 1.8
	* To install java, run the following command in the command prompt: sudo apt-get install openjdk-7-jdk	
* Git
	* To install Git, run the following command in the command prompt: apt-get-install git
	* Then the repository needs to be cloned from GitHub
		* First right-click where you want the repository installed and select git bash
		* Then run the following command in git bash: git clone https://github.com/HR-Nightswatch/HUGB-TicTacToe.git

## Running the console aplication and Build scripts(build & deploy) ##

* To run the application, run the following command in the command prompt: ./bin/run

* To create a runnable jar file run the following command in the root of the repository using the command prompt:
	* First: ./bin/build 
	* And then: ./bin/deploy